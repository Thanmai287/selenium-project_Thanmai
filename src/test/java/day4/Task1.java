package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		//driver.get(null);
		//driver.findElement(By.name("q")).sendKeys(args);
		//driver.findElement(By.name("q")).sendKeys(args);
		driver.get("http://137.184.76.209/orangehrm-4.9");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%\r\n");
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
	
	
	
	}
	
	
	

	
}
