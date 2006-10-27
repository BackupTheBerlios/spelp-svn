package parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.eclipse.epf.uma._1_0.*;

public class testUnMarshall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        try {
	            JAXBContext jc = JAXBContext.newInstance("org.eclipse.epf.uma._1_0");
	            Unmarshaller u = jc.createUnmarshaller();
	           
	            JAXBElement<?> el = 
	                (JAXBElement<?>)u.unmarshal(new File("toyton.xml"));
	            MethodLibrary mlb = (MethodLibrary)el.getValue();
	            
	            
	            MethodLibrary ml = new MethodLibrary();
	           
	           
	           
	            List<MethodPlugin> l = mlb.getMethodPlugin();
	            for (int i = 0; i< l.size(); i++) {
	            	System.out.println(l.get(i).getName());
	            }
	              
	        } catch( Exception e ) {
	            e.printStackTrace();
	        }
	}

}
