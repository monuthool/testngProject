package testCases;

import org.jspecify.annotations.Nullable;
import org.testng.annotations.Test;

public class SoftAssert extends Base{
  @Test
  public void browser() {
	  launch_browser("chrome");
	  HitUrl("https://www.selenium.dev/");
	  
	  String expectedurl = "https://www.selenium.dev/";
	  String actuallurl = driver.getCurrentUrl();
	  
	  org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
	  
	  sa.assertEquals(actuallurl, expectedurl);
	  sa.assertAll();
	  

  }
}
