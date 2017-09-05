package models;

public class Localizacao {
	private String cidade;
	private String estado;
	private String cep;
	private String endereco;
	
	public Localizacao(String cidade, String estado, String cep, String endereco) {
		super();
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
