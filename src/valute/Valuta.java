package valute;


public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private Kurs kurs;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null)
			throw new RuntimeException("Naziv ne smije biti null.");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv == null || skraceniNaziv.length() > 3)
			throw new RuntimeException("Skraceni naziv ne smije biti null ili duzi od 3 karaktera.");
		this.skraceniNaziv = skraceniNaziv;
	}
	public Kurs getKurs() {
		return kurs;
	}
	public void setKurs(Kurs kurs) {
		if(kurs == null)
			throw new RuntimeException("Kurs ne smije biti null.");
		this.kurs = kurs;
	}
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", kurs=" + kurs + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Valuta){
			Valuta v = (Valuta) (obj);
			if(v.getKurs().equals(kurs) && v.getNaziv().equals(naziv) 
					&& v.getSkraceniNaziv().equals(skraceniNaziv)){
				return true;
			}
		}
		return false;
	}
	
	
}
