package models;

public enum TipoEvento {
	SIMPOSIO(1), CONGRESSO(2), SEMANA_CIENTIFICA(3), CICLO_DE_PALESTRAS(5);
	
	public int valorTipoEvento;
	
	TipoEvento(int valor){
		valorTipoEvento = valor;
	}
}
