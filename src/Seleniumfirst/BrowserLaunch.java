package Seleniumfirst;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		ChromeDriver d1 = new ChromeDriver();
		//SafariDriver d1 = new SafariDriver();
		d1.get("https://www.selenium.dev/downloads/");
		d1.manage().window().minimize();
		d1.manage().window().maximize();
	}

}