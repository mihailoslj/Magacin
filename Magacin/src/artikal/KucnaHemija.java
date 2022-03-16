package artikal;

import java.sql.Date;
import java.util.Objects;

public class KucnaHemija {
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	private Date rokTrajanja;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public Date getRokTrajanja() {
		return rokTrajanja;
	}
	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	@Override
	public String toString() {
		return "KucnaHemija [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina
				+ ", rokTrajanja=" + rokTrajanja + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, rokTrajanja, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& Objects.equals(rokTrajanja, other.rokTrajanja) && sifra == other.sifra;
	}
	
	
}
