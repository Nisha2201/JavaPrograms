package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(1000);
		WebElement drag = driver.findElement(By.id("drag11"));
		WebElement drop = driver.findElement(By.id("div2"));
		
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
	}

}
