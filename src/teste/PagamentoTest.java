package teste;

import java.util.Arrays;
import java.util.List;

//import org.junit.Assert;
import org.junit.Test;

import models.Atividade;

public class PagamentoTest {
	
	@Test
	public void calculoTotalDoPagamento(){
		Atividade atividade1 = new Atividade();
		atividade1.setValor(150);
		Atividade atividade2 = new Atividade();
		atividade2.setValor(30);
		Atividade atividade3 = new Atividade();
		atividade3.setValor(120);
		
		List<Atividade> itensIncricao = Arrays.asList(atividade1, atividade2, atividade3);
		//Assert.assertEquals(300,);
	}
}
