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
	            JAXBElement<MethodLibrary> el = 
	                (JAXBElement<MethodLibrary>)u.unmarshal(new File("toyton.xml"));
	            MethodLibrary mlb = el.getValue();
	      
	            MethodPlugin mp;
	            List<MethodPlugin> l = mlb.getMethodPlugin();
	            List<MethodPackage> l2 ;
	            List<Object> l3 ;
	            List<Object> l4 ;
	            for (int i = 0; i< l.size(); i++) {
	            	System.out.println(l.get(i).getName());
	            	mp = l.get(i);
	            	l2 = mp.getMethodPackage();
	            	for (int y = 0; y< l2.size(); y++) {
	            		System.out.println("	"+l2.get(y).getName());
	            		l3 = l2.get(y).getReusedPackageOrMethodPackage();
	            		for (int z = 0; z< l3.size(); z++) {
	            			System.out.println("		"+((MethodPackage)l3.get(z)).getName());
	            			l4 = ((MethodPackage)l3.get(z)).getReusedPackageOrMethodPackage();
	            			for (int t = 0; t< l4.size(); t++) {
	            				System.out.println("			"+((MethodPackage)l4.get(t)).getName());
	            				System.out.println("			"+l4.get(t).getClass().getName());
	            			}
	            		}
	            	}	            	
	           }	              
	        } catch( Exception e ) {
	            e.printStackTrace();
	        }
	}

}
