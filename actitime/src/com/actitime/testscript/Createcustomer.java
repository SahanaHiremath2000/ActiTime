package com.actitime.testscript;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TasklistPage;



@Listeners(com.actitime.generic.ListnerImplementation.class)
public class Createcustomer extends BaseClass{
	
	@Test
	public void testcreatecustomer() throws EncryptedDocumentException, IOException {
	HomePage h = new HomePage(driver);
	h.setTasktab();
	
	FileLib e=new FileLib();
	String customerName = e.getExcelData("Sheet1",1,0);
	String description= e.getExcelData("Sheet1",1,1);
	
	
	TasklistPage t=new TasklistPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomerbtn().click();
	t.getCustomerNameTf().sendKeys(customerName);
	t.getDescriptionTf().sendKeys(description);
	t.getSelectActiveCustomerDp().click();
	t.getOurCompanyOptn().click();
	t.getCreatebtn().click();
	Assert.fail();
	
	
	String Actualmesg=t.getTextmsg( ).getText();
	boolean res=Actualmesg.contains(customerName);
	System.out.println(res);
	Assert.assertTrue(res);
	
	String Expectedmesg= "Customer '"+customerName+"' has been created";
	Assert.assertEquals(Actualmesg,Expectedmesg);
	System.out.println(Actualmesg);
	}
	
	

}
