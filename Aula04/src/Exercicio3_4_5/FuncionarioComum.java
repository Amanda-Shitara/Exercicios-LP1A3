package Exercicio3_4_5;

public class FuncionarioComum implements SalarioFuncionario {
	
	String nome;
	double hora;
	int quantidade;
	String cargo;
	String dataAdm;
	
	public void defineNome(String nome) {
		this.nome = nome;
		System.out.println("FUNCIONÁRIO(A): " + this.nome);
	}
	public void valorHoraBase (double hora) {
		this.hora = hora;
		if(this.hora > 200) {
			System.out.println("ERRO! O valor base da hora é inválido!");
			System.exit(0);
		}
		else
			System.out.println("Valor base da hora: R$" + String.format("%.2f",this.hora));
	}
	public void calculaHE (int quantidade) {
		this.quantidade = quantidade;
		if(this.quantidade > 40) {
			System.out.println("ERRO! A quantidade de horas-extras é inválida!");
			System.exit(0);
		}
		else {
			System.out.println("Valor por hora-extra: R$" + String.format("%.2f",this.hora*2));
			System.out.println("Horas-extras trabalhadas: " + this.quantidade);
		}
	}
	public void calculaSalarioFinal () {
		System.out.println("Salário final: R$" + String.format("%.2f", 200*this.hora + this.quantidade*this.hora*2));
	}
	
	protected void defineCargo (String cargo) {
		this.cargo = cargo;
		System.out.println("Cargo do funcionário: " + this.cargo);
	}
	protected void defineDataAdm (String dataAdm) {
		this.dataAdm = dataAdm;
		System.out.println("Data de admissão: " + this.dataAdm + "\n");
	}

}
