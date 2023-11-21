package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	File path = new File("/Users/yasminghahramani/eclipse-workspace/SeleniumFrameworkRevision/Data/Test.xlsx");
		
		FileInputStream fis = new FileInputStream(path); 
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		String text = sheet1.getRow(2).getCell(1).getStringCellValue();
		System.out.println(text);
		
		
		
	}

}
