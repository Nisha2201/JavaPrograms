package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Azn_CS {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.amazon.in/");
		WebElement cs = d1.findElement(By.linkText("Customer Service"));
		Thread.sleep(2000);
		cs.click();
		
	}

}
