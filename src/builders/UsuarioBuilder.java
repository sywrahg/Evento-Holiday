package builders;

import java.util.List;

import models.Evento;
import models.Usuario;

public class UsuarioBuilder {
	
	private Usuario usuario;
	
	public UsuarioBuilder(){
		usuario = new Usuario();
	}
	
	public static UsuarioBuilder builder(){
		return new UsuarioBuilder();
	}
	
	public UsuarioBuilder(String CPF){
		this.usuario.setCPF(CPF);
	}
	public UsuarioBuilder nome(String nome){
		this.usuario.setNome(nome);
		return this;
	}
	public UsuarioBuilder login(String login){
		this.usuario.setLogin(login);
		return this;
	}
	public UsuarioBuilder senha(String senha){
		this.usuario.setSenha(senha);
		return this;
	}
	public UsuarioBuilder telefone(String telefone){
		this.usuario.setTelefone(telefone);
		return this;
	}
	public UsuarioBuilder eventosInscritos(List<Evento> eventosInscritos){
		this.usuario.setEventosInscritos(eventosInscritos);
		return this;
	}
}
