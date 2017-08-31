package models;

import java.util.Date;

import javax.swing.JOptionPane;

public class Cupom {
	private String codigo;
	private Date data;
	private double valor;
	private double valorSemDesconto;
	private double desconto;
	private double valorTotal;
	
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

	public static class CupomMain {

		public static void main(String[] args) {
			Cupom c1 = new Cupom();
			Boolean flag;
			do{
				c1.codigo = JOptionPane.showInputDialog("Insira o código do cumpom.: ");
				flag = c1.validarCodigoDoCupom(c1.codigo);
			}while(!flag);	
			c1.valorSemDesconto = Double.parseDouble(JOptionPane.showInputDialog (null, "Insira valor do ingresso.: "));
			c1.desconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Desconto de (porcentagem %).: "));
			c1.desconto(c1.valor);
			c1.valorTotalComDesconto(c1.valorTotal);
			
					
			JOptionPane.showMessageDialog(null,"O desconto de " + c1.desconto + "% " + 
			"Foi atribuído ao cupom de código " + c1.codigo + " \nO seu desconto é de R$ " + c1.valor +
			" \nValor sem desconto.: R$ " + c1.valorSemDesconto + " \nValor com desconto.: R$ " + c1.valorTotal);
		}

	}

}
