package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadMethod {
	
	public static void readingData(int sheetno, int row, int cell) throws IOException {
		
File path = new File("/Users/yasminghahramani/eclipse-workspace/SeleniumFrameworkRevision/Data/Test.xlsx");
		
		FileInputStream fis = new FileInputStream(path); 
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		
		XSSFSheet sheet1 = workbook.getSheetAt(sheetno);
		
		String text = sheet1.getRow(row).getCell(cell).getStringCellValue();
		System.out.println(text);
	
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		readingData(1, 5, 1); 
		
		readingData(1, 6, 1); 
	
	}

}
