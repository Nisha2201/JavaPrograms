package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class India_Google {

	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		WebElement searchtextfield = d1.findElement(By.name("q"));
		searchtextfield.sendKeys("India");
		//Enter as well
		searchtextfield.sendKeys(Keys.ENTER);

	}

}
