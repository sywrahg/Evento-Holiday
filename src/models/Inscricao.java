package models;

import java.util.Calendar;
import java.util.Date;

public class Inscricao {
	private int codigo;
	private Usuario inscrito;
	private Calendar dataInscricao;
	private Calendar dataVencimento;
	private StatusInscricao status;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Usuario getInscrito() {
		return inscrito;
	}
	public void setInscrito(Usuario inscrito) {
		this.inscrito = inscrito;
	}
	public Calendar getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(Calendar dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	public Calendar getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public StatusInscricao getStatus() {
		return status;
	}
	public void setStatus(StatusInscricao status) {
		this.status = status;
	}
	
	
}
