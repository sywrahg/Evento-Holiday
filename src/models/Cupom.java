package models;

import java.util.Date;

import javax.swing.JOptionPane;

public class Cupom {
	public String codigo;
	public Date data;
	public double valor;
	public double valorSemDesconto;
	public double desconto;
	public double valorTotal;
	
	public Boolean validarCodigoDoCupom (String validarCodigo) {
		if (validarCodigo.equals("ads0544")){
			JOptionPane.showMessageDialog(null, "DESCONTO ADICIONADO!!");
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO, INSIRA UM NOVO CÓDIGO!!");
			return false;
		}
	}
	
	public double desconto (double valor) {
		this.valor = (this.valorSemDesconto * this.desconto)/100;
		return valor;
	}
	
	public double valorTotalComDesconto (double valorTotal) {
		this.valorTotal = this.valorSemDesconto - this.valor;
		return valorTotal;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorSemDesconto() {
		return valorSemDesconto;
	}

	public void setValorSemDesconto(double valorSemDesconto) {
		this.valorSemDesconto = valorSemDesconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
