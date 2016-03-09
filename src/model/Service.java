package model;

import java.util.ArrayList;
import java.util.List;

import model.Produs;
import model.Service;

public class Service {

	private static List<Produs> electronice;
	
	static {
		
		electronice = new ArrayList<Produs>();
		
		electronice.add( new Produs(1, "Mixer Bosch",
				89.99,
				"https://boschmixers.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/s/t/styline_package.jpg",
				"Descriere pentru mixer") );
		electronice.add( new Produs(2, 
				"iPhone6",
				4500.00,
				"http://store.storeimages.cdn-apple.com/4973/as-images.apple.com/is/image/AppleInc/aos/published/images/i/ph/iphone6/plus/iphone6-plus-box-space-gray-2014_GEO_US?wid=478&hei=595&fmt=jpeg&qlt=95&op_sharpen=0&resMode=bicub&op_usm=0.5,0.5,0,0&iccEmbed=0&layer=comp&.v=1453545761859", 
				"Descriere pentru iPhone") );
		electronice.add( new Produs(3, 
				"fier de calcat Tefal",
				250.01,
				"http://cdn.altex.ro/media/catalog/product/cache/1/image/600x/9df78eab33525d08d6e5fb8d27136e95/f/v/fv3910.jpg", 
				"Descriere pentru fier de calcat") );
	}

	public static List<Produs> getElectronice() {
		return electronice;
	}

	public static void setProduse(List<Produs> produse) {
		Service.electronice = produse;
	}

	public static Produs getProdusDupaId(int id) {
		
		return electronice.get(id-1);
	}

	
	
}
