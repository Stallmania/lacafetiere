package Partie_4;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	Cafetiere cafetiere ;
	double profit ; 
	List<Client> listeClientServi ; 
	String nom ; 
	
	
	public Restaurant() {
		this("Le Restaurant") ; 
	}
	
	public Restaurant(String nom) {
		this.nom = nom ; 
		cafetiere = new Cafetiere() ; 
		listeClientServi = new ArrayList<>() ; 
	}
	
	public double servir(Client client) {
		if(client.commandeCafe != null && client.commandeCafe.typeCafe != TypeCafe.BATARD) {
			double cout = 0; 
			if(client.tasse == null) {
				if(client.commandeCafe.quantiteLiquideMl <= 100) {
					cout += 2 ; 
					client.tasse = new Tasse() ;
				} else {
					cout += 3 ; 
					client.tasse = new Tasse(500) ;
				}
			}
			
			cout += client.commandeCafe.quantiteLiquideMl * client.commandeCafe.typeCafe.coutParMl ; 		
			client.tasse.addCafe(client.commandeCafe) ; 
			profit += cout ; 
			client.valeurFacture = cout;
			return cout ; 
		}
		
		System.out.println("Expulse le client " + client.nom + " du restaurant ! ");
		return 0 ; 
	
	}
	
	public void showInfoResto()
	{
		System.out.println("Je suis le resto " +nom + " J'ai fais " + profit + " De profit en servant " + listeClientServi.size() + " clients");
	}
	
}