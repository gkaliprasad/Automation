package Autoproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasa\\eclipse-workspace\\Sampleproj\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(4000);
	
		driver.findElement(By.name("userName")).sendKeys("prasad");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("1234");

	   Thread.sleep(2000);
       driver.findElement(By.name("submit")).click();
	
		
		
	}

}
