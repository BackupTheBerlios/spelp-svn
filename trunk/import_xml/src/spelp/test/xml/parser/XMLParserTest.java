package spelp.test.xml.parser;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import modelWoops.task.Task;
import modelWoops.task.TaskDescriptor;

import org.junit.Test;

import spelp.xml.parser.XMLParser;

public class XMLParserTest {
	public static String path = "ressources" + File.separator + "scrum.xml"; 
	
	@Test
	public void testGetAllTaskDescriptors() {
		File f = new File(path);
		XMLParser.setFile(f);
		System.out.println(f.getAbsolutePath());
		try {
			Vector <Task> v = new Vector<Task>();
			Set<TaskDescriptor> aSet = XMLParser.getAllTaskDescriptors();
			// test if the set of tasks is filled
			assertTrue(aSet.size() != 0);
			// test if all task are unique
			for (Iterator i = aSet.iterator() ; i.hasNext() ; ){
				Task t = ((TaskDescriptor)i.next()).getTask();
				if (t!=null){
					for (int j = 0 ; j < v.size() ; j++){
						assertTrue(
							t.getId() == ((Task)v.get(j)).getId() && t == ((Task)v.get(j))
							||
							t.getId() != ((Task)v.get(j)).getId()
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
