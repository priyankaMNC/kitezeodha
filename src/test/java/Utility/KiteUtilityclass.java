package Utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class KiteUtilityclass {
public static String getTD(int rowindex,int colindex) throws Throwable  {
	FileInputStream fis = new FileInputStream ("C:\\Users\\VISHAL\\Documents\\Book2.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Book2");
	 String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;
}
}

















