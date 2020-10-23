package denis.ansah.pojo;

import java.util.ArrayList;
import java.util.List;

public class Utils {
 public static List<Product> createBooks() {
	 List<Product> books = new ArrayList<Product>();
	 books.add(new Product("Java Servlet Programming", ProductType.BOOK, 1.99));
	 books.add(new Product("Oracle Database Programming", ProductType.BOOK, 2.99));
	 books.add(new Product("System Analysis and Design with UML", ProductType.BOOK, 3.99));
	 return books;
 }
 
 public static List<Product> createMusic() {
	 List<Product> songs = new ArrayList<Product>();
	 songs.add(new Product("I'm going to tell you a secret by madonna", ProductType.MUSIC, 4.99));
	 songs.add(new Product("Baby one more time by Britney Spears", ProductType.MUSIC, 5.99));
	 songs.add(new Product("Justified by Justin Timberlake", ProductType.MUSIC, 6.99));
	 return songs;
 }
 
 public static List<Product> createComputers() {
	 List<Product> computers = new ArrayList<Product>();
	 computers.add(new Product("Apple MacBook Pro with 13.3' Display", ProductType.COMPUTER, 7.99));
	 computers.add(new Product("Asus Laptop with Centrino 2 Black", ProductType.COMPUTER, 8.99));
	 computers.add(new Product("HP Pavillion Laptop with Centrino 2 DV7", ProductType.COMPUTER, 9.99));
	 return computers;
 }
 
}
