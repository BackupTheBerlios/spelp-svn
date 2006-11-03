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
	private String taskDescriptor = "//BreakdownElement[@*[namespace-uri() and local-name()='type']='uma:TaskDescriptor']";
	private static Parser instance;
	private FileInputStream url;

    /**
     *  private constructor for the singleton 
     */
	private Parser() {
		try {
			url = new FileInputStream(FileXML);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *  Singleton 
	 *  @return the instance of Parser
	 */
	public static Parser getInstance() {
        if (null == instance) { // Premier appel
            instance = new Parser();
        }
        return instance;
    }

	/**
	 * function evaluate
	 * @param stream
	 * @param expression
	 * @return
	 */
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
	
	/**
	 * function evaluateNodeList
	 * @param stream
	 * @param expression
	 * @return
	 */
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
        System.out.println(exp.toString());
        liste = (NodeList)exp.evaluate(source,XPathConstants.NODESET);
        
        }catch(XPathExpressionException xpee){
        xpee.printStackTrace();
        System.out.println("probleme dans le XPathExpression");
        }
        return liste;
        }

	/**
	 * function getFileXML
	 * @return
	 */
	public static String getFileXML() {
		return FileXML;
	}

	/**
	 * procedure setFileXML
	 * @param fileXML
	 */
	public static void setFileXML(String fileXML) {
		FileXML = fileXML;
	}

	/**
	 * function getUrl
	 * @return
	 */
	public FileInputStream getUrl() {
		return url;
	}

	/**
	 * procedure setUrl
	 * @param url
	 */
	public void setUrl(FileInputStream url) {
		this.url = url;
	}
	
	/**
	 * function getRole
	 * @return Arraylist
	 *  */
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
	
	/**
	 * function getPrimaryTaskByRole
	 * @return Arraylist
	 * @param String roleName
	 *  */	
	public ArrayList getPrimaryTaskByRole(String roleName) {
		ArrayList<String> primaryTask = new ArrayList<String>();
		NodeList nodel = evaluateNodeList(url, taskDescriptor);
		Node node;
		String task;
		for(int i=0;i<nodel.getLength();i++){
			node = nodel.item(i);
			task = node.getAttributes().getNamedItem("name").getNodeValue();
			primaryTask.add(task);
		}
		
		return primaryTask;
	}

	/**
	 * function getTask
	 * @return Arraylist
	 *  */
	public ArrayList getTask() {
		ArrayList<String> taskList = new ArrayList<String>();
		NodeList nodel = evaluateNodeList(url, taskDescriptor);
		Node node;
		String task;
		for(int i=0;i<nodel.getLength();i++){
			node = nodel.item(i);
			task = node.getAttributes().getNamedItem("name").getNodeValue();
			taskList.add(task);
		}
		return taskList;
	}
	
}
