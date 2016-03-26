package interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valute.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(LinkedList<Kurs> kursevi, GregorianCalendar datum, double prodajniKurs, 
			double srednjiKurs, double kupovniKurs);
	public void obrisiKurs(LinkedList<Kurs> kursevi, GregorianCalendar datum);
	public Kurs pronadjiKurs(LinkedList<Kurs> kursevi, GregorianCalendar datum);
	

}
