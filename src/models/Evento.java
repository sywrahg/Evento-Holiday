package models;

import java.util.Date;

public class Evento {
	private int codigo;
	private String nome;
	private String descricao;
	private TipoEvento tipoEvento;
	private Date dataInicial;
	private Date dataTermino;
	private Localizacao local;
	
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
	
	//Constructor Geral (Hardcode)
	public Evento(int codigo, String nome, String descricao, TipoEvento tipoEvento, Date dataInicial, Date dataTermino,
			Localizacao local) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.tipoEvento = tipoEvento;
		this.dataInicial = dataInicial;
		this.dataTermino = dataTermino;
		this.local = local;
	}
	
	//Temporário
	public Evento(String nome, Localizacao local) {
		super();
		this.nome = nome;
		this.local = local;
	}
	
	public void check_in(Usuario u){
		
	}
		
}
