package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver", "C:\\\\Program Files\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("krishna");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("gopi");
		WebElement fileinput = driver.findElement(By.name("photofile"));
		fileinput.sendKeys("C:\\Users\\ASUS\\Desktop\\Screenshot 2020-10-31 200949.png");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		


	}

}
