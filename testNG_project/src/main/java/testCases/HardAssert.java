package testCases;

import org.openqa.selenium.devtools.latest.audits.model.DeprecationIssueDetails;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssert extends  Base{
  @Test
  public void url() {
	  launch_browser("chrome");
	  HitUrl("https://www.selenium.dev/");
	  
	  String expected = "https://www.selenium.dev/";
	  
	  String actual = driver.getCurrentUrl();
	  
	  Assert.assertEquals(actual, expected, actual);
	  
	  Assert.assertEquals(actual, expected, "details match");
	  
	  Assert.assertEquals(actual, expected,"details match");
	  
	  Assert.assertTrue(true, "record match");
	  
	  System.out.println("The actual url is:"+ actual);

	  
	  
  }
}
