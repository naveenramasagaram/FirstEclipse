package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Activity1 {
	
	@Test
	  public void foo() {

		  WebDriver driver= new ChromeDriver();
		  driver.get("http://google.com");
		  driver.quit();

	  }

	
	@Test
	  public void foo1() {

		  WebDriver driver= new ChromeDriver();
		  driver.get("http://google.com");
		  driver.quit();

	  }
	
}
