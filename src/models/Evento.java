package models;

import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;

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
	protected List<String> espacos;
	protected List<Inscricao> inscricoes;

	public Evento(String nome) {
		super();
		this.nome = nome;
		this.codigo = 0;
	}
	
	protected void addAtividade(Usuario u){
		if (isOrganizador(u)) {
			this.atividades.add(new Atividade());
		}
	}
	
	protected void addEspaco(String espaco){
		espacos.add(espaco);
	}
	protected void removeEspaco(String espaco){
		espacos.remove(espaco);
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
	protected void addOrganizador(Usuario u, Usuario adicionado){
		if (u.getEventosCriados().contains(this) || u.getEventosOrganizados().contains(this)) {
			this.organizadoresEvento.add(u);
		}
	}
	protected void addInscricao(Usuario u){
		Inscricao i = new Inscricao(u);
		this.inscricoes.add(i);
		u.getEventosInscritos().add(this);
	}
	protected void removeInscricao(Inscricao i){
		i.getInscrito().getEventosInscritos().remove(i);
		this.inscricoes.remove(i);
	}
	protected void addSubEvento(Usuario u, Evento e){
		if(eventoPai == null && isOrganizador(u)){
			eventosFilhos.add(e);
			e.eventoPai = this;
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
	public Calendar getDataTermino() {
		return dataTermino;
	}
	public String getDescricao() {
		return descricao;
	}
	public List<String> getEspacos() {
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
	public void setLocal(String cidade, String estado) {
		Localizacao l = new Localizacao(cidade,estado);
		this.local = l;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
}
