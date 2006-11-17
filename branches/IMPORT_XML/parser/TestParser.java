package parser;

import java.util.ArrayList;

public class TestParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList role = p.getRole();
		Parser.setFileXML("scrum.xml");
		//ArrayList task = p.getPrimaryTaskByRole("developer");
		Parser.getInstance().getDescriptionByTask("run_developer_tests");
		Parser.getInstance().getMethodName();
		/*for(int i=0;i<task.size();i++) {
			//System.out.println(role.get(i));
			System.out.println("	"+task.get(i));
		}*/
		System.out.println(Parser.getInstance().getPresentationNameByName("Do the planified tasks"));
	}

}
