package builder;

public class BiletBuilder implements IBiletBuilder {

	private IBilet bilet;

	public BiletBuilder() {
		super();
		this.bilet = new Bilet();
	}

	public BiletBuilder setDestinatie(String destinatie) {
		bilet.setDestinatie(destinatie);
		return this;
	}

	public BiletBuilder setNumarLoc(String numarLoc) {
		bilet.setNumarLoc(numarLoc);
		return this;
	}

	public BiletBuilder setBagajCala(boolean bagajCala) {
		bilet.setBagajCala(bagajCala);
		return this;
	}

	public BiletBuilder setCatering(boolean catering) {
		bilet.setCatering(catering);
		return this;
	}

	@Override
	public IBilet build(String destinatie) {
		bilet.setDestinatie(destinatie);
		return bilet;
	}

}
