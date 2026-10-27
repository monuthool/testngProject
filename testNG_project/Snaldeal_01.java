import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testCases.NormalClass01;
@Listeners(NormalClass_01.class)
public class Snaldeal_01 {
  @Test
  public void b() {
	  System.out.println("b method");
  }
  
  @Test
  public void a() {
	  System.out.println("a method");
  }
}
