package valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(LinkedList<Kurs> kursevi, GregorianCalendar datum, double prodajniKurs, double srednjiKurs,
			double kupovniKurs) {
		
		Kurs kurs = new Kurs();
		kurs.setKupovniKurs(kupovniKurs);
		kurs.setProdajniKurs(prodajniKurs);
		kurs.setSrednjiKurs(srednjiKurs);
		kurs.setDatum(datum);
		
		if(kurs != null)
			kursevi.add(kurs);

	}

	@Override
	public void obrisiKurs(LinkedList<Kurs> kursevi, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs pronadjiKurs(LinkedList<Kurs> kursevi, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
