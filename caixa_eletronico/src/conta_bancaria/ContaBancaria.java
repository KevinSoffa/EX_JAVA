package conta_bancaria;
import java.util.Scanner;


public class ContaBancaria {
	private double saldo;
	private String usuario;
	private String senha;
	
	public ContaBancaria(String usuario, String senha, double saldoInicial) {
		this.usuario = usuario;
		this.senha = senha;
		this.saldo = saldoInicial;
	}
	
	public boolean authenticar(String usuario, String senha) {
		return this.usuario.equals(usuario) && this.senha.equals(senha);
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Deposito realizado com sucesso! Novo saldo: R$ " + saldo);
		} else {
			System.out.println("ERRO!!! Valor invalido para depositar");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + saldo);
		} else {
			System.out.println("Saldo insuficiente ou valor invalido. :(");
		}
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual: R$ " + saldo);
	}
}

