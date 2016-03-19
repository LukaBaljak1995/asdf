package valute;

import java.util.GregorianCalendar;

import javax.management.RuntimeErrorException;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;

	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs < 0)
			throw new RuntimeException("Kurs ne sme biti negativan.");
		else
			this.prodajniKurs = prodajniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs < 0)
			throw new RuntimeException("Kurs ne sme biti negativan.");
		else
			this.kupovniKurs = kupovniKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs < 0)
			throw new RuntimeException("Kurs ne sme biti negativan.");
		else
			this.srednjiKurs = srednjiKurs;
	}

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
		if (naziv == null || naziv.isEmpty())
			throw new RuntimeException("Greska u unosu naziva");
		else
			this.naziv = naziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv == null || skraceniNaziv.isEmpty())
			throw new RuntimeException("Greska u unosu skracenog naziva");
		else
			this.skraceniNaziv = skraceniNaziv;
	}

	public void setDatum(GregorianCalendar datum) {
		if (datum == null)
			throw new RuntimeException("Greska u unosu datuma!");
		else
			this.datum = datum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Valuta))
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", datum=" + datum + "]";
	}

}
