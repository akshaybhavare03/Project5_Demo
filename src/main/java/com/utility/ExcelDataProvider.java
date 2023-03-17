package com.utility;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public static String getexceldata(String name, int row, int cell) throws Exception {
		String path="C:\\Users\\Akshay\\eclipse-workspace\\Project5_Demo\\TextData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		return wb.getSheet(name).getRow(row).getCell(cell).getStringCellValue();
	}
	

}

