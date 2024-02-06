package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.manage().window().maximize();
		WebDriverWait w1 = new WebDriverWait(d1, Duration.ofSeconds(10));
		//w1.until(ExpectedConditions.titleIs("Nisha"));  it will give timeoutexception
		//w1.until(ExpectedConditions.titleIs("Google"));
		w1.until(ExpectedConditions.titleContains("Goog"));
		WebElement searchtextfield = d1.findElement(By.name("q"));
		searchtextfield.sendKeys("India");


	}

}
