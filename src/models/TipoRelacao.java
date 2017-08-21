package models;

public enum TipoRelacao {
	APOIO(1), REALIZACAO(2), PATROCINIO(3);
	
	public int valorTipoRelacao;
	
	TipoRelacao(int valor){
		valorTipoRelacao = valor;
	}
}
