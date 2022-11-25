package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridDemo {
	WebDriver driver;
	
	
  @Parameters({"os","osVersion","browser","browserVersion"})
  @BeforeMethod
  public void setup(String os,String osVersion,String browser,String browserVersion)
  {
	  DesiredCapabilities capabilities=new DesiredCapabilities();
	  capabilities.setCapability("os",os);
	  capabilities.setCapability("osVersion",osVersion);
	  capabilities.setCapability("browser", browser);
	  capabilities.setCapability("browserVersion", browserVersion);

	  
	  URL url = null;
	  try {
		  url = new URL("https://thanmaireddy_Y8gmPX:X247sRzzTcCZ1joq9cez@hub-cloud.browserstack.com/wd/hub");

	  }
	  catch(MalformedURLException e) {
		  
		  e.printStackTrace();
	  }
	  
	  driver=new RemoteWebDriver(url,capabilities);
	  
	 }
  
  @AfterMethod
  public void teardown() {
	driver.quit();  
  }
  @Test
  public void test() {
	  driver.get("https://www.naukri.com/");
  }
  
  
  

	
}
