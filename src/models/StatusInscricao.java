package models;

public enum StatusInscricao {
	PAGO(1), EM_ABERTO(2), VENCIDA(3);
	
	public int valorStatusInscricao;
	
	StatusInscricao(int valor){
		valorStatusInscricao = valor;
	}
}
