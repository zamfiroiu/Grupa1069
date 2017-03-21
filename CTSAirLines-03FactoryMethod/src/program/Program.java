package program;

import factorymethod.Angajat;
import factorymethod.FactoryAngajati;
import factorymethod.FactoryOperatorBilete;

public class Program {

	public static void main(String[] args) {
		FactoryAngajati fabricaAngajati = new FactoryOperatorBilete();
		
		Angajat angajat = fabricaAngajati.getAngajat();
		angajat.maresteSalariu(0.2);
		System.out.println(angajat.toString());
		
	}

}
