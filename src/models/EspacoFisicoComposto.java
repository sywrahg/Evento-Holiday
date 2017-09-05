package models;

import java.util.List;

public class EspacoFisicoComposto extends EspacoFisico {
	
	private List<EspacoFisico> espacos;

	public EspacoFisicoComposto(String nome, String descricao) {
		super(nome, descricao);
	}
	
	public void addEspaco(EspacoFisico ef){
		this.espacos.add(ef);
	}

}
