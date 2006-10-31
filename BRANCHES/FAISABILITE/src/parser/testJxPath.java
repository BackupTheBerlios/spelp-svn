package parser;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.jxpath.JXPathContext;
import org.eclipse.epf.uma._1_0.BreakdownElement;
import org.eclipse.epf.uma._1_0.MethodLibrary;
import org.eclipse.epf.uma._1_0.MethodPackage;
import org.eclipse.epf.uma._1_0.MethodPlugin;
import org.eclipse.epf.uma._1_0.RoleDescriptor;
import org.eclipse.epf.uma._1_0.TaskDescriptor;
import org.xml.sax.XMLReader;

public class testJxPath {

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


	             JXPathContext context = JXPathContext.newContext(mlb);
	             System.out.println("dqsfqsd");
	             /*Iterator tasks = context.iterate("//MethodPlugin[@name='openup_basic']");
	             System.out.println("dqsfqsd");
	             while (tasks.hasNext()) {
	            	 System.out.println("dqsfqsd");
	            	 System.out.println( ((MethodPlugin)tasks.next()).getName());
	             }*/
	             System.out.println( ((MethodPlugin)context.getValue("//MethodPlugin[@name='openup_basic']")).getName());
	             System.out.println("dqsfqsd");
	            List<RoleDescriptor> roles;	            
	            
	        } catch( Exception e ) {
	            e.printStackTrace();
	        }
	}

}
