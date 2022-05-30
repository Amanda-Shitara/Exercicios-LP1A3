package Exercicio2;

public class Sexta implements Dia {
	
	@Override
	public boolean podeCircular(String placa) {
		return !(placa.endsWith("9") || placa.endsWith("0"));  
	}

}
