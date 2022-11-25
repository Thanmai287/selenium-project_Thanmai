package day5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {
	
	WebDriver D;
	@BeforeMethod
	public void setup() {
		D.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        D.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		
		
	}
	
	@AfterMethod
	public void teardown() {
		D.quit();
	}
	
	@Test
	public void test()
	{
		D.get("https://the-internet.herokuapp.com/");
		
	}
	

}
