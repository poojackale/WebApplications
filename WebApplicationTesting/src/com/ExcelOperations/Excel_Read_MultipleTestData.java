package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file= new FileInputStream("C:\\Users\\DELL PC\\Desktop\\PoojaSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\Multipletestdatafile.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet Sheet =workbook.getSheet("sheet");
		
		int rowcout=Sheet.getLastRowNum();
		
		for(int i=0;i<=rowcout;i++)
		 {
			 Row r=Sheet.getRow(i);
			 int cellcount=r.getLastCellNum();
			  
			 for(int j=0;j<cellcount;j++)
			 {
				 org.apache.poi.ss.usermodel.Cell 
				 c=r.getCell(j);
				 String data =c.getStringCellValue();
				 System.out.println(data+" ");
			 }
			 System.out.println(); 
		 }
}
}
