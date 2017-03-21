package program;

import abstractfactory.FactoryTransport;
import abstractfactory.FactoryTransportMarfa;
import abstractfactory.FactoryTransportPersoane;
import abstractfactory.TransportPrivat;
import abstractfactory.TransportPublic;

public class Program {

	public static void main(String[] args) {
		FactoryTransport fabrica = new FactoryTransportMarfa();
		
		TransportPrivat transportPrivat = fabrica.getTransportPrivat();
		TransportPublic transportPublic = fabrica.getTransportPublic();
		
		transportPrivat.descriere();
		transportPublic.descriere();

	}

}
