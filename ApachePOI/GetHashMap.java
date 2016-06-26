package myPackageTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetHashMap {
	
	Map<String, String> linkedHashMap = new LinkedHashMap<>();
	
	void getHashMap(String fileName){
		String temp = null;
		
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

			boolean firstRow=true;
			while (rows.hasNext()) {
				row = (XSSFRow) rows.next();
						
				if(firstRow){
					firstRow=false;
					continue;}
				
				//Iterating all the cells of the current row
				Iterator cells = row.cellIterator();

				while (cells.hasNext()) {
					cell = (XSSFCell) cells.next();
					
					
					
					if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
						 temp = (String) df.formatCellValue(cell);
					} else if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
						linkedHashMap.put(temp, cell.getStringCellValue());
						//						System.out.print(df.formatCellValue(cell) + " ");
//						System.out.print(cell.getNumericCellValue() + " ") //returns num.0
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

	public void printHashMap() {
		
		Set entrySet = linkedHashMap.entrySet();
		
		Iterator it = entrySet.iterator();
		
		while(it.hasNext()){
			Map.Entry  me= (Map.Entry) it.next(); 
			System.out.print(me.getKey());
			System.out.print(" ");
			System.out.println(me.getValue());
		}
		}
		
		
		
	}
	
	
		
		
	


