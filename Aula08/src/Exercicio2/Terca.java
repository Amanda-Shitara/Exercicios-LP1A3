package Exercicio2;

public class Terca implements Dia {
	
	@Override
	public boolean podeCircular(String placa) {
		return !(placa.endsWith("3") || placa.endsWith("4"));  
	}

}
