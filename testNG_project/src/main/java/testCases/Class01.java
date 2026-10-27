package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class01 {
  @BeforeSuite
  public void f8() {
	  System.out.println("BeforeSuite");
  }
  
  @Test
  public void f() {
	  System.out.println("Test");
  }
  
  @BeforeClass
  public void f1() {
	  System.out.println("BeforeClass");

  }
  
  @BeforeTest
  public void f0() {
	  System.out.println("BeforeTest");
  }
  
  @BeforeMethod
  public void c() {
	  System.out.println("BeforeMethod");
  }
  
  @AfterClass
  public void d() {
	  System.out.println("AfterClass");
  }
  @AfterTest
  public void e() {
	  System.out.println("AfterTest");
  }
  @AfterSuite
  public void g() {
	  System.out.println("AfterSuite");
  }
}
