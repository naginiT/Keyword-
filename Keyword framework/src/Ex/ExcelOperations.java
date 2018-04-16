package Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public XSSFSheet Ex (String filepath,String Sheet) throws Exception {
		
		FileInputStream fis =new FileInputStream(filepath);
		XSSFWorkbook w=new XSSFWorkbook(fis);
		XSSFSheet sheet=w.getSheet(Sheet);
		
		return sheet;
		
		
		
		
		
	}
	
	
	
}
