package models;

import java.util.Date;

public class Inscricao {
	private int codigo;
	private Usuario inscrito;
	private Date dataInscricao;
	private Date dataVencimento;
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
	public Date getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public StatusInscricao getStatus() {
		return status;
	}
	public void setStatus(StatusInscricao status) {
		this.status = status;
	}
	
	
}
