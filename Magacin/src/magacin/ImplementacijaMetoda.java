package magacin;

import java.sql.Date;

/*<<<<<<< HEAD
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
		m.listaKnjiga.add(k);
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
=======*/

import artikal.KancelarijskiMaterijal;
import artikal.Knjiga;
import artikal.KucnaHemija;


public class ImplementacijaMetoda {
	
	public void dodajKancelarijskiMaterijal(String naziv,int sifra,String opis,int kolicina) {
		
		KancelarijskiMaterijal km = new KancelarijskiMaterijal();
		Magacin m = new Magacin();
		
		km.setNaziv(naziv);
		km.setSifra(sifra);
		km.setOpis(opis);
		km.setKolicina(kolicina);
		m.listaKancelarijskiMaterijal.add(km);
		
	}
	
	public void izbaciKancelarijskiMaterijal(KancelarijskiMaterijal km) throws Exception {
		Magacin m = new Magacin();
		if(m.listaKancelarijskiMaterijal.contains(km))
			m.listaKancelarijskiMaterijal.remove(km);
		else
			throw new Exception("Ne postoji taj  knjkancelarijski materijal na spisku.");
	}
	
	public KancelarijskiMaterijal pronadjiKM(int sifra) throws Exception {
		Magacin m = new Magacin();
		for(KancelarijskiMaterijal km : m.listaKancelarijskiMaterijal) {
			if(km.getSifra() == sifra) {
				return km;
			}
		}
		throw new Exception("Ne postoji taj kancelarijski materijal na spisku");
	}
	
	public void dodajKnjigu(String naziv,int sifra,String opis,int kolicina) {
		
			Knjiga k = new Knjiga();
			Magacin m = new Magacin();
			k.setNaziv(naziv);
			k.setSifra(sifra);
			k.setOpis(opis);
			k.setKolicina(kolicina);
			m.listaKnjiga.add(k);
			}
	
	public void izbaciKnjigu(Knjiga k) throws Exception {
		Magacin m = new Magacin();
		if(m.listaKnjiga.contains(k))
			m.listaKnjiga.remove(k);
		else
			throw new Exception("Ne postoji ta knjiga na spisku.");
	}
	
	public Knjiga pronadjiKnjigu(int sifra) throws Exception {
		Magacin m = new Magacin();
		for(Knjiga k : m.listaKnjiga) {
			if(k.getSifra() == sifra) {
				return k;
			}
		}
		throw new Exception("Ne postoji ta knjiga na spisku");
	}
	
	
	public void dodajKucnuHemiju(String naziv,int sifra,String opis,int kolicina, Date rokTrajanja) {
		KucnaHemija kh = new KucnaHemija();
		Magacin m = new Magacin();
		
		kh.setNaziv(naziv);
		kh.setSifra(sifra);
		kh.setOpis(opis);
		kh.setKolicina(kolicina);
		kh.setRokTrajanja(rokTrajanja);
		m.listaKucnaHemija.add(kh);
	}
	
	public void izbaciKucnuHemiju(KucnaHemija kh) throws Exception {
		Magacin m = new Magacin();
		if(m.listaKucnaHemija.contains(kh))
			m.listaKucnaHemija.remove(kh);
		else
			throw new Exception("Ne postoji ta kucna hemija na spisku.");
	}
	
	public KucnaHemija pronadjiKH(int sifra) throws Exception {
		Magacin m = new Magacin();
		for(KucnaHemija kh : m.listaKucnaHemija) {
			if(kh.getSifra() == sifra) {
				return kh;
			}
		}
		throw new Exception("Ne postoji ta kucna hemija na spisku");
		
	}
	
//>>>>>>> refs/heads/implementacijainterfejsa
}
