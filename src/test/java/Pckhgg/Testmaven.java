 package Pckhgg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testmaven {
	ChromeDriver driver;
	@BeforeTest
	public void avc()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testt()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aswin");
	}
	}
