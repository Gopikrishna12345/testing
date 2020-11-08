package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrms.utility.Log;

public class General extends Global {


	public void openapplication() 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("application opened");
		Reporter.log("application opened");
		Log.info("application opened");
		
		}

	public void login() {
		driver.findElement(By.name(txt_username)).sendKeys(un);	
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_lolgin)).click();
		System.out.println("login completed");
		Reporter.log("login completed");
		Log.info("login completed");
		}

	public void closeapplication() {
		driver.close();
		System.out.println("application closed");
		Reporter.log("application closed");
		Log.info("application closed");
	}

	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");
		Reporter.log("logout completed");
		Log.info("logout completed");
	}

	public void goto_emp_page() {
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText(link_pim))).perform();
		driver.findElement(By.linkText(link_addemp)).click();
		}

	public void enter_frames() {
		driver.switchTo().frame(frame_id);
		System.out.println("entered into frames");
		Reporter.log("entered into frames");
		Log.info("entered into frames");
	}

	public void add_emp() throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.name(name_ln)).sendKeys(ln);
		Thread.sleep(2000);
		driver.findElement(By.name(name_fn)).sendKeys(fn);
		Thread.sleep(2000);
		WebElement fileinput = driver.findElement(By.name(name_upload));
		Thread.sleep(2000);
		fileinput.sendKeys(file_path);
		Thread.sleep(2000);
		driver.findElement(By.id(id_save)).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
	}
	

}
