import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateAndDeleteProject {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
		
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("BANK");
		
		driver.findElement(By.xpath("//button[text()='-- Please Select Customer to Add Project for  --']")).click();
		Actions a=new Actions(driver);
		WebElement target = driver.findElement(By.linkText("HDFC002"));
		a.moveToElement(target).perform();
		driver.findElement(By.linkText("HDFC002")).click();
		driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("old customer");
		driver.findElement(By.id("projectPopup_commitBtn")).click();
		
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...' ])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...' ])[1]")).sendKeys("BANK");
		
		
		
		driver.findElement(By.xpath("//div[@class='title']/child::span[text()='BANK']/following::div[@class='editButton available']")).click();
	

	}

}
