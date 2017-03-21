package simplefactory;

public class AvionCalatori implements Avion {
	private int capacitateMaxima;
	private int capacitateIncarcata;

	public AvionCalatori() {
		capacitateIncarcata=0;
		capacitateMaxima=300;
	}
	
	@Override
	public void descriere() {
		System.out.println("Avem un avion de pasageri");

	}

	@Override
	public void incarcaAvion(int capacitatea) {
		if(capacitateIncarcata+capacitatea<capacitateMaxima) {
			capacitateIncarcata += capacitatea;
			System.out.println("In avion s-au imbarcat " + capacitatea + "calatori");
		}

	}

	@Override
	public int disponibilitate() {		
		return capacitateMaxima - capacitateIncarcata;
	}

}
