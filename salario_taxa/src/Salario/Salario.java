package Salario;

public class Salario {
		
		public String name;
		public double salario;
		public double taxa; // PT gosta
		
		public double salario_liquido() {
			return salario - taxa;
		}
		
		public void salario_beneficio(double porcentagem) {
			salario += salario * porcentagem / 100;
		}
		
		public String toString() {
			return name + " - R$ " + String.format("%.2f", salario_liquido());
		}

}
