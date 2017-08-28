package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class App {
	
	private static App instance = null;
	private static Autenticador a = new Autenticador();
	private static Usuario usuario = a.semLogin;
	
	protected App(){
		//Criado somente devido ao padr�o Singleton
	}
	
	public static App getInstance(){
		if(instance == null){
			instance = new App();
		}
		return instance;
	}
	
	//Main
	public static void main(String[] args) {
		firstMenu();
	}
	
	//Get/Set Usu�rio Logado
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	//Menus
	private static void firstMenu() {
		Map<Integer, String> mainMenuOpcoes = new HashMap<Integer,String>();
		mainMenuOpcoes.put(1, "Fazer Log-in");
		mainMenuOpcoes.put(2, "Cadastrar novo usu�rio");
		mainMenuOpcoes.put(0, "Sair do programa");
		int op = -1;
		try{
		op = MenuHelper.makeMenu("", mainMenuOpcoes);
		switch (op) {
		//Fun��es para cada op��o:
		case 1:
			Usuario tempUsuario = a.authenticateLogin();
			if (tempUsuario.equals(a.semLogin)) {
				JOptionPane.showMessageDialog(null, "Usu�rio n�o encontrado.");
				firstMenu();
			}
			else if(!tempUsuario.equals(a.semLogin)){
				usuario = tempUsuario;
				mainMenu();
			}
			break;
		case 2:
			MenuHelper.createUserWindow(a);
			firstMenu();
		case 0:
			break;
		default:
			JOptionPane.showMessageDialog(null, "Por favor, informe um valor v�lido");
			firstMenu();
			break;
		}
		
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Por favor, informe um valor v�lido");
			firstMenu();
		}
	}
	
	//Menu p�s-login
	private static void mainMenu() {
		Map<Integer, String> mainMenuOpcoes = new HashMap<Integer,String>();
		mainMenuOpcoes.put(1, "Criar novo evento");
		mainMenuOpcoes.put(2, "Participar de evento");
		int op = 0;
		op = MenuHelper.makeMenu("Main Menu - " + usuario.getNome(), mainMenuOpcoes);
		switch (op) {
		//Fun��es para cada op��o:
		case 1:
			System.out.println("Teste");
			break;
		default:
			JOptionPane.showConfirmDialog(null, "Por favor, informe um valor v�lido");
			mainMenu();
			break;
		}
	}
	
	private void userMenu(){
		Map<Integer, String> userMenuOpcoes = new HashMap<Integer,String>();
		userMenuOpcoes.put(1, "Criar novo evento");
		userMenuOpcoes.put(2, "Participar de evento");
		int op = 0;
		op = MenuHelper.makeMenu("Main Menu", userMenuOpcoes);
		switch (op) {
		//Fun��es para cada op��o:
		case 1:
			System.out.println("Teste");
			break;
		default:
			JOptionPane.showConfirmDialog(null, "Por favor, informe um valor v�lido");
			mainMenu();
			break;
		}
		
	}
	
}
