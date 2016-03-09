package model;

public class Produs {

	private int id;
	private String denumire;
	private double pret;
	private String calePoza;
	private String descriere;

//	public Produs(String denumire, double pret, String calePoza) {
//		super();
//		this.denumire = denumire;
//		this.pret = pret;
//		this.calePoza = calePoza;
//	}
//	
	public Produs(int id, String denumire, double pret, String calePoza, String descriere) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.pret = pret;
		this.calePoza = calePoza;
		this.descriere = descriere;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	


	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public String getCalePoza() {
		return calePoza;
	}

	public void setCalePoza(String calePoza) {
		this.calePoza = calePoza;
	}

	@Override
	public String toString() {
		return "Produs [denumire=" + denumire + ", pret=" + pret + ", calePoza=" + calePoza + "]";
	}
	
	
	
}
