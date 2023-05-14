package Autoproj;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AutoFlipkart {



	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasa\\eclipse-workspace\\Sampleproj\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		Actions action=new Actions(driver);
    	WebElement logi=driver.findElement(By.xpath("(//div[@class='_1psGvi _3BvnxG'])[1]"));
    	action.moveToElement(logi).click();
		
		driver.getWindowHandles();
		Thread.sleep(2000);
		

		WebElement ent=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		ent.click();
		ent.sendKeys("6302002383");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		Thread.sleep(4000);
        Actions actions=new Actions(driver);
        WebElement press=	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]")); 
        actions.moveToElement(press).clickAndHold().build().perform();
        
      /*  File sourcefile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\Prasa\\OneDrive\\Pictures/img1.jpg");
		FileUtils.copyFile(sourcefile,destfile);
		driver.quit();  */

		
	
	}

}
