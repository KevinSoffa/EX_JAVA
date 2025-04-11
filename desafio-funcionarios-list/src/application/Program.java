package application;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("KVN -- CLT");
		System.out.println("=~".repeat(20));
		System.out.println("Quantos funcionarios vão ser registrados? ");
		
		
		// CRIANDO LISTA COM FUNCIONARIOS
		List<Employee> list = new ArrayList<>();
		
		int N = sc.nextInt();
		System.out.println("--".repeat(20));
		
		for (int i=0; i<N; i++) {
			
			System.out.println("Employee #" + (i + 1)+ ":" );
			System.out.print("id: ");
			Integer id = sc.nextInt();
			
			//Limpando
			sc.nextLine();
			
			System.out.println("Nome: ");
			String name = sc.nextLine();

			
			System.out.println("Salario: ");
			Double salary = sc.nextDouble();
			
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			System.out.println("--".repeat(20));		
		}
		
		// CRIANDO LOGICA PARA AUMENTO DE SALARIO
		System.out.println("Digite o 'id' do funcionario que vai receber o aumento [ R$ ]: "); // Procurando funcionario
		int idsalary = sc.nextInt();
		
		Integer pos = position(list, idsalary);
		
		if (pos == null) {
			System.out.println("ERRO - Este ID nao existe");
		}
		else {
			System.out.println("Digite a porcentagem de aumento [ % ]: ");
			double percent = sc.nextDouble();
			
			list.get(pos).increaseSalary(percent);
			
		}
		
		System.out.println("=~".repeat(20));
		System.out.println("=== Lista de Funcionarios ===");
		
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		
		sc.close();

	}
	
	// FUNCAO AUXILIAR PARA PROCURAR O [ ID ]
	public static Integer position(List<Employee> list, int id) {
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		
		return null;
	}

}
