package Jenkins;

//package Targa;

//package Targa;

import java.io.File;
import java.io.FileInputStream;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	// String file_name="";
	static int rowcount;

	@SuppressWarnings("deprecation")
	public List<String> read_data(String file_name, String str)
			throws Exception {	
		
		File input_file = new File("C:\\Users\\"+System.getProperty("user.name")+"\\Downloads\\List1.xls");
		
		input_file.renameTo(new File(System.getProperty("user.dir")+"\\List1.xls"));

		
			Workbook wbk = new Workbook(System.getProperty("user.dir")+"\\List1.xls");
		
		wbk.save(System.getProperty("user.dir")+"\\List2.csv", SaveFormat.CSV);
		
		Workbook wbk2 = new Workbook(System.getProperty("user.dir")+"\\List2.csv");

		wbk2.save(System.getProperty("user.dir")+"\\List3.xlsx", SaveFormat.XLSX);

		
		File file = new File(System.getProperty("user.dir")+"\\List3.xlsx");
	



		// System.out.println(file);
		FileInputStream fin = new FileInputStream(file);
		XSSFWorkbook wbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		rowcount = sheet.getLastRowNum();
		XSSFRow row = sheet.getRow(0);
		int colcount = row.getLastCellNum();
		Map<String, String> mapdata = new HashMap<>();
		List<String> list = new ArrayList<>();

		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				// cell.setCellType(CellType.STRING);
				String s;
				try {
					
					
					s = String.valueOf(sheet.getRow(i + 1).getCell(j)+"")
							.toString();
					System.out.println("val:"+s);
				} catch (IllegalStateException e) {
					Double d= sheet.getRow(i + 1).getCell(j).getNumericCellValue();
				
					BigDecimal bd=new BigDecimal(d.toString());
					long l=bd.longValue();
					
					
					s = Long.toString(l).trim();
					
						
				}
				mapdata.put(sheet.getRow(0).getCell(j).getStringCellValue(), s);
				if (str.equals(sheet.getRow(0).getCell(j).getStringCellValue())) {
					list.add(mapdata.get(str));
					System.out.println("val: "+s);
				}
			}

		}
		fin.close();
		
		
		return list;
	}
	
	public String callMain_Read() throws Exception{ System.out.println("Hello");
	  
	  main(new String[]{}); // //
	  
	  
	  return "Hello"; // return "Main Method Executed"; 
	  }
	
	 public static void main(String[] args) throws Exception {
	 ReadFromExcel excel= new ReadFromExcel();
	 excel.read_data("List1", "SQM Supplier Name");
	// }
}
}