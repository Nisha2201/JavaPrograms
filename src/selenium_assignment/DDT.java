package selenium_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("/Users/adwitasingh/Downloads/TestData.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		 String s1 = w1.getSheet("Test").getRow(0).getCell(0).getStringCellValue();
		System.out.println(s1);
		String s2 = w1.getSheet("Test").getRow(0).getCell(1).getStringCellValue();
		System.out.println(s2);
		//Earlier illeagalexception is due to wrong data type
		
	}

}
