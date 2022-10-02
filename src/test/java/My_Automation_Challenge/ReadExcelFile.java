package My_Automation_Challenge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFile {
	final String fileLocation = "./TestData/ShopRite_Credentials.xlsx";
	
	@Test
	public void ReadMyFileData () throws IOException{
		
	FileInputStream file = new FileInputStream (fileLocation);
		
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	Iterator<Row>rowiterator = sheet.iterator();
	rowiterator.next();
	
	ArrayList <String>listMYData = new ArrayList <>();
	
	while (rowiterator.hasNext()) {
		listMYData.add(rowiterator.next().getCell(0).getStringCellValue());
		
	}
	System.out.println(listMYData);
	
	}
}
