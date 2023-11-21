package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteMethod {

	public void writeData(String directoryPath, int sheet, int row, int cell, String cellValue) throws IOException {
		
	File path = new File(directoryPath); 
		
		FileInputStream fis = new FileInputStream(path); 
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		
		XSSFSheet sheet1 = workbook.getSheetAt(sheet);
		
		FileOutputStream fos = new FileOutputStream(path); 
		
		sheet1.createRow(row).createCell(cell).setCellValue(cellValue);
		
		workbook.write(fos);
		
		System.out.println("File Updated...");
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExcelWriteMethod write = new ExcelWriteMethod(); 
		
		write.writeData("/Users/yasminghahramani/Desktop/Test2.xlsx", 0, 99, 25, "Yasmin Ghahramani");
				
	}
}


