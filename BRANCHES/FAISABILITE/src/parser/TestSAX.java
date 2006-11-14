package parser;

import java.io.FileReader;
import java.io.IOException;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class TestSAX extends DefaultHandler
{

    public static void main (String args[])
	throws Exception
    {
	XMLReader xr = XMLReaderFactory.createXMLReader();
	TestSAX handler = new TestSAX();
	xr.setContentHandler(handler);
	xr.setErrorHandler(handler);

				// Parse each file provided on the
				// command line.
	//for (int i = 0; i < args.length; i++) {
		
	    FileReader r = new FileReader("sortieEPF.xml");
	    xr.parse(new InputSource(r));
	//}
    }


    public TestSAX ()
    {
	super();
    }


    ////////////////////////////////////////////////////////////////////
    // Event handlers.
    ////////////////////////////////////////////////////////////////////


    public void startDocument ()
    {
	System.out.println("Start document");
    }


    public void endDocument ()
    {
	System.out.println("End document");
    }


    public void startElement (String uri, String name,
			      String qName, Attributes atts)
    {
	if ("".equals (uri))
	    System.out.println("Start element: " + qName);
	else
	    System.out.println("Start element: {" + uri + "}" + name);
    }


    public void endElement (String uri, String name, String qName)
    {
	if ("".equals (uri))
	    System.out.println("End element: " + qName);
	else
	    System.out.println("End element:   {" + uri + "}" + name);
    }


    public void characters (char ch[], int start, int length)
    {
	System.out.print("Characters:    \"");
	for (int i = start; i < start + length; i++) {
	    switch (ch[i]) {
	    case '\\':
		System.out.print("\\\\");
		break;
	    case '"':
		System.out.print("\\\"");
		break;
	    case '\n':
		System.out.print("\\n");
		break;
	    case '\r':
		System.out.print("\\r");
		break;
	    case '\t':
		System.out.print("\\t");
		break;
	    default:
		System.out.print(ch[i]);
		break;
	    }
	}
	System.out.print("\"\n");
    }

}
