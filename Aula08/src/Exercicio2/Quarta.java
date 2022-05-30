package Exercicio2;

public class Quarta implements Dia {
	
	@Override
	public boolean podeCircular(String placa) {
		return !(placa.endsWith("5") || placa.endsWith("6"));  
	}

}
