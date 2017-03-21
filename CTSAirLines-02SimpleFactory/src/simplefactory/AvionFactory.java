package simplefactory;

public class AvionFactory {
	
	public Avion createAvion(TipAvion tipAvion){
		if(tipAvion == TipAvion.avionCargo){
			return new AvionCargo();
		} else{
			return new AvionCalatori();
		}
	}

}
