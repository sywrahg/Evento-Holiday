package enums;

public enum StatusInscricao {
	PAGO(1), PENDENTE(2);
	
	public int valorStatusInscricao;
	
	StatusInscricao(int valor){
		valorStatusInscricao = valor;
	}
}
