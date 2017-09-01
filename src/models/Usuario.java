package models;

import java.util.ArrayList;
import java.util.Calendar;

public class Usuario {
	private String CPF;
	private String nome;
	private String login;
	private String senha;
	private String telefone;
	private ArrayList<Evento> eventosCriados;
	private ArrayList<Evento> eventosOrganizados;
	private ArrayList<Evento> eventosParticipados;
	private ArrayList<Evento> eventosInscritos;
	
	public Usuario(String nome, String login, String senha) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	protected void addOrganizadorAEvento(Evento e, Usuario u){
		if (eventosCriados.contains(e) || eventosOrganizados.contains(e)) {
			e.addOrganizador(u);
		}
	}
	
	protected void addAtividadeAEvento(Evento e, Atividade a){
		if (e.isOrganizador(this)) {
			e.addAtividade(a);
		}
	}
	
	protected void addSubEvento(Evento pai, Evento filho){
		if (pai.isOrganizador(this) && filho.isOrganizador(this)) {
			filho.setEventoPai(pai);
			pai.addSubEvento(filho);
		}
	}

	protected Instituicao cadastrarInstituicao(String nome){
		Instituicao i = new Instituicao(nome);
		return i;
	}

	public String getCPF() {
		return CPF;
	}
	public String getLogin() {
		return login;
	}
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		String s = this.senha;
		return s;
	}
	public String getTelefone() {
		return telefone;
	}
	protected void inscreverEmEvento(Evento e){
		Inscricao i = new Inscricao();
		i.setCodigo(1234);
		i.setInscrito(this);
		i.setDataInscricao(Calendar.getInstance());
		i.setStatus(StatusInscricao.EM_ABERTO);
		eventosInscritos.add(e);
		e.addInscricao(i);
	}

	protected Evento novoEvento(String nome, Localizacao local){
		Evento eventonovo = new Evento(nome,local);
		eventosCriados.add(eventonovo);
		return eventonovo;
	}

	protected void participarEvento(Evento e){
		boolean isInscrito = false;
		for (int i = 0; i < e.getInscricoes().size(); i++) {
			if (e.getInscricoes().get(i).getInscrito() == this) {
				isInscrito = true;
			}
		}
		if (isInscrito) {
			eventosParticipados.add(e);	
		}
	}
	
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", login=" + login + ", senha=" + senha + "]";
	}
	
}
