package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void excelWrite() {
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File path = new File("/Users/yasminghahramani/eclipse-workspace/SeleniumFrameworkRevision/Data/Test.xlsx"); 
		
		FileInputStream fis = new FileInputStream(path); 
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		FileOutputStream fos = new FileOutputStream(path); 
		
		sheet1.createRow(6).createCell(1).setCellValue("Tom");
		
		workbook.write(fos);
		
		System.out.println("File Updated...");
		
		
		
		
	}

}
