package enums;

public enum StatusInscricao {
	PAGO(1), PENDENTE(2), VENCIDA(3), VALIDADA(4);
	
	public int valorStatusInscricao;
	
	StatusInscricao(int valor){
		valorStatusInscricao = valor;
	}
}
