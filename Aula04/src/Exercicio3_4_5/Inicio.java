package Exercicio3_4_5;

public class Inicio {

	public static void main(String[] args) {
		
		SalarioFuncionario sal;
		FuncionarioComum f = new FuncionarioComum();
		
		sal = new FuncionarioComum();
		sal.defineNome("Ana");
		sal.valorHoraBase(10);
		sal.calculaHE(30);
		sal.calculaSalarioFinal();
		f.defineCargo("Analista de Dados");
		f.defineDataAdm("01/10/2001");
		
		sal.defineNome("Bruno");
		sal.valorHoraBase(10);
		sal.calculaHE(40);
		sal.calculaSalarioFinal();
		f.defineCargo("Programador");
		f.defineDataAdm("20/02/1998");
		
		sal = new Gerente();
		sal.defineNome("Carolina");
		sal.valorHoraBase(20);
		sal.calculaHE(30);
		sal.calculaSalarioFinal();
		
		sal.defineNome("Douglas");
		sal.valorHoraBase(20);
		sal.calculaHE(45);
		sal.calculaSalarioFinal();
		
		sal.defineNome("Emília");
		sal.valorHoraBase(20);
		sal.calculaHE(50);
		sal.calculaSalarioFinal();

	}

}
