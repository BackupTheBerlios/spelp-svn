package spelp.xml.fillers;

import modelWoops.breakdownelement.BreakdownElement;
import modelWoops.workbreakdownelement.WorkBreakdownElement;

import org.w3c.dom.Node;

public class FillerWorkBreakDownElement extends FillerBreakDownElement{
	private static String isRepeatable = "isRepeatable" ;
	private static String isOnGoing = "isOngoing" ;
	private static String isEvenDriven = "isEventDriven" ;
	
	public FillerWorkBreakDownElement(BreakdownElement _e, Node _aNode) {
		super(_e, _aNode);
		fill() ;
	}
	
	private void fill(){
		// setting isRepeatable
		((WorkBreakdownElement)myElement).setIsRepeatable(Boolean.valueOf(myNode.getAttributes().getNamedItem(isRepeatable).getNodeValue()));
		// setting isOnGoing
		((WorkBreakdownElement)myElement).setIsOngoing(Boolean.valueOf(myNode.getAttributes().getNamedItem(isOnGoing).getNodeValue()));
		// setting isEvenDriven
		((WorkBreakdownElement)myElement).setIsEvenDriven(Boolean.valueOf(myNode.getAttributes().getNamedItem(isEvenDriven).getNodeValue()));
	}
}
