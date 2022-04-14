package Exercicio1;

import java.util.Scanner;

public abstract class ContaBancaria {
	
	String senha, novaSenha;
	
	protected void defineSenha(String senha) {
		this.senha = senha;
	}
	protected void alteraSenha(String novaSenha) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Digite a senha para verificação: ");
		String verSenha = scn.next();
		if (verSenha.equals(this.senha)) {
			this.senha = novaSenha;
			System.out.println("Senha alterada com sucesso!");
			System.out.println("Nova senha: " + this.senha);
		}
		else
			System.out.println("ERRO! Senha de verificação incorreta!");
		scn.close();	
	}

	protected abstract void saca(double valor);
	protected abstract void deposita(double valor);
	protected abstract void tiraExtrato();

}
