package valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(LinkedList<Kurs> kursevi, GregorianCalendar datum, double prodajniKurs, double srednjiKurs,
			double kupovniKurs) {
		
		Kurs k = new Kurs();
		k.setDatum(datum);
		k.setProdajniKurs(prodajniKurs);
		k.setSrednjiKurs(srednjiKurs);
		k.setKupovniKurs(kupovniKurs);
		
		kursevi.add(k);
		

		
	}

	@Override
	public void obrisiKurs(LinkedList<Kurs> kursevi, GregorianCalendar datum) {
		
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatum().equals(datum))
				kursevi.remove(i);
		}

	}

	@Override
	public Kurs pronadjiKurs(LinkedList<Kurs> kursevi, GregorianCalendar datum) {
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatum().equals(datum))
				return kursevi.get(i);
		}
		return null;
	}

}
