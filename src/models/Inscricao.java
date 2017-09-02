package models;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import enums.StatusInscricao;

public class Inscricao {
	private int codigo;
	private Usuario inscrito;
	private Date dataInscricao;
	private StatusInscricao status;
	private Pagamento pagamento;
	private List<Atividade> itensInscricao;
	
	
	public Inscricao(Usuario inscrito, List<Atividade> itensInscricao) {
		this.inscrito = inscrito;
		this.dataInscricao = Calendar.getInstance().getTime();
		this.status = StatusInscricao.PENDENTE;
		this.itensInscricao = itensInscricao;
		
	}
	
	
	
	public void EfetuarPagamento(Usuario responsavel){
		pagamento.CalculoPagamento(itensInscricao);
		pagamento.Pagar(responsavel);
		this.status = StatusInscricao.PAGO;
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
	public Date getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	
	public StatusInscricao getStatus() {
		return status;
	}
	public void setStatus(StatusInscricao status) {
		this.status = status;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	
}
