package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;





public class FileLib {
	
	public String getPropertyData(String key) throws IOException 
	{
		FileInputStream fis= new FileInputStream("./data/commondata.property");
		Properties p= new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	public String getExcelData(String SheetName,int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		Workbook wb=  WorkbookFactory.create(fis);
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
				
	}
	
	 public void setExcelData(String SheetNmae, int row, int cell) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream fis= new FileInputStream("./data/testscript.xlsx");
		 Workbook wb= WorkbookFactory.create(fis);
		 wb.getSheet(SheetNmae).getRow(cell).getCell(cell);
		 
		 FileOutputStream fos= new FileOutputStream("./data/testscript.xlsx");
		 wb.write(fos);
		 
	 }
	
	

}
