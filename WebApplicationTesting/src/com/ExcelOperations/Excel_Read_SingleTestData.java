package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file= new FileInputStream("C:\\Users\\DELL PC\\Desktop\\PoojaSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\Singletestdatafile.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		Row r=sheet.getRow(0);
		Cell c=r.getCell(0);
		 
		String data=c.getStringCellValue();
		System.out.println(data);
       
	}

}
