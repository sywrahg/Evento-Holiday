package models;

public class Usuario {
	private String CPF;
	private String nome;
	private String telefone;
	
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

	
}
