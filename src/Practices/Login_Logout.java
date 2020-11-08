package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Logout {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Log completed");
		driver.quit();

	}

}
