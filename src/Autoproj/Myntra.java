package Autoproj;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasa\\eclipse-workspace\\Sampleproj\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
    	Thread.sleep(4000);

        Actions actions = new Actions(driver);
    	WebElement menuOption = driver.findElement(By.className("desktop-userIconsContainer"));
        actions.moveToElement(menuOption).perform();
    	Thread.sleep(4000);

    	Actions action=new Actions(driver);
    	WebElement logi=driver.findElement(By.xpath("//div[@class='desktop-getUserInLinks desktop-getInLinks']"));
    	action.moveToElement(logi).click();
		
	}

}
