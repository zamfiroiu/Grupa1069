package abstractfactory;

public class TrasportPrivatPersoane implements TransportPrivat {

	@Override
	public void descriere() {
		System.out.println("Avionul transporta persoane in mod privat");
	}

}
