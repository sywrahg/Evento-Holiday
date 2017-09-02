package models;

import java.util.Date;

import enums.TipoEvento;

public class Evento {
	private int codigo;
	private String nome;
	private String descricao;
	private TipoEvento tipoEvento;
	private Date dataInicial;
	private Date dataTermino;
	private Localizacao local;
	private Evento[] subEventos;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	public Localizacao getLocal() {
		return local;
	}
	public void setLocal(Localizacao local) {
		this.local = local;
	}
	public Evento[] getSubEventos() {
		return subEventos;
	}
	public void setSubEventos(Evento[] subEventos) {
		this.subEventos = subEventos;
	}
		
}
