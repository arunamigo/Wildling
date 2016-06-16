package myPackageTest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.*;
import org.apache.poi.ss.usermodel.DataFormatter;


public class ReadXlsx {
	
//	public void 
	
	public void ReadXLSXFile(String fileName){
	
		InputStream XlsxFileToRead = null;
		XSSFWorkbook workbook = null;
		DataFormatter df = new DataFormatter();
		
		try {
			XlsxFileToRead = new FileInputStream(fileName);
			
			//Getting the workbook instance for xlsx file
			
			workbook = new XSSFWorkbook(XlsxFileToRead);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	//getting the first sheet from the workbook using sheet name. 
			// We can also pass the index of the sheet which starts from '0'.
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			XSSFRow row;
			XSSFCell cell;
			
			//Iterating all the rows in the sheet
			Iterator rows = sheet.rowIterator();

			while (rows.hasNext()) {
				row = (XSSFRow) rows.next();
				
				//Iterating all the cells of the current row
				Iterator cells = row.cellIterator();

				while (cells.hasNext()) {
					cell = (XSSFCell) cells.next();

					if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
						System.out.print(cell.getStringCellValue() + " ");
					} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
						System.out.print(df.formatCellValue(cell) + " ");
//						System.out.print(cell.getNumericCellValue() + " ") //returns num.0
					} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
						System.out.print(cell.getBooleanCellValue() + " ");

					} else { // //Here if required, we can also add below methods to
								// read the cell content
								// XSSFCell.CELL_TYPE_BLANK
								// XSSFCell.CELL_TYPE_FORMULA
								// XSSFCell.CELL_TYPE_ERROR
					}
				}
				System.out.println();
				try {
					XlsxFileToRead.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}

	public static void main (String[] args) {
		
		ReadXlsx readXlsx = new ReadXlsx();
		
//		readXlsx.ReadXLSXFile("D:\\TheOne\\Test_Excel_Sheets\\testdata.xlsx");
		
		
		GetHashMap get = new GetHashMap();
		
		get.getHashMap("D:\\TheOne\\Test_Excel_Sheets\\testdata.xlsx");
		get.printHashMap();
		
		
}

}
