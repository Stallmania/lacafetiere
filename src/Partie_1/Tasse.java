package Partie_1;

public class Tasse {

	double quantiteCafeMax ; 
	Cafe cafe ; 
	
	Tasse() {
		quantiteCafeMax = 100 ;
	}
	
	Tasse(float quantiteCafeMax) {
		this.quantiteCafeMax = quantiteCafeMax ; 
	}
	
	public double boire(double quantiteBut) {
		cafe.quantiteLiquideMl -= quantiteBut ; 
		return cafe.quantiteLiquideMl ; 
	}
	
	public void boire() {
		cafe.quantiteLiquideMl = 0 ;
	}
}