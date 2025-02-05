package application;

import Salario.Salario;
import java.util.Locale; 
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		System.out.println("=== DESCONTO DE SALARIO ===");
		System.out.println("~=".repeat(40));
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario emp = new Salario();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Salario: ");
		emp.salario = sc.nextDouble();
		System.out.print("Taxa: ");
		emp.taxa = sc.nextDouble();
		
		System.out.println("Salario: " + emp);
		System.out.println("~=".repeat(40));
		
		System.out.println("Qual a porcentagem do Beneficio: ");
		double porcentagem = sc.nextDouble();
		System.out.println(porcentagem + "%");
		
		emp.salario_beneficio(porcentagem);
		
		System.out.println("~=".repeat(40));
		System.out.println("Salario Liquido: " + emp);
		
		sc.close();

	}

}
