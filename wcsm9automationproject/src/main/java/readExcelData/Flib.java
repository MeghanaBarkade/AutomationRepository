package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Flib {
	public String readExcelData(String excelPath, String sheetName, int rowno, int cellno) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet(sheetName);
		Row row =sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		
	    String data = null;
	    if(cell.getCellType()==cell.getCellType().STRING)
		{
			data=cell.getStringCellValue();
		}
		else if(cell.getCellType()==cell.getCellType().NUMERIC)
		{
			data=cell.getStringCellValue().valueOf(cell.getNumericCellValue());
		}
		return data;
		
	}
	public void WriteexcelData(String excelPath, String sheetName, int rowno, int cellno, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);     //provide the path of excel file
		Workbook wb=WorkbookFactory.create(fis);                //Make the File Ready to read
		Sheet sheet=wb.getSheet(sheetName);                     //get into the sheet
		Row row =sheet.getRow(rowno);                           //get into the desired row
		Cell cell = row.getCell(cellno);                        //Create the desired cell
		cell.setCellValue(data);                                //Enter the datain the Created cell
		FileOutputStream fos=new FileOutputStream(excelPath);//proide the path of excel file
		wb.write(fos);                                        //write the data in excel file
	}
	public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelPath);    //provide the path of excel file
		Workbook wb=WorkbookFactory.create(fis);               //Make the File Ready to read
		Sheet sheet=wb.getSheet(sheetName);                    //get into the sheet
		int rc=sheet.getLastRowNum();                          //Get the no of rows present
		return rc;
	}

}
