package models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class Menu {
	
	private static Menu instance = null;
	private Usuario usuario = new Usuario("Não possui", "--------","Não possui");
	
	public static void main(String[] args) {
		mainMenu();
	}
	
	protected Menu(){
		//Criado somente devido ao padrão Singleton
	}
	
	public static Menu getInstance(){
		if(instance == null){
			instance = new Menu();
		}
		return instance;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	private static void mainMenu() {
		Map<Integer, String> mainMenuOpcoes = new HashMap<Integer,String>();
		mainMenuOpcoes.put(1, "Criar novo evento");
		mainMenuOpcoes.put(2, "Participar de evento");
		int op = 0;
		op = makeMenu("Main Menu", mainMenuOpcoes);
		switch (op) {
		//Funções para cada opção:
		case 1:
			System.out.println("Teste");
			break;
		default:
			JOptionPane.showConfirmDialog(null, "Por favor, informe um valor válido");
			mainMenu();
			break;
		}
	}
	
	private static void userMenu(){
		Map<Integer, String> userMenuOpcoes = new HashMap<Integer,String>();
		userMenuOpcoes.put(1, "Criar novo evento");
		userMenuOpcoes.put(2, "Participar de evento");
		int op = 0;
		op = makeMenu("Main Menu", userMenuOpcoes);
		switch (op) {
		//Funções para cada opção:
		case 1:
			System.out.println("Teste");
			break;
		default:
			JOptionPane.showConfirmDialog(null, "Por favor, informe um valor válido");
			mainMenu();
			break;
		}
		
	}
	
	//Criador de menus:
	private static int makeMenu(String menuName, Map<Integer, String> map){
		String msgText = menuName + ": \n\n";
		for (Iterator<Entry<Integer, String>> entries = map.entrySet().iterator(); entries.hasNext(); ) {
		    Entry<Integer, String> entry = entries.next();
		    msgText += entry.getKey() + " - " + entry.getValue() + "\n";
		}
		return Integer.parseInt(JOptionPane.showInputDialog(msgText));
		
	}

}
