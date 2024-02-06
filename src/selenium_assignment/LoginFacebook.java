package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver d1 = new ChromeDriver();
	d1.get("https://www.facebook.com/");
	d1.manage().window().maximize();
	
	WebElement useridfield = d1.findElement(By.id("email"));
	useridfield.sendKeys("email@test.com");
	WebElement passfield = d1.findElement(By.id("pass"));
	passfield.sendKeys("wrongpass");
	Thread.sleep(3000);
	d1.quit();
	}

}
