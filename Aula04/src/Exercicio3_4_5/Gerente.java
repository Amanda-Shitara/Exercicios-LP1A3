package Exercicio3_4_5;

public class Gerente implements SalarioFuncionario {
	
	String nome;
	double hora;
	int quantidade;
	
	public void defineNome(String nome) {
		this.nome = nome;
		System.out.println("GERENTE: " + this.nome);
	}
	public void valorHoraBase (double hora) {
		this.hora = hora;
		System.out.println("Valor base da hora: R$" + String.format("%.2f",this.hora));
	}
	public void calculaHE (int quantidade) {
		this.quantidade = quantidade;
		System.out.println("Valor por hora-extra: R$" + String.format("%.2f",this.hora*1.2));
		System.out.println("Horas-extras trabalhadas: " + this.quantidade);
	}
	public void calculaSalarioFinal () {
		System.out.println("Salário final: R$" + String.format("%.2f", 180*this.hora + this.quantidade*this.hora*1.2 + 2000) + "\n");
	}

}
