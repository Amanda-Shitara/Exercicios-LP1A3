package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio1.Area;

public class AreaTest {

	@Test
	public void testarArea() {
		Area a = new Area();
		assertEquals(a.calculaArea(2, 4), 8);
		assertEquals(a.calculaArea(2, 3), 6);
		assertTrue(a.calculaArea(3, 5) == 15);
	}

}
