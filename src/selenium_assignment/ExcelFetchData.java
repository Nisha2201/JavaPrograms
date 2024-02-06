package selenium_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFetchData {

	
		
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			FileInputStream fis = new FileInputStream("/Users/adwitasingh/Downloads/TestData.xlsx");
			Workbook w1 = WorkbookFactory.create(fis);
			String s1 = w1.getSheet("Test").getRow(1).getCell(0).getStringCellValue();
			System.out.println(s1);
			String s2 = w1.getSheet("Test").getRow(1).getCell(1).getStringCellValue();
			System.out.println(s2);
			//String pwd= NumberToTextConverter.toText(w1.getSheet("test1").getRow(0).getCell(0).getNumericCellValue());
		//	System.out.println(pwd);
			ChromeDriver d1 = new ChromeDriver();
			d1.get("https://www.facebook.com/");
			d1.manage().window().maximize();
			
			WebElement useridfield = d1.findElement(By.id("email"));
			useridfield.sendKeys(s1);
			WebElement passfield = d1.findElement(By.id("pass"));
			passfield.sendKeys(s2);
			Thread.sleep(4000);
			d1.quit();
			
	}

}
