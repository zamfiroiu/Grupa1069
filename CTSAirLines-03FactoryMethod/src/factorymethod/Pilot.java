package factorymethod;

public class Pilot extends Angajat {

	@Override
	public double getSalariu() {
		return super.getSalariu()*2;
	}

	@Override
	public void maresteSalariu(double procentMarire) {
		if(procentMarire > 0)
		{
			super.setSalariu((super.getSalariu()*procentMarire)+super.getSalariu());			
		}		
	}
}
