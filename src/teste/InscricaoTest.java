package teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import enums.StatusInscricao;
import enums.TipoAtividade;
import models.Atividade;
import models.Evento;
import models.Inscricao;
import models.Usuario;

public class InscricaoTest {

	@Test(expected=RuntimeException.class)
	public void testa_efetuar_pagamento_ja_pago(){
		Inscricao inscricao = new Inscricao(new Usuario("Sywrah", "gabs", "133"));
		
		List<Atividade> itensInscricao = new ArrayList<Atividade>();
		Atividade a1 = new Atividade();
		a1.setValor(20);
		itensInscricao.add(a1);
		
		Atividade a2 = new Atividade();
		a1.setValor(40);
		itensInscricao.add(a2);
		
		inscricao.setItensInscricao(itensInscricao);
		
		inscricao.setStatus(StatusInscricao.PAGO);
		
		inscricao.efetuarPagamento(new Usuario("fulano", "admin", "1234"));
		
	}
	
	@Test(expected=RuntimeException.class)
	public void testa_add_itemInscicao_repetido(){
		Calendar horaInicial1 = Calendar.getInstance();
		Calendar horaTermino1 = Calendar.getInstance();
		horaInicial1.set(2018, 7, 30, 20, 30, 0);
		horaTermino1.set(2018, 7, 30, 21, 0, 0);
		
		Calendar horaInicial2 = Calendar.getInstance();
		Calendar horaTermino2 = Calendar.getInstance();
		horaInicial2.set(2018, 8, 30, 20, 0, 0);
		horaTermino2.set(2018, 8, 30, 22, 0, 0);
		
		Atividade a1 = new Atividade();
		a1.setNome("Marketing digital");
		a1.setTipoAtividade(TipoAtividade.PALESTRA);
		a1.setHoraInicial(horaInicial1);
		a1.setHoraTermino(horaTermino1);
		
		Atividade a2 = new Atividade();
		a2.setNome("ADM");
		a2.setTipoAtividade(TipoAtividade.PALESTRA);
		a2.setHoraInicial(horaInicial2);
		a2.setHoraTermino(horaTermino2);
		
		Evento evento = new Evento("HAHA");
		
		Inscricao inscricao = new Inscricao(new Usuario("teste", "fulano", "133"));
		
		List<Atividade> atividades = new ArrayList<Atividade>();
		atividades.add(a1);
		atividades.add(a2);
		
		evento.setAtividades(atividades);
		inscricao.setEvento(evento);
		
		inscricao.addItemInscricao(a1);
		inscricao.addItemInscricao(a1);

	}
	
	
}
