package models;

public class Localizacao {
	private String cidade;
	private String estado;
	
	public Localizacao(String cidade, String estado) {
		super();
		this.cidade = cidade;
		this.estado = estado;
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
