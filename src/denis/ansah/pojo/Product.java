package denis.ansah.pojo;



public class Product {
	private String name;
	private ProductType type;
	private Double price;
	
	public Product() { }
	
	public Product(String name, ProductType type, Double price) { 
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public ProductType getType() {
		return type;
	}
	public Double getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(ProductType type) {
		this.type = type;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
