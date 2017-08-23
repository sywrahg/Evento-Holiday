package models;

import java.util.ArrayList;

public class Usuario {
	private String CPF;
	private String nome;
	private String telefone;
	private ArrayList<Evento> eventosCriados;
	private ArrayList<Evento> eventosParticipados;
	private ArrayList<Evento> eventosInscritos;
	
	public Usuario(String cpf, String nome, String tel) {
		this.CPF = cpf;
		this.nome = nome;
		this.telefone = tel;
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
	
	public Evento novoEvento(String nome, Localizacao local){
		Evento eventonovo = new Evento(nome,local);
		eventosCriados.add(eventonovo);
		return eventonovo;
		//TODO - Incompleto, implementar ao BD
	}
	
	public Instituicao cadastrarInstituicao(String nome){
		Instituicao i = new Instituicao(nome);
		//TODO - Incompleto, implementar ao BD
		return i;
	}
	
}
