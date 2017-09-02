package models;

import java.util.List;

public class Usuario {
	private String CPF;
	private String nome;
	private String login;
	private String senha;
	private String telefone;
	private List<Evento> eventosCriados;
	private List<Evento> eventosOrganizados;
	private List<Evento> eventosInscritos;
	
	public Usuario(String nome, String login, String senha) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	protected void novoEvento(String nomeevento){
		Evento e = new Evento(nomeevento);
		this.eventosCriados.add(e);
		this.eventosOrganizados.add(e);
	}
	public String getCPF() {
		return CPF;
	}
	public List<Evento> getEventosCriados() {
		return eventosCriados;
	}
	public List<Evento> getEventosInscritos() {
		return eventosInscritos;
	}
	public List<Evento> getEventosOrganizados() {
		return eventosOrganizados;
	}
	public String getLogin() {
		return login;
	}
	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	
	public String getTelefone() {
		return telefone;
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
