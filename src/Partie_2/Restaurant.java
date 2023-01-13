package Partie_2;

public class Restaurant {

	Cafetiere cafetiere ;
	double profit ; 
	
	public Restaurant() {
		cafetiere = new Cafetiere() ; 
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
	
}