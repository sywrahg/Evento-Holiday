package models;

import java.util.List;

public class Trilha extends Atividade {
	
	private String Tema;
	private List<Atividade> trilha;
	private double valor;
	
	public String getTema() {
		return Tema;
	}
	public void setTema(String tema) {
		Tema = tema;
	}
	public List<Atividade> getTrilha() {
		return trilha;
	}
	public void setTrilha(List<Atividade> trilha) {
		this.trilha = trilha;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
