package testCases;

import org.testng.annotations.Test;

public class Priority_02 {
	  @Test(priority = 1)
	  public void d() {
		  System.out.println("d");
	  }
	  @Test(priority = 2, invocationCount = 3)
	  public void c() {
		  System.out.println("c");
	  }
	  @Test(priority = 4, description = "Static method")
	  public void b() {
		  System.out.println("b");
	  }
	  @Test(priority = 5)
	  public void a() {
		  System.out.println("a");
	  }
}
