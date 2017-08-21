package models;

public enum TipoResponsabilidade {
	PALESTRANTE(1), INSTRUTOR(2), MEDIADOR(3);
	
	public int valorTipoResponsabilidade;
	
	TipoResponsabilidade(int valor){
		valorTipoResponsabilidade = valor;
	}
}
