package testCases;

import org.testng.annotations.Test;

public class priority_0_1 {
	  @Test
	  public void d() {
		  System.out.println("d");
	  }
	  @Test
	  public void c() {
		  System.out.println("c");
	  }
	  @Test(priority=1)
	  public void b() {
		  System.out.println("b");
	  }
	  @Test
	  public void a() {
		  System.out.println("a");
	  }
}
