package sample.indiv.mine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sambath\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail&passive=1209600&sacu=1&ignoreShadow=0&hl=en&acui=0&flowName=GlifWebSignIn&flowEntry=AddSession");
	WebElement email=driver.findElement(By.name("identifier"));
	email.sendKeys("sambathkumarpacet");
	WebElement button=driver.findElement(By.xpath("//div[@role='button']"));
	button.click();
	Thread.sleep(300);
	WebElement pass=driver.findElement(By.name("password"));
	pass.sendKeys("12345689");
	WebElement button1=driver.findElement(By.xpath("//div[@role='button']"));
	button1.click();
}
	}  
