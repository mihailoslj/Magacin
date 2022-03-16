package artikal;

import java.util.Objects;

public class KancelarijskiMaterijal {
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null) {
			throw new NullPointerException("Naziv ne sme da bude null!");
		}
		if(naziv.isEmpty()) {
			throw new IllegalArgumentException("Naziv ne sme da bude prazan string!");
		}
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if(sifra < 0 ) {
			throw new IllegalArgumentException("Sifra mora biti pozitivan broj!");
		}
		
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis == null) {
			throw new NullPointerException("Naziv ne sme da bude null!");
		}
		if(opis.length() < 20 && opis.isEmpty()) {
			throw new IllegalArgumentException("Opis mora da ima vise od 20 karaktera!");
		}
		
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina < 0) {
			throw new IllegalArgumentException("Kolicina ne sme da bude manja od 0!");
		}
		this.kolicina = kolicina;
	}
	@Override
	public String toString() {
		return "KancelarijskiMaterijal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina="
				+ kolicina + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KancelarijskiMaterijal other = (KancelarijskiMaterijal) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& sifra == other.sifra;
	}
	
	
}
