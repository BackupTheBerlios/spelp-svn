package view.main;

import parser.Parser;
/**
 * classe MyModelElement 
 * name and presentation name
 * @author polo
 *
 */
public class MyModelElement {
	private String realName;
	private String presentationName;
	
	public MyModelElement(String aRealName) {
		this.realName = aRealName;
		this.presentationName = Parser.getInstance().getPresentationNameByName(aRealName); 
	}
	
	public String toString() {
		return this.presentationName;
	}
	
	public String getRealName() {
		return this.realName;
	}
}