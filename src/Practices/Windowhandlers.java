package Practices;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandlers {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Program Files\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		System.out.println("first wind opened");
		driver.findElement(By.id("newTabBtn")).click();
		System.out.println("sec wind opened");
		driver.findElement(By.id("newTabBtn")).click();
		System.out.println("third wind opened");
		ArrayList<String> windinfo = new 	ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windinfo.get(1));
		System.out.println("first wind opened");
		driver.quit();
		


	}

}
