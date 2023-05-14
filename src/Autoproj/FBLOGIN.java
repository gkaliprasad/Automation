package Autoproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLOGIN {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasa\\eclipse-workspace\\Sampleproj\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement user=driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']"));
	       user.click();
	       user.sendKeys("9999999999");
	       user.submit();
	       
			WebElement logi=driver.findElement(By.xpath("//div[@class='_55r1 _1kbt']"));
             logi.click();
             logi.sendKeys("000000");
             logi.click();

             driver.findElement(By.id("loginbutton")).click();
	       
	       
	}

}
