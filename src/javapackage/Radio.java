package javapackage;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Radio extends TestNG {
	//public WebDriver driver=null;
	@Test(priority=2)
	public void Radiobutton() {
		WebElement radio1=driver.findElement(By.xpath("//body//b//input[2]"));
	    radio1.click();
	System.out.print("Radio Button Selected");
	}
}
