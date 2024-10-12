package entities;

public class Product {
	// Atributos
	private String name;
	private Double price;
	
	// Método Getter e Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	// Método Construtor
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		
	}
	
	// Método
	
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
