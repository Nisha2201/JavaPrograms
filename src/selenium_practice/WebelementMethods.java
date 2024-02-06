package selenium_practice;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement a1= driver.findElement(By.id("fname"));
		boolean answerofdisplay= a1.isDisplayed();
		System.out.println(answerofdisplay);
		boolean answerofenabled= a1.isEnabled();
		System.out.println(answerofenabled);
		WebElement checkbox =driver.findElement(By.id("Agree"));
		checkbox.click();
		boolean answerofselect= checkbox.isSelected();
		System.out.println(answerofselect);

	}

}
