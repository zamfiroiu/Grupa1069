package builder;

public class Bilet implements IBilet {

	private String destinatie;
	private String numarLoc;
	private boolean bagajCala;
	private boolean catering;

	public Bilet(String destinatie, String numarLoc, boolean bagajCala, boolean catering) {
		super();
		this.destinatie = destinatie;
		this.numarLoc = numarLoc;
		this.bagajCala = bagajCala;
		this.catering = catering;
	}

	public Bilet() {
		this("Bucuresti", "1A", false, false);
	}	

	@Override
	public String toString() {
		return "Bilet [destinatie=" + destinatie + ", numarLoc=" + numarLoc + ", bagajCala=" + bagajCala + ", catering="
				+ catering + "]";
	}

	public String getDestinatie() {
		return destinatie;
	}

	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}

	public String getNumarLoc() {
		return numarLoc;
	}

	public void setNumarLoc(String numarLoc) {
		this.numarLoc = numarLoc;
	}

	public boolean isBagajCala() {
		return bagajCala;
	}

	public void setBagajCala(boolean bagajCala) {
		this.bagajCala = bagajCala;
	}

	public boolean isCatering() {
		return catering;
	}

	public void setCatering(boolean catering) {
		this.catering = catering;
	}

}
