package Automatewebapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v109.network.Network;

import com.google.common.collect.ImmutableList;

public class SpiceJet {

	 
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasa\\git\\Selenium-webdriver\\Sampleproj\\driver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools= driver.getDevTools();
		devtools.createSession();
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devtools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg","*.png","*.svg")));
		
	    driver.manage().window().maximize();
	 //   driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		//driver.manage().deleteAllCookies();
		
		/*ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		Thread.sleep(2000);*/
		
        /*//	Alert alert = driver.switchTo().alert();		
	       Thread.sleep(3000);
	        alert.dismiss();   */
		
	    driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[1]")).click();
		Thread.sleep(2000);

		WebElement mailbutton=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[3]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/div[2]/div/div[2]/div[1]"));
		mailbutton.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[1]")).sendKeys("prasadgutti5555@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'])[2]")).sendKeys("Prasad@23832383");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		//Thread.sleep(4000);
	   driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	
	   Robot robot = new Robot();
		robot.delay(4000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		/* Robot Class in Selenium is used to enable automated testing for implementations of Java platform. 
		 * It generates input events in native systems for test automation, self-running demos and other applications
		 *  where users need control over mouse and keyboard. Robot class is easy to implement and
		 *   it can be easily integrated with an automated framework.  */
		
		Thread.sleep(2000);  //Round trip button
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")).click();
		
        Thread.sleep(2000);   //from 
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")).click();
		
        Thread.sleep(3000);  //To
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[8]/div[2]")).click();
		 
		//date 
		Thread.sleep(3000);

		WebElement button  = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[1]"));
		 button.click(); 
		 button.click(); 
		 button.click(); 
		 
	   Thread.sleep(3000);  //Departure date
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[7]/div/div[3]/div[3]/div[1]/div")).click();
		Thread.sleep(3000);
		
		 //Return Date
		  driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[7]/div/div[3]/div[3]/div[6]/div/div")).click();
        Thread.sleep(2000);   
        //passengertype
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]")).click();
        WebElement Adultpassenger= driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]"));
        Adultpassenger.click();
		
		
        Thread.sleep(2000);
    /*  WebElement childpassenger= driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[3]"));
			childpassenger.click();  */
			
	        Thread.sleep(2000);
	        //done button
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();
        Thread.sleep(2000);
        //currency
	    driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div/div[2]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[1]/div/div/div[1]")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();
       // Thread.sleep(3000);
     
       //continue page
        driver.getWindowHandle();
          Thread.sleep(3000);
          //select check box
          driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[3]/div/div[1]/div/div[1]")).click();
           Thread.sleep(3000);
           //continue button
           driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[3]/div/div[3]/div")).click();
           Thread.sleep(5000);
           
        //modify
          driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[6]/div[1]/div/div[2]/div")).click();
          driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[3]/div/div/div[1]")).click();
          Thread.sleep(3000);
          
          // change to oneway
          driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]")).click();
          Thread.sleep(3000);

          //change journey place
   WebElement delhi  = driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div[2]/input"));
     delhi.click();
     delhi.sendKeys("del");
   //  driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[16]/div[2]/div")).click();
          Thread.sleep(3000);
          
          
          driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div[2]")).click();
          Thread.sleep(2000);
          
          WebElement changedate=driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[3]/div/div[2]/div[2]/div/div[2]"));
          changedate.click();
          changedate.click();
          changedate.click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[3]/div/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/div/div[3]/div[3]/div[2]/div/div")).click();
          Thread.sleep(2000);

          //change currency
          driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[4]/div[2]/div/div[2]/div[2]")).click();
          Thread.sleep(2000);

          driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[4]/div[2]/div[2]/div[2]/div/div[1]/div")).click();
          Thread.sleep(2000);

          //unclick family and friends
          driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[5]/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]")).click();
          //continue button
   	   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


          driver.findElement(By.xpath("/html/body/div[12]/div/div/div/div/div[2]/div[6]/div")).click();
          //continue button
          driver.getWindowHandle();
   	   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

          driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[5]/div/div/div[3]/div[2]")).click();
          
         //passenger detailes
          driver.getWindowHandle();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/input")).sendKeys("prasad");
         Thread.sleep(3000);

         driver.findElement(By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[2]/div[3]/div/div/div[2]/input")).sendKeys("gutti");
         Thread.sleep(3000);

         driver.findElement(By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[4]/div/div/div")).click();
         Thread.sleep(3000);

         //passenger 2
        driver.findElement(By.xpath("//*[@id=\"pax-item-MSFBRFQ-\"]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/input")).sendKeys("venkatram");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"pax-item-MSFBRFQ-\"]/div[2]/div/div/div[1]/div[3]/div/div/div[2]/input")).sendKeys("danaboina");
        Thread.sleep(3000);

        //continue button
        
        driver.findElement(By.xpath("//*[@id=\"travellers-view\"]/div[2]/div/div/div[2]")).click();
 	   driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        //cancel discount
        driver.getWindowHandle();
        Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@id=\"at_addon_close_icon\"]/img")).click();
           //continue button
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[5]/div/div/div[2]/div/div/div[4]")).click();
           
		//driver.switchTo().alert().dismiss();


     }
     
	
	}


