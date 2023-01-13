package Partie_4;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Main {

	public static void main(String[] args) {
		bonjourAndName();
		typeDeCafe();
		propreTasse();
	}	

	public static void bonjourAndName(){
		String name = JOptionPane.showInputDialog("Bonjour, quel est votre nom ?");
		JOptionPane.showMessageDialog(null, "Est ce que je peu prendre votre commande M. " + name+" ?");
	}

	public static void typeDeCafe(){
		JComboBox<TypeCafe> typeCafeBox = new JComboBox<TypeCafe>(TypeCafe.values());
		JOptionPane.showMessageDialog(null, new JScrollPane(typeCafeBox));

		if (typeCafeBox.getSelectedItem() == TypeCafe.BATARD) {
			JOptionPane.showMessageDialog(null,"tu n’est pas le bienvenusort !!");	
		}
	}

	public static void propreTasse(){
/* 		String[] hasTasse= {"Oui","Non"}; */

/* 		JComboBox<String> tass = new JComboBox<String>(hasTasse); */
		/* JOptionPane.showMessageDialog(null, "est ce que vous avez votre propre tasse","Tasse ou pas tasse",new JScrollPane(tass)); */
		int input = JOptionPane.showConfirmDialog(null, "est ce que vous avez votre propre tasse?");

		if (input == 0) {
			String taille = JOptionPane.showInputDialog("quel taille ?");
			Integer laTaille = (Integer) taille;

		}
        System.out.println(input);
	}
}