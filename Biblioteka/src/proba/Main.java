package proba;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Biblioteka;
import biblioteka.Knjiga;

public class Main {

	public static void main(String[] args) {
		Autor a1 = new Autor("Stephen", "King");
		Autor a2 = new Autor("Peter", "Straub");
		LinkedList<Autor> autoriK1 = new LinkedList<>();
		autoriK1.add(a1);
		autoriK1.add(a2);
		
		Knjiga k1 = new Knjiga("The Talisman", "978-0-670-69199-9", 
				autoriK1, "Viking", 13);
		
		Autor a3 = new Autor("Paulo", "Coelho");
		LinkedList<Autor> autoriK2 = new LinkedList<>();
		autoriK2.add(a3);
		
		Knjiga k2 = new Knjiga("The Alchemist", "0-06-250217-4", 
				autoriK2, "HarperTorch", 1);
		
		Biblioteka b = new Biblioteka();
		b.dodajKnjigu(k1);
		b.dodajKnjigu(k2);
		
		b.upisJSON("biblioteka.json");
		
		Biblioteka b2 = new Biblioteka();
		b2.citanjeJSON("biblioteka.json");
		
		System.out.println(b2.vratiSveKnjige().size());
		
		for (Knjiga k : b2.vratiSveKnjige()) {
			System.out.println(k);
		}

	}

}
