
package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Browser  {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\SeleniumPractice\\dri\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		//to maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//Create object for actions class
		
		Actions a = new Actions(driver);
		
		WebElement txtUername = driver.findElement(By.id("email"));
		
		txtUername.sendKeys("ramsss");
		
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		
		
		txtPassword.sendKeys("12345");
		
		
		a.doubleClick(txtUername).perform();
		
		a.doubleClick(txtPassword).perform();
		
		
		
	}
}
