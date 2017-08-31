package models;

public class Atividade {
	private String nome;
	private String horaInicial;
	private String horaTermino;
	private String local;
	private TipoAtividade tipoAtividade;
	private double valor;
	private Usuario registrador;
	private Atividade[] atividadesProibidas;
	
	public Atividade(String nome, String horaInicio, String horaFim, String local, TipoAtividade tipo, double valor, Usuario registrador) {
		this.nome = nome;
		this.horaInicial = horaInicio;
		this.horaTermino = horaFim;
		this.local = local;
		this.tipoAtividade = tipo;
		this.valor = valor;
		this.registrador = registrador;
	}
	
	public void AtividadePadrao(String nome, String horaInicio, String horaFim, String local){
		this.nome = nome;
		this.horaInicial = horaInicio;
		this.horaTermino = horaFim;
		this.local = local;
		this.tipoAtividade = TipoAtividade.PADRAO; 
	}
	
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}
	public String getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(String horaTermino) {
		this.horaTermino = horaTermino;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public TipoAtividade getTipoAtividade() {
		return tipoAtividade;
	}
	public void setTipoAtividade(TipoAtividade tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Usuario getRegistrador() {
		return registrador;
	}
	public void setRegistrador(Usuario registrador) {
		this.registrador = registrador;
	}

	public Atividade[] getAtividadesProibidas() {
		return atividadesProibidas;
	}

	public void setAtividadesProibidas(Atividade[] atividadesProibidas) {
		this.atividadesProibidas = atividadesProibidas;
	}

	
}
