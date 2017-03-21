package program;

import simplefactory.Avion;
import simplefactory.AvionFactory;
import simplefactory.TipAvion;






public class Program {

	public static void main(String[] args) {
		AvionFactory fabricaDeAvioane = new AvionFactory();
		Avion avion=fabricaDeAvioane.createAvion(TipAvion.avionPasageri);
		avion.incarcaAvion(20);
		avion.incarcaAvion(10);
		System.out.println("In avion mai avem liber "+avion.disponibilitate());
	}

}
