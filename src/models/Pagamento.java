package models;

import java.util.Date;

public class Pagamento {
	private Date data;
	private boolean pagamentoFeito;
	private Usuario recebedor;
	private double valorTotal;
	private Atividade[] itensIncricao;
	
	public void CalculoPagamento(){
		for (int i = 0; i < itensIncricao.length; i++) {
			valorTotal += itensIncricao[i].getValor();
		}
	}
	
	public void EfetuarPagamento(Usuario user){
		pagamentoFeito = true;
		recebedor = user;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public boolean isPagamentoFeito() {
		return pagamentoFeito;
	}
	public void setPagamentoFeito(boolean pagamentoFeito) {
		this.pagamentoFeito = pagamentoFeito;
	}
	public Usuario getRecebedor() {
		return recebedor;
	}
	public void setRecebedor(Usuario recebedor) {
		this.recebedor = recebedor;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Atividade[] getItensIncricao() {
		return itensIncricao;
	}

	public void setItensIncricao(Atividade[] itensIncricao) {
		this.itensIncricao = itensIncricao;
	}
	
	
}
