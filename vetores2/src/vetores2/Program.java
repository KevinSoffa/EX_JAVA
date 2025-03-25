package vetores2;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        Product[] vect = new Product[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o nome do produto:");
            String name = sc.nextLine();
            System.out.println("Digite o preço do produto:");
            double price = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Product(name, price);
        }
        
        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
        	sum += vect[i].getPrice();
        }
        
        double avg = sum / vect.length;
        
        System.out.printf("AVEREGE PRICE = %.2f%n", avg);
        
        sc.close();
    }

}
