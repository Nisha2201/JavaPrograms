package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement a1 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a2 = new Actions(driver);

		a2.moveToElement(a1).perform();
		WebElement b1 = driver.findElement(By.xpath("//span[@class ='nav-action-inner']"));
		b1.click();
		
	}

}
