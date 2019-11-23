package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache {
	
  public static void main(String[] args) throws IOException
  {
	  File test=new File("./ExcelSheet/"+"apachexcel"+".xlsx");
	  FileInputStream test1=new FileInputStream(test);
	  XSSFWorkbook test2=new XSSFWorkbook(test1);
	  XSSFSheet test3=test2.getSheetAt(0);
	  String data=test3.getRow(0).getCell(1).getStringCellValue();
	  try
	  {
		  //XSSFSheet test3=test2.getSheetAt(0);
		  //String data=test3.getRow(0).getCell(1).getStringCellValue();
		 // String data=test3.getRow(0).getCell(1).getStringCellValue();
		  System.out.println("Test        " +data);
		  
	  }
	  catch(Exception test5)
	  {
		  test5.printStackTrace();
	  }
	 test2.close(); 
  }
}
