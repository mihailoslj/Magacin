package interfejs;

import java.sql.Date;

import artikal.KancelarijskiMaterijal;
import artikal.Knjiga;
import artikal.KucnaHemija;

public interface interfejs {
	public void dodajKancelarijskiMaterijal(String naziv,
			int sifra,
			String opis,
			int kolicina);
	
	public void izbaciKancelarijskiMaterijal(KancelarijskiMaterijal kc); 
	
	public KancelarijskiMaterijal pronadjiKM(int sifra);
	
	public void dodajKnjigu(String naziv,
			int sifra,
			String opis,
			int kolicina);
	
	public void izbaciKnjigu(Knjiga k);
	
	public Knjiga pronadjiKnjigu(int sifra);
	
	public void dodajKucnuHemiju(String naziv,
			int sifra,
			String opis,
			int kolicina, 
			Date rokTrajanja);
	
	public void izbaciKucnuHemiju(KucnaHemija kh);
	
	public KucnaHemija pronadjiKH(int sifra);
	
}
