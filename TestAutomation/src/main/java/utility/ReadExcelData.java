package utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import testNg.BaseClass;




public class ReadExcelData extends BaseClass {
    
	
	public static String[][] readExcelData(String excelFileName) throws IOException {
		

		XSSFWorkbook book = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		
		 XSSFSheet sheet = book.getSheetAt(0);
		 
		 int rowcount = sheet.getLastRowNum();
		 
		 short columncount = sheet.getRow(0).getLastCellNum();
		 
		 String[][] array=new String[rowcount][columncount];
		 
		 for (int i = 1; i <= rowcount; i++) {
			 
			 XSSFRow row = sheet.getRow(i);
			 
			 for (int j = 0; j <columncount ; j++) {
				 
				 XSSFCell cell = row.getCell(j);
				 
				 String data = cell.getStringCellValue();
				 
				 array[i-1][j]=data;
				 
				 System.out.println(data);
				
			}
			
		}
		 
		
		return array;
		
		
		
		

	}
		
}
