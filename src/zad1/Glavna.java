package zad1;

public class Glavna {

	public static void main(String[] args) {
		Vraboten vraboten= new Vraboten();
		vraboten.setIme("Petko");
		vraboten.setPrezime("Petkovski");
		vraboten.setPlata("22000");
		XML xml=new XML();
		xml.createXMLFile("XML.xml", vraboten );

	}

}
