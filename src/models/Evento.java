package models;

import java.util.Calendar;
import java.util.List;

import enums.TipoEvento;

public class Evento {
	private int codigo;
	private String nome;
	private String descricao;
	private TipoEvento tipoEvento;
	private Calendar dataInicial;
	private Calendar dataTermino;
	private Localizacao local;
	private List<Tag> tags;
	private List<Atividade> atividades;
	private Usuario criadorEvento;
	protected List<Usuario> organizadoresEvento;
	protected List<Instituicao> instituicoesOrganizadoras;
	protected Evento eventoPai;
	protected List<Evento> eventosFilhos;
	protected List<EspacoFisico> espacos;
	protected List<Inscricao> inscricoes;
	
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

	public Evento(String nome) {
		super();
		this.nome = nome;
		this.codigo = 0;
	}
	
	/*//TODO - Precisa de um construtor de atividade(Que é da sywrah)
	protected Atividade addAtividade(Usuario u, String nomeatv){
		if (isOrganizador(this)) {
			addAtividade(a);
		}
		Atividade a = new ;
		this.atividades.add(a);
		return a;
	}*/
	
	protected EspacoFisico addEspaco(EspacoFisico espaco){
		espacos.add(espaco);
		return espaco;
	}
	protected EspacoFisico removeEspaco(EspacoFisico espaco){
		espacos.remove(espaco);
		return espaco;
	}
	protected void addInstituicao(String nome){
		Instituicao i = new Instituicao(nome);
		this.instituicoesOrganizadoras.add(i);
	}
	protected void removeInstituicao(Instituicao i){
		this.instituicoesOrganizadoras.remove(i);
	}
	protected void addTag(Tag t){
		if (!this.tags.contains(t)) {
			this.tags.add(t);
		}
	}
	protected void removeTag(Tag t){
			this.tags.remove(t);
	}
	public void addInscricao(Usuario u){
		Inscricao i = new Inscricao(u);
		u.getEventosInscritos().add(this);
	}
	protected void addSubEvento(Usuario u, Evento e){
		if(eventoPai == null && isOrganizador(u)){
			eventosFilhos.add(e);
		}
	}
	protected void removeSubEvento(Usuario u, Evento e){
		if(eventoPai == null && isOrganizador(u)){
			eventosFilhos.add(e);
		}
	}
	public boolean isOrganizador(Usuario u){
		if (this.getCriadorEvento().equals(u) || this.getOrganizadoresEvento().contains(u));
		return true;
	}
	public List<Atividade> getAtividades() {
		return atividades;
	}
	public int getCodigo() {
		return codigo;
	}
	public Calendar getDataInicial() {
		return dataInicial;
	}
	protected void addOrganizador(Usuario u, Usuario adicionado){
		if (u.getEventosCriados().contains(this) || u.getEventosOrganizados().contains(this)) {
			this.organizadoresEvento.add(u);
		}
	}
	public Calendar getDataTermino() {
		return dataTermino;
	}
	public String getDescricao() {
		return descricao;
	}
	public List<EspacoFisico> getEspacos() {
		return espacos;
	}
	public Evento getEventoPai() {
		return eventoPai;
	}
	public List<Evento> getEventosFilhos() {
		return eventosFilhos;
	}
	public Localizacao getLocal() {
		return local;
	}
	public String getNome() {
		return nome;
	}
	public List<Usuario> getOrganizadoresEvento() {
		return organizadoresEvento;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public List<Inscricao> getInscricoes() {
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
	
	public void setEspacos(List<EspacoFisico> espacos) {
		this.espacos = espacos;
	}
	
	protected void setEventoPai(Evento e){
		if(eventosFilhos.isEmpty()){
			eventoPai = e;
		}
	}
	
	public void setLocal(Localizacao local) {
		this.local = local;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
}
