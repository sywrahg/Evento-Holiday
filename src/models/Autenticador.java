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
			System.out.println("Recebeu - Usuario: " + username + " Senha: " + password);
			System.out.println("Vendo user: " + i);
			System.out.println(this.usuariosCadastrados.get(i).toString());
			System.out.println(this.usuariosCadastrados.get(i).getLogin());
			System.out.println(this.usuariosCadastrados.get(i).getSenha());
			//N�o entra aqui, n�o sei porqu�
			if (this.usuariosCadastrados.get(i).getLogin() == username && this.usuariosCadastrados.get(i).getSenha() == password) {
				System.out.println("Achou user:");
				System.out.println("Login: " + this.usuariosCadastrados.get(i).getLogin() + "Senha: " + this.usuariosCadastrados.get(i).getSenha());
				return this.usuariosCadastrados.get(i);
			}
		}
		return semLogin;
	}

}
