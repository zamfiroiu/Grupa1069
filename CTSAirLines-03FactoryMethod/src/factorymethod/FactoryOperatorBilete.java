package factorymethod;

public class FactoryOperatorBilete implements FactoryAngajati {

	@Override
	public Angajat getAngajat() {
		return new OperatorBilete();
	}

}
