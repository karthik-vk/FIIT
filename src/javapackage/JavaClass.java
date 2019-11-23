/**
 * 
 */
package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Karthik V
 *
 */
public class JavaClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    driver.get("http://newtours.demoaut.com/");
    //Login
    driver.findElement(By.name("userName")).sendKeys("admin");
    //driver.findElement(By.name("userName")).sendKeys("mercury");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
    driver.findElement(By.name("login")).click();
    //Flight Details
    /*WebElement radio=driver.findElement(By.xpath("//body//b//input[1]"));
    radio.click();*/
    WebElement radio1=driver.findElement(By.xpath("//body//b//input[2]"));
    radio1.click();
  //body//b//input[1]
    //Sign Off
    driver.findElement(By.linkText("SIGN-OFF")).click();
	driver.close();
	}

}
