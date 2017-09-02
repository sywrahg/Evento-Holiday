package models;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Inscricao {
	private int codigo;
	private Usuario inscrito;
	private Calendar dataInscricao;
	private Calendar dataVencimento;
	private StatusInscricao status;
	private Evento evento;
	
	protected void pagarInscricao(){
		this.status = StatusInscricao.PAGO;
	}
	
	protected void vencerInscricao(){
		this.status = StatusInscricao.VENCIDA;
	}
	
	protected void validarInscricao(){
		this.status = StatusInscricao.VALIDADA;
	}
	
	public Inscricao(Usuario inscrito) {
		super();
		this.inscrito = inscrito;
		this.codigo = 0;
		this.dataInscricao = Calendar.getInstance();
		this.status = StatusInscricao.EM_ABERTO;
	}

	public Evento getEvento() {
		return evento;
	}

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
	
}
