package teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import models.Atividade;

public class AtividadeTest {

	@Test(expected=RuntimeException.class)
	public void testeDaErroPorChoqueDeHorario(){
		
		Calendar horaInicial1 = Calendar.getInstance();
		Calendar horaTermino1 = Calendar.getInstance();
		horaInicial1.set(2018, 7, 30, 20, 30, 0);
		horaTermino1.set(2018, 7, 30, 21, 0, 0);
		
		Calendar horaInicial2 = Calendar.getInstance();
		Calendar horaTermino2 = Calendar.getInstance();
		horaInicial2.set(2018, 7, 30, 20, 0, 0);
		horaTermino2.set(2018, 7, 30, 22, 0, 0);
		
		Atividade a1 = new Atividade();
		Atividade a2 = new Atividade();
		Atividade a3 = new Atividade();
		Atividade a4 = new Atividade();

		List<Atividade> atividadesProibidas1 = new ArrayList<Atividade>();
		atividadesProibidas1.add(a1);
		atividadesProibidas1.add(a2);
		
		List<Atividade> atividadesProibidas2 = new ArrayList<Atividade>();
		atividadesProibidas1.add(a3);
		atividadesProibidas1.add(a4);
		
		Atividade atividade1 = new Atividade();
		atividade1.setHoraInicial(horaInicial1);
		atividade1.setHoraTermino(horaTermino1);
		atividade1.setAtividadesProibidas(atividadesProibidas1);
		
		Atividade atividade2 = new Atividade();
		atividade2.setHoraInicial(horaInicial2);
		atividade2.setHoraTermino(horaTermino2);
		atividade2.setAtividadesProibidas(atividadesProibidas2);
		
		List<Atividade> itensInscricao = new ArrayList<Atividade>();
		itensInscricao.add(atividade1);
		itensInscricao.add(atividade2);
		
		atividade1.verificaConcomitancia(itensInscricao); 
	
		
	}
}
