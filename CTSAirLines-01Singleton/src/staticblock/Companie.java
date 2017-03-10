package staticblock;

public class Companie {	

	private int id;
	private String nume;
	
	private static Companie instanta ;
	
	static{
		try {
			instanta = new Companie();
		}catch(Exception exception) {
			System.out.println(exception);
		}
	}
	
	public static synchronized Companie creazaInstanta() {
		return instanta;
	}

	private Companie() {
		this(1, "CTSAirLines");
	}

	private Companie(int id, String nume) {
		super();
		this.id = id;
		this.nume = nume;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Companie [id=" + id + ", nume=" + nume + "]";
	}
}
