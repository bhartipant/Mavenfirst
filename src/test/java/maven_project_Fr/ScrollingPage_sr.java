package maven_project_Fr;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingPage_sr {
	
	WebDriver driver;
   @BeforeTest
   public void LaunchBrower() 
   { 
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions co= new  ChromeOptions();
	   co.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver(co);
	   driver.manage().window().maximize();
	   driver.get("https://www.selenium.dev/downloads/");
   }
   
	@Test
  public void Scrollbar() throws InterruptedException
	{
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement ch=driver.findElement(By.linkText("Chrome"));
		js.executeScript("arguments[0].scrollIntoView()",ch);
		
		System.out.println(ch.getText());
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
    }
	
	@AfterTest
	public void Endbrower() {
		
	}
}
