package zad2;
import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XML {
	public void createXMLFile(String fileName, List<Vraboten> vraboten) {
		try {

		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.newDocument();

		Element root = document.createElement("Vraboteni");
		document.appendChild(root);

		for (Vraboten v : vraboten) {
		
		Element vrabotenElement = document.createElement("Vraboten");
		root.appendChild(vrabotenElement);
		Element ime =  document.createElement("Ime");
		vrabotenElement.appendChild(ime);
		Element prezime = document.createElement("Prezime");
		vrabotenElement.appendChild(prezime);
		Element plata = document.createElement("Plata");
		vrabotenElement.appendChild(plata);

		prezime.appendChild(document.createTextNode(v.getIme()));
		ime.appendChild(document.createTextNode(v.getPrezime()));
		plata.appendChild(document.createTextNode(v.getPlata()));
		}
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(new File(fileName));

		transformer.transform(source, result);
		System.out.println("Fajlot e kreiran, imeto e: "+ fileName);

		System.out.println("Fajlot e zachuvan.");
		} 
		catch (Exception e) {
				System.out.println(e.toString());
			}
		}
}
