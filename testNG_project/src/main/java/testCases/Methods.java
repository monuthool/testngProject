package testCases;

import org.testng.annotations.Test;

public class Methods {
	 @Test(priority = 3, dependsOnMethods = "Hiturl")
	  public void launchBrowser() {
		  System.out.println("webelement");
	  }
	  
	  @Test(groups = {"High"})
	  public void Hiturl() {
		  System.out.println("Hiturl");
	  }
	  
	  @Test(dependsOnMethods = "Hiturl",priority = 3)
	  public void webelement() {
		  System.out.println("webelement");
	  }
	  @Test(groups = {"Medium"})
	  public void Search() {
		  System.out.println("Search");
	  }
	  
	  @Test(groups = {"Medium"})
	  public void text() {
		  System.out.println("text");
	  }
	  
	  @Test(groups = {"High"})
	  public void click() {
		  System.out.println("click");
	  }
	  
	  @Test(groups = {"High"})
	  public void dropdown() {
		  System.out.println("dropdown");
	  }
	  
	  @Test(groups = {"Medium"})
	  public void scroll() {
		  System.out.println("scroll");
	  }
	  
	  @Test(groups = {"Low"})
	  public void cosmetic() {
		  System.out.println("cosmetic");
	  }
}
