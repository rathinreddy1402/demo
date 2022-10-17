package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File {

	public String getExcelData(String sheet, int RowNum,int cellNum) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./TestData.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheet);
		Row row = sh.getRow(RowNum);
		Cell cel = row.getCell(cellNum);
		String data = cel.getStringCellValue();
		return data;
	}
}
