package testCases;

import org.testng.annotations.Test;

public class DependsMethod {
  @Test
  public void launchbrowser() {
	  System.out.println("launchbrowser");
  }
  
  @Test(dependsOnMethods = "launchBrowser")
  public void Hiturl() {
	  System.out.println("Hiturl");
  }
  
  @Test(dependsOnMethods = "Hiturl",priority = 3)
  public void webelement() {
	  System.out.println("webelement");
  }
}
