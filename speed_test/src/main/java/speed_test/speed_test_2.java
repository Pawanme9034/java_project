package speed_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class speed_test_2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver =    new ChromeDriver();
        driver.get("https://www.fast.com");  
//		driver.findElement(By.id("speed-value")).getText();
		Thread.sleep(30000);
		System.out.println(driver.findElement(By.id("speed-value")).getText());
		
		
		
		
		
	}

}
