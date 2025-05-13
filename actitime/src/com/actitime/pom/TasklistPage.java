package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.FileLib;

public class TasklistPage {
//	@FindBy(linkText = "TASKS")
//	private WebElement taskTabBtn;
	
	
	
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerbtn;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement customerNameTf
	;
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement descriptionTf;
	
	@FindBy(id="customerLightBox_customerSelectorPlaceholder")
	private WebElement selectActiveCustomerDp;
	
	@FindBy(linkText ="Our Company")
	private WebElement ourCompanyOptn;
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createbtn;
	
	@FindBy(className="innerHtml")
	private WebElement textmsg;
	

 public TasklistPage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
 }


//public WebElement getTaskTabBtn() {
//	return TaskTabBtn;
//}
//

public WebElement getAddNewBtn() {
	return addNewBtn;
}


public WebElement getNewCustomerbtn() {
	return newCustomerbtn;
}


public WebElement getCustomerNameTf() {
	return customerNameTf;
}


public WebElement getDescriptionTf() {
	return descriptionTf;
}


public WebElement getSelectActiveCustomerDp() {
	return selectActiveCustomerDp;
}


public WebElement getOurCompanyOptn() {
	return ourCompanyOptn;
}


public WebElement getCreatebtn() {
	return createbtn;
}


public WebElement getTextmsg() {
	return textmsg;
}
}
