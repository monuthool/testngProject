package testCases;

import org.testng.annotations.Test;

public class Annot {
  @Test(priority = 1,groups = {"High"})
  public void launchbrowser() {
	  System.out.println("launchbrowser");
  }
  
  @Test(priority = 2,groups = {"High"})
  public void Hiturl() {
	  System.out.println("Hiturl");
  }
  
  @Test(priority = 3,groups = {"Medium"})
  public void search() {
	  System.out.println("search");
  }
  
  @Test(priority = 4,groups = {"High"})
  public void click() {
	  System.out.println("click");
  }
  
  @Test(priority = 7,groups = {"High"})
  public void text() {
	  System.out.println("text");
  }
  
  @Test(priority = 8,groups = {"Medium"})
  public void dropdown() {
	  System.out.println("dropdown");
  }
  
  @Test(priority = 5,groups = {"Medium"})
  public void scroll() {
	  System.out.println("scroll");
  }
  
  @Test(priority = 6,groups = {"Low"})
  public void cosmetic() {
	  System.out.println("cosmetic");
  }
}
