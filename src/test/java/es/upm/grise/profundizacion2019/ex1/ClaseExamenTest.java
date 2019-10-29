package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClaseExamenTest {

	// P1: 1-2-4-5-7
	@Test
	public void camino_p1() {
		ClaseExamen instancia = new ClaseExamen();
		float resultado = instancia.metodoAProbar(2, 2);
		assertEquals(0f, resultado, 0f);
	}
	
	// P2: 1-2-3-2-4-5-7
	@Test
	public void camino_p2() {
		ClaseExamen instancia = new ClaseExamen();
		float resultado = instancia.metodoAProbar(3, 2);
		assertEquals(0f, resultado, 0f);
	}
	
}
