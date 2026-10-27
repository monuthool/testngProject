package testCases;

import org.testng.annotations.Test;

public class Priority_03 {
  @Test(priority = 1)
  public void e() {
	  System.out.println("e");
  }
  
  @Test(priority = 2, invocationCount = 3)
  public void d() {
	  System.out.println("d");
  }
  
  @Test(priority = 3, invocationCount = 2)
  public void c() {
	  System.out.println("c");
  }
  
  @Test(priority = 4,description = "Instance method",enabled = true)
  public void b() {
	  System.out.println("b");
  }
  
  @Test(priority = 5,enabled = false)
  public void a() {
	System.out.println("a");  
  }
}
