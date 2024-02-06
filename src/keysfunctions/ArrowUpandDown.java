package keysfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrowUpandDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement ud =driver.findElement(By.xpath("//select[@class='Country ss']"));
		ud.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		ud.sendKeys(Keys.ARROW_DOWN); 
		
	}

}
