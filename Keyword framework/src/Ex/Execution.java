package Ex;

import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Execution {

	
	@Test
	public void Display() throws Exception {
		System.setProperty("webdriver.firefox.marionette","D:\\vijaylaxmi\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Comparation c1=new Comparation(driver);
		ExcelOperations c2=new ExcelOperations();
		LoadProperties c3=new LoadProperties();
		Properties ref=c3.EX();
		XSSFSheet sheet=c2.Ex("C:\\Users\\DELL\\Desktop\\vijju.xlsx", "Sheet1");
		for(int i=1;i<=sheet.getLastRowNum();i++)
        {
			String s1=sheet.getRow(i).getCell(0).toString();
			String s2=sheet.getRow(i).getCell(1).toString();
			String s3=sheet.getRow(i).getCell(2).toString();
			if(s3.contains("."))
			{
				int index=s3.indexOf(".");
				s3=s3.substring(0, index);
				c1.EX1(ref, s1,s2,s3);
			}
			else
			{
				c1.EX1(ref, s1,s2,s3);
			}
        	
        	
          
		
		
		




	}
	
	
	

	}
}
