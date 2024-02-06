package selenium_practice;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickGmail {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.google.co.in/");
		WebElement cs = d1.findElement(By.linkText("Gmail"));
		Thread.sleep(2000);
		cs.click();
		
	}

}
