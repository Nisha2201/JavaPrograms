package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) {
	ChromeDriver d1 = new ChromeDriver();
	d1.get("https://www.facebook.com/");
	WebElement useridtextfield = d1.findElement(By.id("email"));
	useridtextfield.sendKeys("email@test.com");
	WebElement passwordtextfield = d1.findElement(By.id("pass"));
	passwordtextfield.sendKeys("1234");
	}

}
