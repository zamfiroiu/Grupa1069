package abstractfactory;

public class FactoryTransportMarfa implements FactoryTransport {

	@Override
	public TransportPrivat getTransportPrivat() {
		return new TransportPrivatMarfa();
	}

	@Override
	public TransportPublic getTransportPublic() {
		return new TransportPublicMarfa();
	}

}
