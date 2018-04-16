package Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class LoadProperties {

	public Properties EX() throws Exception {
		FileInputStream fis=new FileInputStream("D:\\vijju selenium\\Keyword framework\\values.properties");
		Properties p=new Properties();
		
		p.load(fis);
		return p;

		
		
		
	}	
	
}
