package spelp.test.xml.parser;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.junit.Test;

import spelp.xml.parser.XMLParser;
import woops2.model.process.Process;
import woops2.model.task.TaskDefinition;
import woops2.model.task.TaskDescriptor;

public class XMLParserTest {
	public static String path = "ressources" + File.separator + "scrum.xml"; 
	
	@Test
	public void testGetProcess(){
		File f = new File(path);
		Process p = XMLParser.getProcess(f);
		assertTrue(p.getBreakDownElements().size() != 0);
	}
	
	@Test
	public void testGetAllTaskDescriptors() {
		File f = new File(path);
		XMLParser.setFile(f);
		System.out.println(f.getAbsolutePath());
		try {
			Vector <TaskDefinition> v = new Vector<TaskDefinition>();
			Set<TaskDescriptor> aSet = XMLParser.getAllTaskDescriptors();
			// test if the set of tasks is filled
			assertTrue(aSet.size() != 0);
			// test if all task are unique
			for (Iterator i = aSet.iterator() ; i.hasNext() ; ){
				TaskDefinition t = ((TaskDescriptor)i.next()).getTaskDefinition();
				if (t!=null){
					for (int j = 0 ; j < v.size() ; j++){
						System.out.println("\nID : \n" + t.getId() + "\n" + ((TaskDefinition)v.get(j)).getId() + "\nMemes ref : " + (t == ((TaskDefinition)v.get(j))));
						assertTrue(
							t.getId().equals(((TaskDefinition)v.get(j)).getId()) && t == ((TaskDefinition)v.get(j))
							||
							!t.getId().equals(((TaskDefinition)v.get(j)).getId())
						);
					}
					if (!v.contains(t)){
						v.add(t);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Exception");
			fail();
		}
	}

}
