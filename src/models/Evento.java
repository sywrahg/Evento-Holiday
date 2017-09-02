package models;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Evento {
	private int codigo;
	private String nome;
	private String descricao;
	private TipoEvento tipoEvento;
	private Calendar dataInicial;
	private Calendar dataTermino;
	private Localizacao local;
	private ArrayList<Tag> tags;
	private ArrayList<Atividade> atividades;
	private Usuario criadorEvento;
	protected ArrayList<Usuario> organizadoresEvento;
	protected ArrayList<Instituicao> instituicoesOrganizadoras;
	protected Evento eventoPai;
	protected ArrayList<Evento> eventosFilhos;
	protected ArrayList<EspacoFisico> espacos;
	protected ArrayList<Inscricao> inscricoes;
	
	//Constructor Geral (Hardcode)
	public Evento(int codigo, String nome, String descricao, TipoEvento tipoEvento, Calendar dataInicial, Calendar dataTermino,
			Localizacao local) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.tipoEvento = tipoEvento;
		this.dataInicial = dataInicial;
		this.dataTermino = dataTermino;
		this.local = local;
	}
	//Temporário
	public Evento(String nome, Localizacao local) {
		super();
		this.nome = nome;
		this.local = local;
	}
	protected Atividade addAtividade(Atividade a){
		atividades.add(a);
		return a;
	}
	protected EspacoFisico addEspaco(EspacoFisico espaco){
		espacos.add(espaco);
		return espaco;
	}
	protected void addInstituicao(Instituicao i){
		//instituicoesOrganizadoras.add(i);
	}
	protected void addTag(Tag t){
		if (!this.tags.contains(t)) {
			this.tags.add(t);
		}
	}
	public void addInscricao(Inscricao i){
		this.inscricoes.add(i);
	}
	protected void addSubEvento(Evento e){
		if(eventoPai == null){
			eventosFilhos.add(e);
		}
		else if(eventoPai != null){
			JOptionPane.showMessageDialog(null, "Opa...Seu evento não pode ter sub-eventos se ele mesmo for um sub-evento!");
		}
	}
	public boolean isOrganizador(Usuario u){
		if (this.getCriadorEvento().equals(u) || this.getOrganizadoresEvento().contains(u)) {
			return true;
		}else{
			return false;
		}
	}
	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}
	public int getCodigo() {
		return codigo;
	}
	public Calendar getDataInicial() {
		return dataInicial;
	}
	protected void addOrganizador(Usuario u){
		this.organizadoresEvento.add(u);
	}
	public Calendar getDataTermino() {
		return dataTermino;
	}
	public String getDescricao() {
		return descricao;
	}
	public ArrayList<EspacoFisico> getEspacos() {
		return espacos;
	}
	public Evento getEventoPai() {
		return eventoPai;
	}
	public ArrayList<Evento> getEventosFilhos() {
		return eventosFilhos;
	}
	public Localizacao getLocal() {
		return local;
	}
	public String getNome() {
		return nome;
	}
	public ArrayList<Usuario> getOrganizadoresEvento() {
		return organizadoresEvento;
	}
	public ArrayList<Tag> getTags() {
		return tags;
	}
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public Usuario getCriadorEvento() {
		return criadorEvento;
	}
	public void setCriadorEvento(Usuario criadorEvento) {
		this.criadorEvento = criadorEvento;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial = dataInicial;
	}
	public void setDataTermino(Calendar dataTermino) {
		this.dataTermino = dataTermino;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setEspacos(ArrayList<EspacoFisico> espacos) {
		this.espacos = espacos;
	}
	
	protected void setEventoPai(Evento e){
		if(eventosFilhos.isEmpty()){
			eventoPai = e;
		}
		else if(eventosFilhos.isEmpty() == false){
			JOptionPane.showMessageDialog(null, "Opa...Seu evento não pode ter evento-pai se ele tiver um sub-evento!");
		}
	}
	
	public void setEventosFilhos(ArrayList<Evento> eventosFilhos) {
		this.eventosFilhos = eventosFilhos;
	}
	
	public void setLocal(Localizacao local) {
		this.local = local;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setOrganizadoresEvento(ArrayList<Usuario> organizadoresEvento) {
		this.organizadoresEvento = organizadoresEvento;
	}	
	
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
}
