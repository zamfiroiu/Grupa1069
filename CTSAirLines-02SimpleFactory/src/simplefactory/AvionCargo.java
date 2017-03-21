package simplefactory;

public class AvionCargo implements Avion {
private int capacitateMaxima;
private int capacitateIncarcata;

	public AvionCargo() {
		capacitateMaxima=1000;
		capacitateIncarcata=0;
	}
	
	@Override
	public void descriere() {
		System.out.println("Avem un avion Cargo");

	}

	@Override
	public void incarcaAvion(int capacitatea) {
		if(capacitateIncarcata+capacitatea<capacitateMaxima) {
			capacitateIncarcata += capacitatea;
			System.out.println("In avion se incarca "+capacitatea+" tone");
		}

	}

	@Override
	public int disponibilitate() {
		return capacitateMaxima-capacitateIncarcata;
	}

}
