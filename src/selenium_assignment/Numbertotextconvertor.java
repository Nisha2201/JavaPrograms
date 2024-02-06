package selenium_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Numbertotextconvertor {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("/Users/adwitasingh/Downloads/DDT.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		/*String s1 = w1.getSheet("test1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(s1);
		String s2 = w1.getSheet("test1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(s2);*/
	String pwd= NumberToTextConverter.toText(w1.getSheet("test1").getRow(0).getCell(0).getNumericCellValue());
		System.out.println(pwd);

	}

}
