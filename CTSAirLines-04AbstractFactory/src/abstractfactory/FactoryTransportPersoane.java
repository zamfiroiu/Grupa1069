package abstractfactory;

public class FactoryTransportPersoane implements FactoryTransport {

	@Override
	public TransportPrivat getTransportPrivat() {
		return new TrasportPrivatPersoane();
	}

	@Override
	public TransportPublic getTransportPublic() {
		return new TransportPublicPersoane();
	}

}
