package spelp.xml.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

import javax.xml.xpath.XPathConstants;

import modelWoops.Process;
import modelWoops.task.TaskDescriptor;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import spelp.xml.fillers.FillerTaskDescriptor;


/**
 * Class XMLParser
 * a static class designed to Parse an XLM File
 * @author faure
 *
 */
public class XMLParser {
	private static String roleDescriptor = "//BreakdownElement[@*[namespace-uri() and local-name()='type']='uma:RoleDescriptor']";
	private static String taskDescriptor = "//BreakdownElement[@*[namespace-uri() and local-name()='type']='uma:TaskDescriptor']";
	
	/**
	 * setFile is the function need to be called in first
	 * @param f File to be parsed
	 */
	public static void setFile(File f){
		// put the document in memory
		XMLUtils.setDocument(f);
	}
	
	/**
	 * getProcess
	 * @return
	 */
	public static Process getProcess (){
		Process p = new Process() ;
		
		try{
			// get all the tasks descriptor
			Set<TaskDescriptor> allTasks = getAllTaskDescriptors();
		}
		catch(Exception e)
		{
			
		}
		return p ;
	}
	/**
	 * getAllTaskDescriptors 
	 * @return all the tasks descriptors
	 * @throws Exception when no tasks descriptor are found
	 */
	public static Set<TaskDescriptor> getAllTaskDescriptors() throws Exception {
		Set<TaskDescriptor> taskList = new HashSet<TaskDescriptor>();
		try {
			NodeList taskDescriptors = (NodeList)XMLUtils.evaluate(taskDescriptor,XPathConstants.NODESET);
			if (taskDescriptors == null){
				throw new Exception ("NO TASK DESCRIPTORS FOUND");
			}
			Node aNode;
			for(int i=0;i<taskDescriptors.getLength();i++){
				aNode = taskDescriptors.item(i);
				TaskDescriptor aTaskDescriptor = new TaskDescriptor();
				FillerTaskDescriptor aFiller = new FillerTaskDescriptor(aTaskDescriptor,aNode);			
				taskList.add((TaskDescriptor)aFiller.getFilledElement());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return taskList;
	}
	
	
}
