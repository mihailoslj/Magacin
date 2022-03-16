package magacin;

import java.sql.Date;

import artikal.KancelarijskiMaterijal;
import artikal.KucnaHemija;
import artikal.Knjiga;

public class ImplementacijaMetoda {
	
	public void dodajKancelarijskiMaterijal(String naziv,
			int sifra,
			String opis,
			int kolicina) {
		KancelarijskiMaterijal kc = new KancelarijskiMaterijal(naziv, sifra, opis, kolicina);
		Magacin m = new Magacin();
		m.listaKancelarijskiMaterijal.add(kc);
	}
	
	public void dodajKnjigu(String naziv,
			int sifra,
			String opis,
			int kolicina) {
		Knjiga k = new Knjiga(naziv, sifra, opis, kolicina);
		Magacin m = new Magacin();
		m.listaKnjigas.add(k);
	}
	
	
	public void dodajKucnuHemiju(String naziv,
			int sifra,
			String opis,
			int kolicina, 
			Date rokTrajanja) {
		KucnaHemija kh = new KucnaHemija(naziv, sifra, opis, kolicina, rokTrajanja);
		Magacin m = new Magacin();
		m.listaKucnaHemija.add(kh);
	}
}
