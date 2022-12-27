package zad2;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<Vraboten> v = new ArrayList<Vraboten>();
		
		v.add(new Vraboten("Petko", "Panovski", "10000"));
		v.add(new Vraboten("Stefan", "Stefovski", "15000"));
		v.add(new Vraboten("Macko", "Stojcevski", "20000"));
		
		XML xml = new XML();
		xml.createXMLFile("xml.xml", v);

	}

}
