package builders;

import java.util.Calendar;
import java.util.List;

import enums.StatusInscricao;
import models.Atividade;
import models.Evento;
import models.Inscricao;
import models.Pagamento;
import models.Usuario;

public class InscricaoBuilder {
	
	private Inscricao inscricao;
	
	public InscricaoBuilder(){
		inscricao = new Inscricao(null);
		inscricao.setStatus(StatusInscricao.PENDENTE);
	}
	
	public static InscricaoBuilder builder(){
		return new InscricaoBuilder();
	}
	
	public InscricaoBuilder(int codigo){
		this.inscricao.setCodigo(codigo);
	}
	public InscricaoBuilder(Usuario user){
		this.inscricao.setInscrito(user);
	}
	public InscricaoBuilder(Calendar dataIncricao){
		this.inscricao.setDataInscricao(dataIncricao);
	}
	public InscricaoBuilder(StatusInscricao status, Calendar dataVencimento){
		this.inscricao.setStatus(status);
		this.inscricao.setDataVencimento(dataVencimento);
	}
	public InscricaoBuilder(Evento evento){
		this.inscricao.setEvento(evento);
	}
	public InscricaoBuilder(Pagamento pagamento){
		this.inscricao.setPagamento(pagamento);
	}
	public InscricaoBuilder(List<Atividade> itensInscricao){
		this.inscricao.setItensInscricao(itensInscricao);
	}
}
