package factorymethod;

public class FactoryPilot implements FactoryAngajati {

	@Override
	public Angajat getAngajat() {
		return new Pilot();
	}

}
