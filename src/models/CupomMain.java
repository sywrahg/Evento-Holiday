package models;

import javax.swing.JOptionPane;

public class CupomMain {

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
