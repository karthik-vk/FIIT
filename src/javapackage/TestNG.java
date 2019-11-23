package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG {
public WebDriver driver=null;
  @BeforeSuite
  public void LaunchBrowser() {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://newtours.demoaut.com/");
	  System.out.print("Browser Launched Successfully");
	  
  }
@Test(priority=1)
public void Login() {
	driver.findElement(By.name("userName")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
    driver.findElement(By.name("login")).click();
    System.out.print("Login Successfully");
}


@AfterSuite
public void Closebrowser() {
	driver.findElement(By.linkText("SIGN-OFF")).click();
	driver.close();
	System.out.print("Logged Out Successfully");
}

}


