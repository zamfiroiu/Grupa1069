package factorymethod;

public abstract class Angajat {

	private String nume;
	private double salariu;
	
	public void setSalariu(double salariu) {
		this.salariu = salariu;
	}

	public Angajat() {
		nume = "Popescu";
		salariu = 2000;
	}
	
	@Override
	public String toString() {
		return "Angajat [nume=" + nume + ", salariu=" + salariu + "]";
	}
	
	public abstract void maresteSalariu(double procentMarire);

	public double getSalariu() {
		return salariu;
	}
}
