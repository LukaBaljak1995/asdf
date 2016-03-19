package interfejsi;
import java.util.GregorianCalendar;

import valute.Valuta;

public interface Interfejs {
	
	public void dodajKurs(double kurs, GregorianCalendar
			datum);
	public void obrisiKurs(double kurs, GregorianCalendar datum);
	public double pronadjiKurs(String naziv, GregorianCalendar datum);
	
	
}
