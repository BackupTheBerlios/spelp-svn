package spelp.test.xml.parser;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import spelp.xml.parser.*;

public class XMLParserTest {
	public static String path = "ressources/scrum.xml"; 
	
	@Test
	public void testGetAllTaskDescriptors() {
		File f = new File(path);
		XMLParser.setFile(f);
		System.out.println(f.getAbsolutePath());
		try {
			assertTrue(XMLParser.getAllTaskDescriptors().size()!=0);
		} catch (Exception e) {
			System.out.println("coucou");
			fail();
		}
	}

}
