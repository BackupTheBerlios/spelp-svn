package parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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
	private static String roleDescriptor = "//BreakdownElement[@*[namespace-uri() and local-name()='type']='uma:RoleDescriptor']";
	private static String taskDescriptor = "//BreakdownElement[@*[namespace-uri() and local-name()='type']='uma:TaskDescriptor']";
	private static Parser instance;

    /**
     *  private constructor for the singleton 
     */
	private Parser() {
		
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
        	stream.mark(0);
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
	public static NodeList evaluateNodeList(InputStream stream, String expression) {
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
        System.out.println(xpee.getCause().toString());
        
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
	 * function getRole
	 * @return Arraylist
	 *  */
	public ArrayList getRole() {
		ArrayList<String> roleList = new ArrayList<String>();
		NodeList nodel ;
		Node node;
		String role;
		String o; /* for the occurence */
		ArrayList<String> rolelistTemp = new ArrayList<String>(); /* for the occurence */
		
		try {
			FileInputStream url = new FileInputStream(FileXML);
			nodel = evaluateNodeList(url,roleDescriptor);
			for(int i=0; i<nodel.getLength(); i++) {
	        	node = nodel.item(i);
	            role = node.getAttributes().getNamedItem("name").getNodeValue();
		        roleList.add(role);
			}		
			/* delete the role occurence */
		    for (int i=0; i<roleList.size(); i++) {
		    	o = roleList.get(i);
		    	if (!rolelistTemp.contains(o))
		    		rolelistTemp.add(o);
		    }
		    roleList = null; 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rolelistTemp;		
	}
	
	public String getPresentationNameByName (String elementName) {
		String presentationName = "";
		String req = "//*[@name='"+elementName+"']";
		try {			
			FileInputStream url = new FileInputStream(FileXML);
			Node node = evaluate(url, req);
			presentationName = node.getAttributes().getNamedItem("presentationName").getNodeValue();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return presentationName;
	}
	
	/**
	 * function getPrimaryTaskByRole
	 * @return Arraylist
	 * @param String roleName
	 *  */	
	public ArrayList<String> getPrimaryTaskByRole(String roleName) {
		ArrayList<String> primaryTask = new ArrayList<String>();
		// get the id with the parameter
		Node node;
		List<String> ids = new ArrayList<String>();
		
		String req = "//BreakdownElement[@name='"+roleName+"']";
		try {			
			FileInputStream url = new FileInputStream(FileXML);
			NodeList nodel = evaluateNodeList(url, req);
			for(int i=0;i<nodel.getLength();i++) {
				node = nodel.item(i);
				System.out.println(node.getAttributes().getNamedItem("id").getNodeValue());
				ids.add(node.getAttributes().getNamedItem("id").getNodeValue());
			}
			
		
			
			// request to find the task with the id
			req = "//BreakdownElement[PerformedPrimarilyBy='"+ids.get(0)+"'";
			for(int i=1;i<ids.size();i++) {
				req += " or PerformedPrimarilyBy='"+ids.get(i)+"'";
			}
			req += "]";
				
			url = new FileInputStream(FileXML);
			System.out.println(req);
			nodel = evaluateNodeList(url, req);
			
			for(int i=0;i<nodel.getLength();i++) {
				node = nodel.item(i);
				System.out.println(node.getAttributes().getNamedItem("name").getNodeValue());
				// ajout de l'element s'il n'existe pas dans la collection
				if (! primaryTask.contains(node.getAttributes().getNamedItem("name").getNodeValue())){
					primaryTask.add(node.getAttributes().getNamedItem("name").getNodeValue());
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return primaryTask;
	}

	/**
	 * function getTask
	 * @return Arraylist of the all task
	 *  */
	public ArrayList<String> getTask() {
		ArrayList<String> taskList = new ArrayList<String>();
		try {
			FileInputStream url = new FileInputStream(FileXML);
			NodeList nodel = evaluateNodeList(url, taskDescriptor);
			Node node;
			String task;
			for(int i=0;i<nodel.getLength();i++){
				node = nodel.item(i);
				task = node.getAttributes().getNamedItem("name").getNodeValue();
				taskList.add(task);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskList;
	}
	
	/**
	 * function getMethodName
	 * @return String 
	 */
	public String getMethodName(){
		Node node;
		String desc = "";
		
		// get the main description
		String req = "//MethodPlugin";
		try {
			FileInputStream url = new FileInputStream(FileXML);
			node = evaluate(url, req);
			desc = node.getAttributes().getNamedItem("name").getNodeValue();
			System.out.println(desc);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return desc;
	}
	
	/**
	 * function getDescriptionByRole
	 * @return Arraylist
	 * @param String roleName
	 *  */	
	public String getDescriptionByRole(String roleName) {		
		Node node;
		String desc = "";		
		
		try {
			// get the brief bescription
			String req = "//ContentElement[@name='"+roleName+"']";
			FileInputStream url = new FileInputStream(FileXML);
			node = evaluate(url, req);
			if (node!=null) desc += node.getAttributes().getNamedItem("briefDescription").getNodeValue();
			
			// get the main description
			req = "//ContentElement[@name='"+roleName+"']/Presentation/MainDescription";
			url = new FileInputStream(FileXML);
			node = evaluate(url, req);
			if (node!=null) desc += node.getTextContent();
			System.out.println(desc);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return desc;
	}
	
	/**
	 * function getDescriptionByTask
	 * @return Arraylist
	 * @param String roleName
	 *  */	
	public String getDescriptionByTask(String taskName) {		
		Node node;
		NodeList nodel;
		String desc = "";
		
		// get the main description
		String req = "//ContentElement[@name='"+taskName+"']/Presentation/MainDescription";
		try {
			FileInputStream url = new FileInputStream(FileXML);
			node = evaluate(url, req);
			if (node!=null)	desc = node.getTextContent();			
			System.out.println(desc);	
			
			// get the descriptions sections
			req = "//ContentElement[@name='"+taskName+"']/Presentation/Section/Description";
			url = new FileInputStream(FileXML);
			nodel = evaluateNodeList(url, req);
			for (int i=0; i<nodel.getLength(); i++) {
				desc += nodel.item(i).getTextContent();
			}
			System.out.println(desc);
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return desc;
	}
}
