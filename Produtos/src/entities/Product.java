package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	//Construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// funcao para calcular o valor total de produtos
	public double totalValueInStock() { 
		return price * quantity;
	}
	
	// funcao para add produtos
	public void addProducts(int quantity) {
		this.quantity += quantity; // THIS é para referenciar a variavel da CLASS
	}
	
	// funcao para remover produtos
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// funcao para print [ CONCATENANDO... ]
	public String toString() {
		return name
				+ " - R$ "
				+ String.format("%.2f", price) // Ajustando formatacao
				+ " - "
				+ quantity
				+ " uidades - Total em estoque: R$ "
				+ String.format("%.2f", totalValueInStock()); 
	}
}
