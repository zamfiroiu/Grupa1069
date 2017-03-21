package factorymethod;

public class OperatorBilete extends Angajat {

	public double getSalariu() {
		return super.getSalariu()*1.3;
	}
	
	@Override
	public void maresteSalariu(double procentMarire) {
		if(procentMarire > 0)
		{
			super.setSalariu((super.getSalariu()*procentMarire)+super.getSalariu());			
		}
	}

	@Override
	public String toString() {
		return "OperatorBilete: "+ super.toString();
	}
	
	

}
