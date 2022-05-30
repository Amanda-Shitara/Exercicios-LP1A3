package Exercicio2;

public class Quinta implements Dia {
	
	@Override
	public boolean podeCircular(String placa) {
		return !(placa.endsWith("7") || placa.endsWith("8"));  
	}

}
