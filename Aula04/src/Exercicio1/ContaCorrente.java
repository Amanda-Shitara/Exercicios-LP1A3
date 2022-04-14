package Exercicio1;

public class ContaCorrente extends ContaBancaria{
	private double valorS, valorD;
	private String numero;
	private double saldo, saldoFinal;
	private int qtdTransacoes = 2;
	
	@Override
	protected void saca(double valor) {
		this.valorS = valor;
		this.saldoFinal -= valor;
	}
	@Override
	protected void deposita(double valor) {
		this.valorD = valor;
		this.saldoFinal = this.saldo;
		this.saldoFinal += valor;
	}
	@Override
	protected void tiraExtrato() {
		System.out.println("\nCONTA CORRENTE " + this.numero);
		System.out.println("Saldo inicial: " + this.saldo);
		System.out.println("Valor depositado: " + this.valorD);
		System.out.println("Valor sacado: " + this.valorS);
		System.out.println("Saldo atual: " + this.saldoFinal);
		System.out.println("Quantidade de transações realizadas: " + this.qtdTransacoes + "\n");
	}

	protected void setNumero(String numero) {
		this.numero = numero;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
