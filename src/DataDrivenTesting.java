import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("/Users/adwitasingh/Downloads/TestData.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		 Sheet s1 = w1.getSheet("Test");
		Row r1 = s1.getRow(0);
		Cell c1=r1.getCell(1);
		String ageofstrudent =c1.getStringCellValue();
		System.out.println(ageofstrudent);
	}

}
