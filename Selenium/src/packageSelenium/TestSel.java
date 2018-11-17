package packageSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSel {
	WebDriver driver = new FirefoxDriver();
	
	
	@Test
	public void check() throws Exception{
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Dabbel wey");
		driver.get("https://www.youtube.com/");
	}
	
	/*
	@Before
	public void beforeTest() throws Exception {
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
*/
}
