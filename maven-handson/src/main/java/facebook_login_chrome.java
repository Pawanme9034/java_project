import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.WebElement;
import java.util.Scanner;


public class facebook_login_chrome {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("pless enter the User name / phone number");
		String un = sc.next();
		System.out.println("plss enter the password");
		String pw = sc.next();
		
		
		
		     WebDriver driver =    new ChromeDriver();
             driver.get("https://www.facebook.com");           
		driver.findElement(By.id("email")).sendKeys("4468546465");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("hdufolij");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("@$#$@#$@%@#");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.name("pass")).sendKeys("@$#$@#$@%@#");
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("46452164631463");
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("dhkasfld");
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("jcpsj2@asdjf#@#   ");
		driver.findElement(By.name("pass")).clear();
		 Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}

