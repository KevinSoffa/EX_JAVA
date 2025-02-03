package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Instanciando a Classe
		Product product = new Product();
		
		// Mensagem para o usuário
		System.out.println("=== INSTRUMENTOS MUSICAIS ===");
		
		// Armazenando informacoes do produto
		System.out.println("Nome: ");
		product.name = sc.nextLine();
		
		System.out.println("Preco: R$ ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantidade em Estoque: ");
		product.quantity = sc.nextInt();
		
		 System.out.println("~=".repeat(40));
		
		System.out.println("==Estoque: " + product);
		System.out.println("~=".repeat(40));
		
		System.out.print("Quantidade para adicionar ao produto: ");
		int quantity = sc.nextInt();
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
