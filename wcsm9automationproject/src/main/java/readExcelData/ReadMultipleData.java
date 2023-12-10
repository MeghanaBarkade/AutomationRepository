package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
	
		Workbook  wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		int rc= sheet.getLastRowNum();

	
	
		for(int i=1;i<=rc;i++)
		{
			//FileInputStream fis1 = new FileInputStream("./src/main/resources/TestData.xlsx");
			//Workbook wb1 = WorkbookFactory.create(fis1);
	
			//Sheet sheet = wb.getSheet("IPL");
			Row row1 = sheet.getRow(i);//to get into perticular row 
			Cell cell = row1.getCell(0);//to get into particular column
			String data=cell.getStringCellValue();//to read specific data from a perticular cell
			//Thread.sleep(2000);
			System.out.println(data);
		}

	}
}
