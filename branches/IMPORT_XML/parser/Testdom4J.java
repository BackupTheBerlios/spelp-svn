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
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.XPath;
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
			is = new FileInputStream("essai.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SAXReader reader = new SAXReader();
        	try {
				Document document = reader.read(is);
				
				Element root = document.getRootElement();
				
				System.out.println(root.nodeCount());
				
				String hobby = document.valueOf("/toine/essai[@name='toine']/hobby/@name");
				System.out.println("hobby: "+hobby);
				
				/*root = document.getRootElement();
			    Iterator elementIterator = root.elementIterator();
			    while(elementIterator.hasNext()){
			      Element element = (Element)elementIterator.next();
			      System.out.println(element.getName());
			    }*/
				
			    
			    /*XPath xpathSelector = DocumentHelper.createXPath("/toine/essai[@name='toine']/hobby");
				List results = xpathSelector.selectNodes(document);
				for ( Iterator iter = results.iterator(); iter.hasNext();)
				{
				  Element element = (Element) iter.next();
				  System.out.println(element.getName());
				}*/
			    
			     
				/* List list = document.selectNodes("//BreakdownElement");
				
				 for (Iterator iter = list.iterator(); iter.hasNext(); ) {
			            Attribute attribute = (Attribute) iter.next();
			            String val = attribute.getValue();
			            System.out.println(val);
			        } */ 
			    //String role = document.valueOf("//BreakdownElement[@name='developer']");

			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated catch block
 	        
	       
        

	}

}
