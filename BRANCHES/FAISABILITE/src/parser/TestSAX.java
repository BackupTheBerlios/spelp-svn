package parser;

import java.io.IOException;

import org.xml.sax.*;
import org.xml.sax.helpers.XMLReaderFactory;

public class TestSAX {

	/**
	 * @param args
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws SAXException, IOException {
		// TODO Auto-generated method stub

		XMLReader saxReader = XMLReaderFactory.createXMLReader();

	    
	    saxReader.parse("sortieEPF.xml");
		saxReader.getContentHandler().startDocument();
	}

}
