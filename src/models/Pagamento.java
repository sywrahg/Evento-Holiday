package models;

import java.util.Date;

public class Pagamento {
	private Date data;
	private boolean pagamentoFeito;
	
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
	
	
}
