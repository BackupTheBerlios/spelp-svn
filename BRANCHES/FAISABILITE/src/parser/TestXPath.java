package parser;

import java.io.*;
import java.util.Iterator;

import javax.xml.namespace.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;

import org.w3c.dom.*;
import org.xml.sax.*;

public class TestXPath {	
	final static String expression = "//BreakdownElement";
	
	public static Object evaluerDOM(Document document, String expression, QName retour){
		Object resultat = null;
		try{
			//création du XPath 
			XPathFactory fabrique = XPathFactory.newInstance();
			XPath xpath = fabrique.newXPath();
			
			//évaluation de l'expression XPath
			XPathExpression exp = xpath.compile(expression);
			resultat = exp.evaluate(document,retour);
			
			System.out.println(resultat);
		}catch(XPathExpressionException xpee){
			xpee.printStackTrace();
		}
		return resultat;
	}
	public static Object evaluerSAX(File fichier, String expression, QName retour){
		Object resultat = null;
		try{
			//création de la source
			InputSource source = new InputSource(new FileInputStream(fichier));
			
			//création du XPath 
			XPathFactory fabrique = XPathFactory.newInstance();
			XPath xpath = fabrique.newXPath();
			
			//évaluation de l'expression XPath
			XPathExpression exp = xpath.compile(expression);
			resultat = exp.evaluate(source,retour);
			
			System.out.println(resultat);
		}catch(XPathExpressionException xpee){
			xpee.printStackTrace();
		}catch(IOException  ioe){
			ioe.printStackTrace();	
		}
		return resultat;
	}
	
	public static void main (String args[]){		

		File xmlExample = new File("sortieEPF.xml");	
		testDom(xmlExample);
		testDom(xmlExample);
		testDom(xmlExample);
		testDom(xmlExample);
		testDom(xmlExample);       
	}
	
	public static void testDom (File xmlExample){	
		try{
			long t = System.currentTimeMillis() ;
			System.out.println(" Dom ");
			// File xmlExample = new File("scrum.xml");	    	
	        DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();		
			DocumentBuilder constructeur;
			constructeur = fabrique.newDocumentBuilder();		
			Document document = constructeur.parse(xmlExample);
			NodeList nodel = (NodeList) TestXPath.evaluerDOM(document,expression, XPathConstants.NODESET);
	    	Node node;
	        for(int i=0; i<nodel.getLength(); i++) {
	        	node = nodel.item(i);
	        	
		        System.out.println(node.getAttributes().getNamedItem("name").getNodeValue());
		        System.out.println("	"+node.getAttributes().getNamedItem("xsi:type").getNodeValue());
	        }
	        t = System.currentTimeMillis() - t;
	        System.out.println("Fin Dom : "+ t);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testSax (File xmlExample){
		// Exemple Sax		
		try{
			long t = System.currentTimeMillis() ;
			System.out.println(" Sax ");
			//File xmlExample = new File("scrum.xml");	    	
	    	NodeList nodel = (NodeList) TestXPath.evaluerSAX(xmlExample,expression, XPathConstants.NODESET);
	    	Node node;
	        for(int i=0; i<nodel.getLength(); i++) {
	        	node = nodel.item(i);
	
		        System.out.println(node.getAttributes().getNamedItem("name").getNodeValue());
		        System.out.println("	"+node.getAttributes().getNamedItem("xsi:type").getNodeValue());
	        }
	        t = System.currentTimeMillis() - t;
	        System.out.println("Fin Sax : "+t);
		}catch(Exception e){
			e.printStackTrace();	
		}    
	}
}
