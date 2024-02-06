package keysfunctions;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_accept_dismiss {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("/Users/adwitasingh/Downloads/learningHTML1.rtfd");
		driver.manage().window().maximize();
		driver.switchTo().alert().accept();

	}

}
