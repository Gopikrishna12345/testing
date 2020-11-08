package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Program Files\\\\Drivers\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		int row = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[7]/td")).size();
        int row_col = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/td")).size();
        String cell= driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[2]")).getText();
        for (int i=1;i<=row;i++) {
        	String s = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]")).getText();
        	System.out.println(s);
        }
        
        System.out.println(row);
        System.out.println(col);
        System.out.println(row_col);
       
       System.out.println(cell);
       driver.close();
       // for (int i=2;i<=row;i++) {
        	//String s = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]")).getText();
        	//System.out.println(s);
        	
        	
        	
     //   }
	}

}
