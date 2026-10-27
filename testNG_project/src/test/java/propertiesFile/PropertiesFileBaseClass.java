package propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PropertiesFileBaseClass {
	
	public static String projectpath = System.getProperty("user.dir");
	
	public static FileInputStream f;
	
	public static Properties P1;
	
	public static Properties P2;
	
	public static Properties P3;
	
	
	public static WebDriver driver;

	
	public static void PropertyFile() throws Throwable {
		
		FileInputStream file = new FileInputStream(projectpath+"/src/main/resources/P1_Browser_URL.properties");
		
		 P1 = new Properties();
		
		P1.load(file);
		
		//p2 data properties
		
		file = new FileInputStream(projectpath+"/src/main/resources/P2_data.properties");
		
		 P2 = new Properties();
			
			P2.load(file);
			
			//p3 properties
			
			file = new FileInputStream(projectpath+"/src/main/resources/P3.properties");
			
			  P3 = new Properties();
				
				P3.load(file);
				}
				
				
				public static void OpenBrowser(String BrowserKey) {
					
						if(P1.getProperty(BrowserKey).equalsIgnoreCase("chrome")) {
							
							driver = new ChromeDriver();
							
						}else if (P1.getProperty(BrowserKey).equalsIgnoreCase("edge")) {
							driver = new EdgeDriver();
							
						}else if (P1.getProperty(BrowserKey).equalsIgnoreCase("Firefox")) {
							driver = new FirefoxDriver();
							
						}
						System.out.println("The browser launched is as:"+ P1.getProperty(BrowserKey));
						
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
					}
				
				public static void Url_01(String UrlKey) {
					
					driver.get(UrlKey);
					
					System.out.println("The url is:" +P1.getProperty(UrlKey));
					
					System.out.println("The title of webpage is as : "+ driver.getTitle());
				}

}
