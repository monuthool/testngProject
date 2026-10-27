package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

public class HardAssert_1 extends Base{
  @Test
  public void url() {
	  launch_browser("chrome");
	  HitUrl("https://www.selenium.dev/");
	  
	  String expectedwebelement = "About";
	  
	  String actualwebelement = driver.findElement(By.xpath("//a[text()=\"About\"]")).getText();
	  
	  Assert.assertEquals(actualwebelement, expectedwebelement,"detailsmatch");
	  
	  System.out.println("The actual webelement text is as:"+ actualwebelement);
	  
	  
  }
}
