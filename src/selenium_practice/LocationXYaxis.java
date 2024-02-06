package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationXYaxis {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement a2 = driver.findElement(By.linkText("Canada"));
		Point xandy = a2.getLocation();
		int x = xandy.getX();
		int y = xandy.getY();
		System.out.println(x);
		System.out.println(y);
	}

}
