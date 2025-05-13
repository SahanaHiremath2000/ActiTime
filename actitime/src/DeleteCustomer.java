import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteCustomer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("HDFC002");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("She is a Test Engineer");
		
		driver.findElement(By.id("customerLightBox_customerSelectorPlaceholder")).click();
		driver.findElement(By.linkText("Our Company")).click();
		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		
		String text = driver.findElement(By.className("innerHtml")).getText();
		System.out.println(text);
		
		
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...' ])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...' ])[1]")).sendKeys("HDFC002");
		
		
		
		//WebElement target = driver.findElement(By.xpath("//span[@class='highlightToken']"));
		driver.findElement(By.xpath("//div[@class='title']/child::span[text()='HDFC002']/following::div[@class='editButton available']")).click();
	    //Actions a= new Actions(driver);
		//a.moveToElement(target).perform();
		//driver.findElement(By.xpath("//div[@class='editButton available'])")).click();
		driver.findElement(By.xpath("//div[@class='customerNamePlaceHolder']/following::div[@class='actionButton'][1]")).click();
		
		
		//driver.findElement(By.xpath("//div[@class='customerNamePlaceHolder']/following-sibling::div[@class='actions'][1]")).click();
		
		
		
		

	}

}
