package Exercicio1;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		System.out.println("Digite a senha da conta: ");
		String senha = scn.next();
		cc.defineSenha(senha);
		
		cc.setNumero("111");
		cc.setSaldo(5000);
		System.out.println("\nCONTA CORRENTE");
		System.out.println("Digite o valor do depósito: ");
		int valor = scn.nextInt();
		cc.deposita(valor);
		System.out.println("Digite o valor do saque: ");
		valor = scn.nextInt();
		cc.saca(valor);
		
		cp.setNumero("222");
		cp.setSaldo(3500);
		System.out.println("\nCONTA POUPANÇA");
		System.out.println("Digite o valor do depósito: ");
		valor = scn.nextInt();
		cp.deposita(valor);
		System.out.println("Digite o valor do saque: ");
		valor = scn.nextInt();
		cp.saca(valor);
		
		cc.tiraExtrato();
		cp.tiraExtrato();
		
		System.out.println("Digite a nova senha da conta: ");
		String novaSenha = scn.next();
		cc.alteraSenha(novaSenha);
		
		scn.close();
		
	}
}
