package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio2.*;

public class DiaTest {

	@Test
	public void testarSegundaFinal1e2() {
		Dia dia = new Segunda();
	    assertFalse(dia.podeCircular("AAA-1111"));
	    assertFalse(dia.podeCircular("AAA-1112"));
	}
	
	@Test
	public void testarTercaFinal3e4() {
		Dia dia = new Terca();
	    assertFalse(dia.podeCircular("AAA-1113"));
	    assertFalse(dia.podeCircular("AAA-1114"));
	}
	
	@Test
	public void testarQuartaFinal5e6() {
		Dia dia = new Quarta();
	    assertFalse(dia.podeCircular("AAA-1115"));
	    assertFalse(dia.podeCircular("AAA-1116"));
	}
	
	@Test
	public void testarQuintaFinal7e8() {
		Dia dia = new Quinta();
	    assertFalse(dia.podeCircular("AAA-1117"));
	    assertFalse(dia.podeCircular("AAA-1118"));
	}
	
	@Test
	public void testarSextaFinal9e0() {
		Dia dia = new Sexta();
	    assertFalse(dia.podeCircular("AAA-1119"));
	    assertFalse(dia.podeCircular("AAA-1110"));
	}

}
