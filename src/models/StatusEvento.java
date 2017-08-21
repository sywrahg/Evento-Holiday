package models;

public enum StatusEvento {
    NOVO(1), EM_ANDAMENTO(2), INSCRICOES_ABERTAS(3);
	
	public int valorStatusEvento;
	
	StatusEvento(int valor){
		valorStatusEvento = valor;
	}
}
