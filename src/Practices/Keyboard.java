package Practices;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard {

	public static void main(String[] args) throws AWTException,Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Program Files\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
        driver.close();

	}

}
