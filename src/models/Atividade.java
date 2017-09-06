package models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enums.TipoAtividade;

public class Atividade {
	private String nome;
	private Calendar horaInicial;
	private Calendar horaTermino;
	private String local;
	private TipoAtividade tipoAtividade;
	private double valor;
	private Usuario registrador;
	private List<Atividade> atividadesProibidas;
	private ResponsavelAtividade responsavel;
	

	public Atividade(){
		
	}
	
	public Atividade(String nome, Calendar horaInicio, Calendar horaFim, String local, TipoAtividade tipo, double valor, Usuario registrador, ResponsavelAtividade responsavel) {
		this.nome = nome;
		this.horaInicial = horaInicio;
		this.horaTermino = horaFim;
		this.local = local;
		this.tipoAtividade = tipo;
		this.valor = valor;
		this.registrador = registrador;
		this.responsavel = responsavel;
		atividadesProibidas = new ArrayList<Atividade>();
	}
	
	public void AtividadePadrao(String nome, Calendar horaInicio, Calendar horaFim, String local){
		this.nome = nome;
		this.horaInicial = horaInicio;
		this.horaTermino = horaFim;
		this.local = local;
		this.tipoAtividade = TipoAtividade.PADRAO; 
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(Calendar horaInicial) {
		this.horaInicial = horaInicial;
	}
	public Calendar getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(Calendar horaTermino) {
		this.horaTermino = horaTermino;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public TipoAtividade getTipoAtividade() {
		return tipoAtividade;
	}
	public void setTipoAtividade(TipoAtividade tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Usuario getRegistrador() {
		return registrador;
	}
	public void setRegistrador(Usuario registrador) {
		this.registrador = registrador;
	}

	public List<Atividade> getAtividadesProibidas() {
		return atividadesProibidas;
	}

	public void setAtividadesProibidas(List<Atividade> atividadesProibidas) {
		this.atividadesProibidas = atividadesProibidas;
	}

	public ResponsavelAtividade getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(ResponsavelAtividade responsavel) {
		this.responsavel = responsavel;
	}

}