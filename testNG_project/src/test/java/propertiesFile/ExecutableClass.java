package propertiesFile;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExecutableClass extends PropertiesFileBaseClass{
  @Test
  public void Properties() throws Throwable {
	  PropertyFile();
	  System.out.println(P1.getProperty("chromebrowser"));
	  
	  OpenBrowser("chromebrowser");
	  
	  Url_01("facebook");
	 
	  driver.findElement(By.cssSelector(P3.getProperty("email_css"))).sendKeys(P2.getProperty("username"));
	  
	  driver.findElement(By.cssSelector(P3.getProperty("pass_css"))).sendKeys(P2.getProperty("password"));
  }
}
