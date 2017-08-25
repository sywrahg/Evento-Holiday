package models;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MenuHelper {

	//Criador de menus:
	public static int makeMenu(String menuName, Map<Integer, String> map){
		String msgText = "Holiday Eventos - " + menuName + ": \n\n";
		for (Iterator<Entry<Integer, String>> entries = map.entrySet().iterator(); entries.hasNext(); ) {
		    Entry<Integer, String> entry = entries.next();
		    msgText += entry.getKey() + " - " + entry.getValue() + "\n";
		}
		return Integer.parseInt(JOptionPane.showInputDialog(msgText));
		
	}
	
	//Autenticador do Login
	public static String[] loginWindow(){
		JTextField username = new JTextField(20);
	    JPasswordField password = new JPasswordField(20);

	    JPanel myPanel = new JPanel();
	    myPanel.add(new JLabel("Usuário:"));
	    myPanel.add(username);
	    myPanel.add(Box.createHorizontalStrut(15)); // Espacinho pra separar login e senha
	    myPanel.add(new JLabel("Senha:"));
	    myPanel.add(password);

	    int result = JOptionPane.showConfirmDialog(null, myPanel, 
	             "Informe seu usuário e senha.", JOptionPane.OK_CANCEL_OPTION);
	    if (result == JOptionPane.OK_OPTION) {
	    	String u = username.getText();
	    	String p = String.valueOf(password.getPassword());
	    	String[] autenticar = new String[]{u,p};
	    	return autenticar;
	    }
	    String[] fail= new String[]{"",""};
	    System.out.println("Autenticação falhou.");
		return fail;
	}
	
	public static void createUserWindow(Autenticador a){
		String[] s = loginWindow();
		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		String login = s[0];
		String senha = s[1];
		Usuario u = new Usuario(nome, login, senha);
		a.usuariosCadastrados.add(u);
	}

}
