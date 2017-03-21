package program;

import prototype.Avion;

public class Program {

	public static void main(String[] args) {
		Avion avion1 = null;
		Avion avion2 = null;

		try {
			avion1 = new Avion(300, 9, 31);
			System.out.println(avion1.toString());
			
			avion2 = (Avion) avion1.clone();
			
			System.out.println(avion2.toString());
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}


	}

}
