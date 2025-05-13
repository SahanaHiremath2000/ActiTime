package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void OpenBrowser(String browser) throws IOException, InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileLib l= new FileLib();
		driver.get(l.getPropertyData("Url"));
		
		Reporter.log("openBrowser",true);
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();Thread.sleep(4000);
		}
		else if (browser.equals("Firefox")) 
	   {
			driver=new FirefoxDriver();Thread.sleep(4000);
			
		}
			
	}
	
	@BeforeMethod
	public void login()
	{
		LoginPage lg=new LoginPage(driver);
		lg.setLogin("admin", "manager");
	}
	
	@AfterMethod
	public void logout()
	{
		HomePage lo= new HomePage(driver);
		lo.SetLoBtn();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

	
}

	


	
	