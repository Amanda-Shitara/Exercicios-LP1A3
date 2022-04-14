package Exercicio1;

public class ContaPoupanca extends ContaBancaria{
	private double valorS, valorD;
	private String numero;
	private double saldo, saldoFinal;
	private double rendimento = 0.005;
	
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
		System.out.println("CONTA POUPAN�A " + this.numero);
		System.out.println("Saldo inicial: " + this.saldo);
		System.out.println("Valor depositado: " + this.valorD);
		System.out.println("Valor sacado: " + this.valorS);
		System.out.println("Saldo atual: " + this.saldoFinal);
		System.out.println("Taxa de rendimento: " + this.rendimento + "\n");
	}

	protected void setNumero(String numero) {
		this.numero = numero;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
