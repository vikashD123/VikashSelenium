package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lab2 {

	@Test
	public void m1() {
	System.setProperty("webdriver.chrome.driver","D:\\Jar-Files\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	System.out.println(driver.getTitle());
	}
	
}
