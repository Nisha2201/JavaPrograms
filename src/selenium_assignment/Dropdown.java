package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		d1.manage().window().maximize();
		WebElement dp = d1.findElement(By.id ("SearchDropdownBox"));
		Select s1 = new Select(dp);
		s1.selectByVisibleText("Baby");
		dp.click();
		Thread.sleep(2000);
		d1.quit();

	}

}
