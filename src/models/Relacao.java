package models;

import java.util.Date;

import enums.TipoRelacao;

public class Relacao {
	private Date dataParceria;
	private TipoRelacao tipoParceria;
	private Evento evento;
	private Instituicao instituicao;
	
	public Date getDataParceria() {
		return dataParceria;
	}
	public void setDataParceria(Date dataParceria) {
		this.dataParceria = dataParceria;
	}
	public TipoRelacao getTipoParceria() {
		return tipoParceria;
	}
	public void setTipoParceria(TipoRelacao tipoParceria) {
		this.tipoParceria = tipoParceria;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public Instituicao getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}
	
	
}
