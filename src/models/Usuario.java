package models;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer{
	private String CPF;
	private String nome;
	private String login;
	private String senha;
	private String telefone;
	private List<Evento> eventosCriados;
	private List<Evento> eventosOrganizados;
	private List<Evento> eventosInscritos;
	
	public Usuario(){
		
	}
	
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
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setEventosCriados(List<Evento> eventosCriados) {
		this.eventosCriados = eventosCriados;
	}

	public void setEventosOrganizados(List<Evento> eventosOrganizados) {
		this.eventosOrganizados = eventosOrganizados;
	}

	public void setEventosInscritos(List<Evento> eventosInscritos) {
		this.eventosInscritos = eventosInscritos;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", login=" + login + ", senha=" + senha + "]";
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Houveram alterações em um evento");
		
	}
	
}
