package models;

import java.util.ArrayList;

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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		String s = this.senha;
		return s;
	}

	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	protected Evento novoEvento(String nome, Localizacao local){
		Evento eventonovo = new Evento(nome,local);
		eventosCriados.add(eventonovo);
		return eventonovo;
		//TODO - Incompleto, implementar ao BD
	}
	
	protected Instituicao cadastrarInstituicao(String nome){
		Instituicao i = new Instituicao(nome);
		//TODO - Incompleto, implementar ao BD
		return i;
	}
	
	protected void participarEvento(Evento e){
		eventosParticipados.add(e);
	}
	
	protected void inscreverEmEvento(Evento e){
		eventosInscritos.add(e);
	}
	protected void addOrganizadorAEvento(Evento e, Usuario u){
		if (eventosCriados.contains(e) || eventosOrganizados.contains(e)) {
			e.organizadoresEvento.add(u);
		}
	}
	
}
