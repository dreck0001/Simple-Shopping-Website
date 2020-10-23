package denis.ansah.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginController
 */
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String operation = request.getParameter("operation");

		if (username.equals("denis") || username.equals("Denis") && password.equals("qqqqqq")) {
			System.out.println("    valid account");
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			Cookie usernameCookie = new Cookie("username", username);
			Cookie passwordCookie = new Cookie("password", password);
			usernameCookie.setMaxAge(300); //5min session
			passwordCookie.setMaxAge(300);
			response.addCookie(usernameCookie);
			response.addCookie(passwordCookie);

            response.sendRedirect("storeMenu.jsp");

		} else { 
			System.out.println("    invalid account"); 
            response.sendRedirect("loginError.html");
		}
	}

}
