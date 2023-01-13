package Partie_3;

import java.util.ArrayList;
/* import java.util.HashMap; */
import java.util.Random;

public class AMain_Corrige {

	
	public static void main(String[] arg) {
		
		
		ArrayList<Client> listeClient1 = getListCLients() ; 
		ArrayList<Client> listeClient2 = getListCLients() ; 
		ArrayList<Client> listeClient3 = getListCLients() ; 
		
		ArrayList<Client> listeClientsExpulse = new ArrayList<Client>() ;
		
		Restaurant resto1 = new Restaurant("Latte sur les rochers") ; 
		Restaurant resto2 = new Restaurant("Une tasse de joie") ; 
		Restaurant resto3 = new Restaurant() ; 
	
		Restaurant[] listeResto = new Restaurant[3] ; 
		listeResto[0] = resto1 ; 
		listeResto[1] = resto2 ; 
		listeResto[2] = resto3 ; 
		
		
		serviceClient(listeClient1, listeResto, listeClientsExpulse) ; 
		serviceClient(listeClient2, listeResto, listeClientsExpulse) ; 
		serviceClient(listeClient3, listeResto, listeClientsExpulse) ; 	
		
		displayInfos(listeResto, listeClientsExpulse) ; 
	}
	
	static void displayInfos(Restaurant[] listeResto, ArrayList<Client> listeClientsExpulse) {
		for(Restaurant resto : listeResto) 
			System.out.println("Le resto " + resto.nom + " a servit : " + resto.listeClients.size() + " clients et r�alis� " +   resto.profit + " euros de profit");
		
		System.out.println("Voici la liste des m�cr�ants ne sachant pas commander poliment ! ");
		for (Client client : listeClientsExpulse)
			System.out.println(client.nom);
	}
	
	static void serviceClient(ArrayList<Client> listeClient, Restaurant[] listeResto, ArrayList<Client> listeClientsExpulse) {
		Random rand = new Random();
		
		for(Client client : listeClient) {
			boolean expulse = listeResto[rand.nextInt(listeResto.length)].servir(client) ; 
		
			if(expulse) {
				listeClientsExpulse.add(client) ;
			}
		}
	}
	
	static ArrayList<Client> getListCLients() {
		ArrayList<Client> clients = new ArrayList<Client>() ;
		
		for(int a = 0 ; a < 20 ; a++) 
			clients.add(getRandomClient()) ; 
		
		return clients ; 
	}
	
	static Client getRandomClient() {
		Random rand = new Random();
		
		return new Client(
				BanqueDeDonne.listeNoms.get(rand.nextInt(BanqueDeDonne.listeNoms.size())),
				BanqueDeDonne.listeCommandes.get(rand.nextInt(BanqueDeDonne.listeCommandes.size())),
				BanqueDeDonne.listeTasses.get(rand.nextInt(BanqueDeDonne.listeTasses.size()))
		) ;
	}
}
