package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="logoutLink")
	private WebElement loBtn;
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskTab;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void SetLoBtn()
	{
		loBtn.click();;
	}
	 public void setTasktab()
	 {
		 taskTab.click();
	 
	 }
	
}
