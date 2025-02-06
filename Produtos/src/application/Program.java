package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// Mensagem para o usuário
		System.out.println("=== INSTRUMENTOS MUSICAIS ===");
		
		// Armazenando informacoes do produto
		System.out.println("Nome: ");
		String name = sc.nextLine();
		
		System.out.println("Preco: R$ ");
		double price = sc.nextDouble();
		
		System.out.println("Quantidade em Estoque: ");
		int quantity = sc.nextInt();
		
		// Instanciando a Classe
		Product product = new Product(name, price, quantity);
		
		System.out.println("~=".repeat(40));
		
		System.out.println("==Estoque: " + product);
		System.out.println("~=".repeat(40));
		
		System.out.print("Quantidade para adicionar ao produto: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("~=".repeat(40));
		System.out.println("==Estoque Atualizado: " + product);
		System.out.println("~=".repeat(40));
		
		System.out.print("Quantidade de saida do produto: ");
		int quantityExit = sc.nextInt();
		product.removeProducts(quantityExit);
		
		System.out.println("~=".repeat(40));
		System.out.println("==Estoque Atualizado: " + product);
	
		sc.close();

	}

}
