package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product() {

	}

	public Product(String name, double price, int quantity) {
		this.setName(name);
		this.setPrice(price);
		this.quantity = 0;
	}

	public Product(String name, double price) {
		this.setName(name);
		this.setPrice(price);
		this.quantity = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name.toUpperCase();
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	
	public double totalValueInStock() {
		return this.price * this.quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "Name: " + this.name + ", Unit price: $ " + String.format("%.2f", this.price) + ", Quantity: "
				+ this.quantity + ", Total amount: $ " + String.format("%.2f", totalValueInStock());
	}
}
