package prototype;

public class Avion implements AvionPrototype{

	private double greutate;
	private int anverguraAripi;
	private double capacitateRezervor;

	public AvionPrototype clone() {
		AvionPrototype avion = null;
		try {
			avion = new Avion(this.getGreutate(), this.getAnverguraAripi(), this.getCapacitateRezervor());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return avion;		
	}
	public Avion(double greutate, int anverguraAripi, double capacitateRezervor) throws Exception {
		super();
		if (greutate > 100 && greutate < 2000) {
			this.greutate = greutate;
		} else {
			throw new Exception("Greutate incorecta");
		}
		if (anverguraAripi > 8 && anverguraAripi < 20) {
			this.anverguraAripi = anverguraAripi;
		}else{
			throw new Exception("Anvergura aripi incorecta");
		}
		if (capacitateRezervor > greutate * 0.1) {
			this.capacitateRezervor = capacitateRezervor;
		}
		else{
			throw new Exception("Capacitate rezervor incorecta");
		}
	}

	public double getGreutate() {
		return greutate;
	}

	public void setGreutate(double greutate) {
		this.greutate = greutate;
	}

	public int getAnverguraAripi() {
		return anverguraAripi;
	}

	public void setAnverguraAripi(int anverguraAripi) {
		this.anverguraAripi = anverguraAripi;
	}

	public double getCapacitateRezervor() {
		return capacitateRezervor;
	}

	public void setCapacitateRezervor(double capacitateRezervor) {
		this.capacitateRezervor = capacitateRezervor;
	}

	@Override
	public String toString() {
		return "Avion [greutate=" + greutate + ", anverguraAripi=" + anverguraAripi + ", capacitateRezervor="
				+ capacitateRezervor + "]";
	}
	
	

}
