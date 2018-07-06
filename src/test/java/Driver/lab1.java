package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lab1 {

	@Test
public void launchBrowser() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","\"D:\\\\Jar-Files\\\\chromedriver.exe\"");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}

}
