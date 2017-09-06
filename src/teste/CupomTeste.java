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
	public void DescontoAplicadoDezPorcento() {
		Cupom c = new Cupom();
		c.setValor(c.getValorSemDesconto() * c.getDesconto()/100);
		assertEquals(10, 10, 0);
	}
	
	@Test
	public void DescontoAplicadoQuizePorcento() {
		Cupom c = new Cupom();
		c.setValor(15);
		assertEquals(c.getValor(), 15, 0);
	}
	
	@Test
	public void DescontoAplicadoVintePorcento() {
		Cupom c = new Cupom();
		c.setValor(20);
		assertEquals(c.getValor(), 20, 0);
	}
}
