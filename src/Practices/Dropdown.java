package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver", "C:\\\\Program Files\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(2000);
		driver.switchTo().frame("rightMenu");
		System.out.println("frames entered completed");
		Thread.sleep(2000);
		Select s = new Select(driver.findElement(By.name("loc_code")));
		s.selectByVisibleText("Emp. ID");
		System.out.println("dropdown completed");
		Thread.sleep(2000);
		driver.findElement(By.name("loc_name")).sendKeys("0030");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		System.out.println("emp delete completed");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		System.out.println("coming out of frames  completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Thread.sleep(2000);
		driver.close();
		

	}

}
