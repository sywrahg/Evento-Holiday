package models;

import java.util.ArrayList;

public class Autenticador {
	
	public ArrayList<Usuario> usuariosCadastrados = new ArrayList<Usuario>();
	Usuario semLogin = new Usuario("---------", "--------","---------");

	public Autenticador() {
		super();
	}

	protected Usuario authenticateLogin(){
		String[] recebido = MenuHelper.loginWindow();
		String username = recebido[0];
		String password = recebido[1];
		for (int i = 0; i < this.usuariosCadastrados.size(); i++) {
			if (this.usuariosCadastrados.get(i).getLogin() == username && this.usuariosCadastrados.get(i).getSenha() == password) {
				return this.usuariosCadastrados.get(i);
			}
		}
		return semLogin;
	}

}
