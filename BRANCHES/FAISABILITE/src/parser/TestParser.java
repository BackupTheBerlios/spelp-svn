package parser;

import java.util.ArrayList;

public class TestParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parser p = Parser.getInstance();
		ArrayList role = p.getRole();
		
		for(int i=0;i<role.size();i++) {
			System.out.println(role.get(i));
		}
		
	}

}
