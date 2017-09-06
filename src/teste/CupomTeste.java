package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import models.Cupom;

public class CupomTeste {
	
	@Test
	public void CodigoDeCupomValido() {
		Cupom c = new Cupom();
		c.setCodigo("ads0544");
		assertEquals(c.getCodigo(), "ads0544");
	}
	
	@Test
	public void CodigoDeCupomInvalidoo() {
		Cupom c = new Cupom();
		c.setCodigo("ads0544");
		assertEquals(c.getCodigo(), "ads0533");
	}
	
	@Test
	public void CodigoDeCupomVazio() {
		Cupom c = new Cupom();
		c.setCodigo("ads0544");
		assertEquals(c.getCodigo(), null);
	}
	
	@Test
	public void DescontoAplicado() {
		Cupom c = new Cupom();
		c.setValor(10);
		assertEquals(c.getValor(), 10);
	}
	
}
