package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Program Files\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		if (driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
	System.out.println("Title matched");}
	else {
		System.out.println("Title not matched ");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		Thread.sleep(1000);
		driver.close();
		
		
		
			

	}

}
