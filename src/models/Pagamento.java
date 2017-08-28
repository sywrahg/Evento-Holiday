package models;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pagamento {
	private Date data;
	private Usuario recebedor;
	private double valorTotal;
	
	
	public void CalculoPagamento(List<Atividade> itensIncricao){
		for (Atividade atividade : itensIncricao) {
			valorTotal += atividade.getValor();
		}
	}
	
	public void Pagar(Usuario user){
		recebedor = user;
		data = Calendar.getInstance().getTime();
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
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
	
	
}
