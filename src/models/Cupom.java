package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Cupom {
	private String codigo;
	private String data;
	private double valor;
	private double valorSemDesconto;
	private double desconto;
	private double valorTotal;
	
	public boolean validarCodigoDoCupom (String validarCodigo) {
		try {
			if (!validarCodigo.equals("ads0544")){
				JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO, INSIRA UM NOVO CÓDIGO!!");
				return false;
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "DESCONTO ADICIONADO!!");
		}
		return true;
	}
	
	public boolean validarData (String data) {
		try {
			SimpleDateFormat dataDeValidade = new SimpleDateFormat("dd/MM/yyyy");
			dataDeValidade.setLenient(false);
			dataDeValidade.parse(data);
			JOptionPane.showMessageDialog(null, "DATA VALIDA!");
		return true;
		} catch (ParseException ex) {
			JOptionPane.showMessageDialog(null,"DATA INVALIDA!");
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

	public String getData() {
		return data;
	}

	public void setData(String data) {
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
