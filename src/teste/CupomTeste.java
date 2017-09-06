package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import models.Cupom;

public class CupomTeste {
	
	@Test
	public void CodigoDeCupomValido() {
		assertEquals("ads0544", "ads0544");
	}
	
	@Test
	public void CodigoDeCupomInvalidoo() {
		Cupom c = new Cupom();
		assertEquals("ads0544", "ads0533");
	}
	
	@Test
	public void CodigoDeCupomVazio() {
		assertEquals("ads0544", null);
	}
	
}
