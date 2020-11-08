package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver", "C:\\\\Program Files\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(3000);
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
        System.out.println("mouseover completed");
        driver.findElement(By.linkText("Employee List")).click();
        Thread.sleep(2000);
        driver.switchTo().frame("rightMenu");
        System.out.println("switch to frames completed");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("txtEmpLastName")).sendKeys("gopi");
        Thread.sleep(2000);
        driver.findElement(By.name("txtEmpFirstName")).sendKeys("thirumalsetty");
        Thread.sleep(2000);
        driver.findElement(By.id("btnEdit")).click();
        Thread.sleep(2000);
        System.out.println("add emp  completed");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
        System.out.println("Logout completed");
        Thread.sleep(2000);
        driver.close();
        
	}

}
