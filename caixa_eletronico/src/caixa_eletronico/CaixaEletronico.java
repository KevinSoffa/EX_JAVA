package caixa_eletronico;
import conta_bancaria.ContaBancaria;
import java.util.Scanner;


public class CaixaEletronico {

	public static void main(String[] args) {
		System.out.println("==".repeat(20));
		System.out.println("          BANCO DO KEVIN EM JAVA");
		System.out.println("==".repeat(20));
		
		Scanner scanner = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria("Kevin", "1234", 1000.0);
		
		System.out.print("Usuario: ");
		String user = scanner.next();
		
		System.out.println("Senha: ");
		String pass = scanner.next();
		
		if (conta.authenticar(user, pass)) {
			int opcao;
			do {
				System.out.println("\n1. Consultar Saldo\n2. Depositar\n3. Sacar\n4. Sair");
				System.out.println("Escolha uma opcao: ");
				opcao = scanner.nextInt();
				
				switch (opcao) {
					case 1:
						System.out.println("--".repeat(20));
						conta.consultarSaldo();
						System.out.println("--".repeat(20));
						break;
					case 2:
						System.out.println("--".repeat(20));
						System.out.println("Valor do deposito: R$ ");
						double depositar = scanner.nextDouble();
						conta.depositar(depositar);
						System.out.println("--".repeat(20));
						break;
					case 3:
						System.out.println("--".repeat(20));
						System.out.println("Valor do saque: R$ ");
						double saque = scanner.nextDouble();
						conta.sacar(saque);
						System.out.println("--".repeat(20));
						break;
					case 4:
						System.out.println("Saindo... :D");
						break;
					default:
						System.out.println("Opcao Invalida");
				}
			} while (opcao != 4);
		} else {
			System.out.println("Usuario ou senha incorretos.");
		}
		
		scanner.close();
	}

}
