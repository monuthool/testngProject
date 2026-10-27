package testCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(NormalClass_02.class)
public class Snap_02Class {
  @Test
  public void launch_browser() {
	  System.out.println("chrome");
  }
  @Test
  public void Url() {
	  System.out.println("Snapdeal Url");
  }
}
