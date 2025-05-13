import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTask {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[text()='Add New Task']")).click();
		driver.findElement(By.xpath("//div[text()='Create new tasks']")).click();
		//div[text()='Select Customer and Project to Add Tasks for']/following::button[text()='Our Company']
		
		driver.findElement(By.xpath("//div[text()='Select Customer and Project to Add Tasks for']/following::button[text()='Our Company']")).click();
	}

}
