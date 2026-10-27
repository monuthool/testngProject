package testCases;

import org.testng.annotations.Test;

public class priority_Annotation {
	  @Test
	  public void d() {
		  System.out.println("d");
	  }
	  @Test(invocationCount = 2)
	  public void c() {
		  System.out.println("c");
	  }
	  @Test
	  public void b() {
		  System.out.println("b");
	  }
	  @Test
	  public void a() {
		  System.out.println("a");
	  }
}
