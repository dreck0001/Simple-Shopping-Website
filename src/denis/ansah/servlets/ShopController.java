package denis.ansah.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import denis.ansah.pojo.Product;
import denis.ansah.pojo.Utils;

/**
 * Servlet implementation class ShopController
 */
public class ShopController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        HttpSession session = request.getSession();
		List<Product> products = new ArrayList<Product>();
		for (Product product : Utils.createBooks()) { products.add(product); }
		for (Product product : Utils.createMusic()) { products.add(product); }
		for (Product product : Utils.createComputers()) { products.add(product); }
		Set<Product> cartProducts = (HashSet<Product>)session.getAttribute("cartProducts");
        if(cartProducts == null) { session.setAttribute("cartProducts", new HashSet<Product>()); }
        String view = request.getParameter("view");
        if (view.equals("login")) { response.sendRedirect("index.html"); } 
        else if (view.equals("logout")) {
        	session.invalidate();
        	response.sendRedirect("index.html");
        }
        else if (view.equals("books")){
			request.setAttribute("books", Utils.createBooks());
			request.getRequestDispatcher("/booksView.jsp").forward(request, response);
		}
        else if (view.equals("music")){
			request.setAttribute("songs", Utils.createMusic());
			request.getRequestDispatcher("/musicView.jsp").forward(request, response);
		}
        else if (view.equals("computers")){
			request.setAttribute("computers", Utils.createComputers());
			request.getRequestDispatcher("/computersView.jsp").forward(request, response);
		}
        else if (view.equals("addToCart")) {
        	System.out.println("    addToCart");
       	 	List<Product> addedProducts = new ArrayList<Product>();
        	String[] names = request.getParameterValues("name");
            if(names != null && names.length > 0){
            	for(String name: names) {
            		System.out.println("        " + name);
            		for(Product product: products) {
                		System.out.println("            " + product);
            			if(product.getName().contains(name)) {
            				cartProducts.add(product);
            				addedProducts.add(product);
            			}
            		}
            	}
//    			request.setAttribute("cartProducts", cartProducts);
    			request.setAttribute("addedProducts", addedProducts);
            	RequestDispatcher dispatcher = request.getRequestDispatcher("/productsAdded.jsp");
            	dispatcher.forward(request, response);
            } else {
				//redirect to error page or show alert
            	RequestDispatcher dispatcher = request.getRequestDispatcher("/NoProductsAdded.html");
            	dispatcher.forward(request, response);
			}
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
