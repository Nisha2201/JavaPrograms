package keysfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement copy =driver.findElement(By.id("fname"));
		copy.sendKeys("Nisha");
		copy.sendKeys(Keys.COMMAND+"a"); //select entire name
		copy.sendKeys(Keys.COMMAND+"c"); //copying
		WebElement paste =driver.findElement(By.id("lname"));
		paste.sendKeys(Keys.COMMAND+"v");

	}

}
