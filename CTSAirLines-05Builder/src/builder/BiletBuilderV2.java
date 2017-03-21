package builder;

public class BiletBuilderV2 implements IBiletBuilder {

	private String destinatie;
	private String numarLoc;
	private boolean bagajCala;
	private boolean catering;

	public BiletBuilderV2() {
		super();
		this.destinatie = "bUCURESTI";
		this.numarLoc = "1B";
		this.bagajCala = false;
		this.catering = false;
	}

	public BiletBuilderV2 setDestinatie(String destinatie) {
		this.destinatie = destinatie;
		return this;
	}

	public BiletBuilderV2 setNumarLoc(String numarLoc) {
		this.numarLoc = numarLoc;
		return this;
	}

	public BiletBuilderV2 setBagajCala(boolean bagajCala) {
		this.bagajCala = bagajCala;
		return this;
	}

	public BiletBuilderV2 setCatering(boolean catering) {
		this.catering = catering;
		return this;
	}

	@Override
	public IBilet build(String destinatie) {
		return new Bilet(destinatie, numarLoc, bagajCala, catering);
	}

}
