package models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import enums.StatusInscricao;

public class Inscricao {
	private int codigo;
	private Usuario inscrito;
	private Calendar dataInscricao;
	private Calendar dataVencimento;
	private StatusInscricao status;
	private Evento evento;
	private Pagamento pagamento;
	private List<Atividade> itensInscricao;
	
	public Inscricao(Usuario inscrito) {
		super();
		this.inscrito = inscrito;
		this.codigo = 0;
		this.dataInscricao = Calendar.getInstance();
		this.status = StatusInscricao.PENDENTE;
		itensInscricao = new ArrayList<Atividade>();
	}
	
	public Usuario validarEntrada(Usuario validado) {
		return this.inscrito = validado;
	}
	
	public void efetuarPagamento(Usuario responsavel){
		if(this.status == StatusInscricao.PAGO){
			throw new RuntimeException("Essa inscrição já foi paga anteriormente!!");
		}
		pagamento.CalculoPagamento(itensInscricao);
		pagamento.Pagar(responsavel);
		this.status = StatusInscricao.PAGO;
	}
	
	public void addItemInscricao(Atividade atividade) throws RuntimeException{
		if(this.status == StatusInscricao.PAGO){
			throw new RuntimeException("O item - " + atividade + " - não pode ser adicionado pois a inscrição já foi paga!");
		}
		
		verificaMesmoEventoDosItens(atividade);
		verificaChoqueHorario(atividade);
		itensInscricao.add(atividade);
	}
	
	public void verificaRepeticaoItemInscricao(Atividade atividade) throws RuntimeException{
		if(this.itensInscricao.contains(atividade)){
			throw new RuntimeException("O item - " + atividade + " -  já foi adicionado anteriormente.");
		}
	}
	
	public void verificaChoqueHorario(Atividade item) throws RuntimeException{
		for (int i = 0; i < itensInscricao.size(); i++) {
			if((item.getHoraInicial().getTimeInMillis() >= itensInscricao.get(i).getHoraInicial().getTimeInMillis() && item.getHoraInicial().getTimeInMillis() <= itensInscricao.get(i).getHoraTermino().getTimeInMillis()) 
			|| (item.getHoraInicial().getTimeInMillis() >= itensInscricao.get(i).getHoraInicial().getTimeInMillis() && item.getHoraTermino().getTimeInMillis() <= itensInscricao.get(i).getHoraTermino().getTimeInMillis())){
				throw new RuntimeException("Choque de horário na atividade");
			}else{
				verificaConcomitancia(item);
			}
		}
	}

	public void verificaConcomitancia(Atividade a) throws RuntimeException{
		for (Atividade item : this.itensInscricao) {
			for (Atividade atividade : item.getAtividadesProibidas()) {
				if(a == atividade){
					throw new RuntimeException("Você está tentando se inscrever em atividades não compatíveis");
				}
			}
		}
	}
	
	public void verificaMesmoEventoDosItens(Atividade atividade){
		if(!(this.evento.getAtividades().contains(atividade))){
			throw new RuntimeException("O iten - " + atividade + "não pertence ao evento em questão (" + evento + ")");
		}
<<<<<<< HEAD
		verificaRepeticaoItemInscricao(atividade);		
=======
		verificaRepeticaoItemInscricao(atividade);
>>>>>>> dcf540cd95290d313cfe23f0ebebebaea088033a
	}

	public Evento getEvento() {
		return evento;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Usuario getInscrito() {
		return inscrito;
	}
	public void setInscrito(Usuario inscrito) {
		this.inscrito = inscrito;
	}
	public Calendar getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(Calendar dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	public Calendar getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public StatusInscricao getStatus() {
		return status;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public void setStatus(StatusInscricao status) {
		this.status = status;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public List<Atividade> getItensInscricao() {
		return itensInscricao;
	}

	public void setItensInscricao(List<Atividade> itensInscricao) {
		this.itensInscricao = itensInscricao;
	}
	
	
}