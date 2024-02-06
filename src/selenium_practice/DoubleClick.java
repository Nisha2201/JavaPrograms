package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement c1 = driver.findElement(By.linkText("Gmail"));
		
		/*driver.get("https://grotechminds.com/left-double-click/");
		WebElement a1 = driver.findElement(By.linkText("Link1"));*/

		Actions a2=new Actions(driver);
		//a2.doubleClick(a1).perform();
		a2.doubleClick(c1).perform();
		
	}

}
