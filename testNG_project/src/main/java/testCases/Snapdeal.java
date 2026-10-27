package testCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(NormalClass.class)
public class Snapdeal{
  @Test
  public void f() {
	  System.out.println("f method");
  }
  @Test
  public void g() {
	  System.out.println("g method");
  }
}
