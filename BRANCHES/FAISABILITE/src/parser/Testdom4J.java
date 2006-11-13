package parser;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;




public class Testdom4J {
	private static String roleDescriptor = "//BreakdownElement[@*[namespace-uri() and local-name()='type']='uma:RoleDescriptor']/@name";

		
	/**
	 * @param args
	 * @throws MalformedURLException 
	 * @throws DocumentException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		try {
			is = new FileInputStream("sortieEPF.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SAXReader reader = new SAXReader();
        	try {
				Document document = reader.read(is);
				
				Element root = document.getRootElement();

				
				List list = document.selectNodes("");

		        for (Iterator iter = list.iterator(); iter.hasNext(); ) {
		        	Attribute node = (Attribute) iter.next();
		            
		            System.out.println(node.getValue());
		        }
				System.out.println(root);
				
				/* List list = document.selectNodes("//BreakdownElement");
				
				 for (Iterator iter = list.iterator(); iter.hasNext(); ) {
			            Attribute attribute = (Attribute) iter.next();
			            String val = attribute.getValue();
			            System.out.println(val);
			        } */ 

			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated catch block
 	        
	       
        

	}

}
