package valute;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;

	private GregorianCalendar datum;

	public String getNaziv() {
		return naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

}
