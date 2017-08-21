package models;

public enum TipoAtividade {
	PALESTRA(1), MINICURSO(2),MESA_REDONDA(3), BATE_PAPO(4);
	
	public int valorTipoAtividade;
	
	TipoAtividade(int valor){
		valorTipoAtividade = valor;
	}
	
}
