package sample.indiv.mine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sambath\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("sambathkumarpacet");
	//Thread.sleep(500);
	WebElement pass=driver.findElement(By.id("pass"));
	pass.sendKeys("12345689");
	WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
	button.click();
			
}
}
