package Ex;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Comparation {
	WebDriver driver;
	public Comparation(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public void EX1(Properties P,String operations,String objectname,String values) {
		
		if(operations.equalsIgnoreCase("Open Browser"))    {
			
			driver.get(P.getProperty(values));
			
		}else if(operations.equalsIgnoreCase("Enter User")){
			driver.findElement(By.name(P.getProperty(objectname))).sendKeys(values);
			
			
		}else if(operations.equalsIgnoreCase("Enter password")){
			driver.findElement(By.name(P.getProperty(objectname))).sendKeys(values);
			
		
		
	}
	}
	
}
