package project.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseBase {
	
public static WebDriver driver;
	
	public static void setup() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
//        driver.manage().deleteAllCookies();

	}
	public static void teardown() {
		
		driver.close();
	}


}
