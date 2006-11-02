package parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Parser {

	private static String FileXML = "toyton.xml";
	private String roleDescriptor = "//BreakdownElement[@*[namespace-uri() and local-name()='type']='uma:RoleDescriptor']";
	private static Parser instance;
	private FileInputStream url;

    /* private constructor for the singleton */
	private Parser() {
		try {
			url = new FileInputStream(FileXML);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* Singleton */
	public static Parser getInstance() {
        if (null == instance) { // Premier appel
            instance = new Parser();
        }
        return instance;
    }

	public static Node evaluate(InputStream stream, String expression){
        Node node = null;
        try{
        //create source
        InputSource source = new InputSource(stream);
        
        //creare XPath 
        XPathFactory fabrique = XPathFactory.newInstance();
        XPath xpath = fabrique.newXPath();
        
        //evaluate Xpath expression
        XPathExpression exp = xpath.compile(expression);
        node = (Node)exp.evaluate(source,XPathConstants.NODE);
        
        }catch(XPathExpressionException xpee){
        xpee.printStackTrace();
        }
        return node;
        }
	
	public static NodeList evaluateNodeList(InputStream stream, String expression){
        NodeList liste = null;
        try{
        //create source
        InputSource source = new InputSource(stream);
        
        //create XPath 
        XPathFactory fabrique = XPathFactory.newInstance();
        XPath xpath = fabrique.newXPath();
        
        //evaluate Xpath expression
        XPathExpression exp = xpath.compile(expression);
        liste = (NodeList)exp.evaluate(source,XPathConstants.NODESET);
        
        }catch(XPathExpressionException xpee){
        xpee.printStackTrace();
        }
        return liste;
        }

	public static String getFileXML() {
		return FileXML;
	}

	public static void setFileXML(String fileXML) {
		FileXML = fileXML;
	}

	public FileInputStream getUrl() {
		return url;
	}

	public void setUrl(FileInputStream url) {
		this.url = url;
	}
	
	public ArrayList getRole() {
		ArrayList<String> roleList = new ArrayList<String>();
		NodeList nodel = evaluateNodeList(url,roleDescriptor);
		Node node;
		String role;
		for(int i=0; i<nodel.getLength(); i++) {
        	node = nodel.item(i);
        	//System.out.println(node.getTextContent());
	        role = node.getAttributes().getNamedItem("name").getNodeValue();
	        roleList.add(role);
		}		
		return roleList;
	}
	
}
