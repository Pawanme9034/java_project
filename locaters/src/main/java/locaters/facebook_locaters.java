package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_locaters {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver =    new ChromeDriver();
        driver.get("https://www.facebook.com");  
        driver.manage().window().maximize(); 
//        id locater
        driver.findElement(By.id("email")).sendKeys("4468546465");
        Thread.sleep(1000);
//        name locater
        driver.findElement(By.name("pass")).sendKeys("lkjflj");
        Thread.sleep(1000);
//        link locater
        driver.findElement(By.linkText("Forgotten password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.tagName("input")).sendKeys("abc@gmail.com");
        Thread.sleep(1000);
        driver.navigate().back();
	
//	partial link text
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Forgotten")).click();
        Thread.sleep(1000);
        driver.navigate().back();
//  class name
        Thread.sleep(1000);
        driver.findElement(By.className("_8esh")).click();
        driver.navigate().back();
        driver.navigate().forward();
	driver.close();
	
	
	}

}
