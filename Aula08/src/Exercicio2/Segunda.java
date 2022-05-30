package Exercicio2;

public class Segunda implements Dia {
	
	@Override
	public boolean podeCircular(String placa) {
		return !(placa.endsWith("1") || placa.endsWith("2"));  
	}

}
