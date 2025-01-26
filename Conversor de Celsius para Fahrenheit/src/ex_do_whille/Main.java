package ex_do_whille;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//CONVERSOR DE CELSIUS PARA FAHRENHEIT
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== CONVERSOR DE CELSIUS PARA FAHRENHEIT === \n");
		
		char resp;
		
		do  {
			System.out.println("==".repeat(30));
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0; // Formula de Conversao
			
			System.out.printf("Celsius: (%.1fºC) é Equivalente em Fahrenheit: %.1f%n", C, F);
			
			System.out.print("Deseja perguntar novamente? (S para SIM e N para NAO): \n");
			resp = sc.next().charAt(0);
		} while (resp != 'N');
		
		System.out.println("==".repeat(30));
		System.out.println("=== FIM DO PROGRAMA :D ===");
		
		sc.close();
		

	}

}
