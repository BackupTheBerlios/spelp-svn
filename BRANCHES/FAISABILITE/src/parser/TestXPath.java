package parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;

import javax.xml.namespace.NamespaceContext;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class TestXPath {
	public static Node evaluer(InputStream stream, String expression){
        Node node = null;
        try{
        //création de la source
        InputSource source = new InputSource(stream);
        
        //création du XPath 
        XPathFactory fabrique = XPathFactory.newInstance();
        XPath xpath = fabrique.newXPath();
        
        //évaluation de l'expression XPath
        XPathExpression exp = xpath.compile(expression);
        node = (Node)exp.evaluate(source,XPathConstants.NODE);
        
        }catch(XPathExpressionException xpee){
        xpee.printStackTrace();
        }
        return node;
        }
	
	public static NodeList evaluerListeNoeuds(InputStream stream, String expression){
        NodeList liste = null;
        try{
        //création de la source
        InputSource source = new InputSource(stream);
        
        //création du XPath 
        XPathFactory fabrique = XPathFactory.newInstance();
        XPath xpath = fabrique.newXPath();
        
        //évaluation de l'expression XPath
        XPathExpression exp = xpath.compile(expression);
        liste = (NodeList)exp.evaluate(source,XPathConstants.NODESET);
        
        }catch(XPathExpressionException xpee){
        xpee.printStackTrace();
        }
        return liste;
        }

	
	public static void main (String args[]){
		FileInputStream url;
		try {
			url = new FileInputStream("toyton.xml");
			String expression = "//BreakdownElement[@*[namespace-uri() and local-name()='type']='uma:RoleDescriptor']";
	        NodeList nodel = evaluerListeNoeuds(url,expression);
	        Node node;
	        for(int i=0; i<nodel.getLength(); i++) {
	        	node = nodel.item(i);
	        	//System.out.println(node.getTextContent());
		        System.out.println(node.getAttributes().getNamedItem("name").getNodeValue());
		        System.out.println("	"+node.getAttributes().getNamedItem("xsi:type").getNodeValue());
	        }
	        
	        
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       
	}
}
