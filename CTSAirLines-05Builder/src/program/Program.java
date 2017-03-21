package program;

import builder.Bilet;
import builder.BiletBuilder;
import builder.BiletBuilderV2;
import builder.IBilet;

public class Program {

	public static void main(String[] args) {

		IBilet bilet= new Bilet();
		bilet.setDestinatie("Timisoara");
		bilet.setCatering(true);
		bilet.setBagajCala(false);
		bilet.setNumarLoc("2E");
		
		System.out.println(bilet.toString());

		
		//utilizand builder		
		BiletBuilder bb=new BiletBuilder();
		IBilet bilet2 = new BiletBuilderV2().setDestinatie("Honolulu").setNumarLoc("5E").setCatering(true).build("Iasi");
		System.out.println(bilet2.toString());
	}

}
