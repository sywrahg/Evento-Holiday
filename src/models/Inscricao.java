package models;

import java.util.Calendar;
import java.util.List;

import enums.StatusInscricao;

public class Inscricao {
	private int codigo;
	private Usuario inscrito;
	private Calendar dataInscricao;
	private Calendar dataVencimento;
	private StatusInscricao status;
	private Evento evento;
	private Pagamento pagamento;
	private List<Atividade> itensInscricao;
	
	public Inscricao(Usuario inscrito) {
		super();
		this.inscrito = inscrito;
		this.codigo = 0;
		this.dataInscricao = Calendar.getInstance();
		this.status = StatusInscricao.PENDENTE;
	}
	
	public void efetuarPagamento(Usuario responsavel){
		pagamento.CalculoPagamento(itensInscricao);
		pagamento.Pagar(responsavel);
		this.status = StatusInscricao.PAGO;
	}
	
	public void addItemInscricao(Atividade atividade) throws RuntimeException{
		if(status == StatusInscricao.PAGO){
			throw new RuntimeException("O item - " + atividade + " - não pode ser adicionado pois a inscrição já foi paga!");
		}
		//saber se atividade n está repetindo
		//saber se atividade faz parte do evento
		itensInscricao.add(atividade);
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
	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public void setStatus(StatusInscricao status) {
		this.status = status;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
}