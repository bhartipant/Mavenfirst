package maven_project_Fr;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class script_SR {
	WebDriver driver; 
   @BeforeTest
	public void Launch_Brower()
	{ 
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions co= new  ChromeOptions();
	   co.addArguments("--remote-allow-origins=*");
	   driver =new ChromeDriver(co);
	   driver.manage().window().maximize();
	   driver.get("https://blazedemo.com/");
		
	}
	
  @Test
  public void ListofData()
  {
	  WebElement list=driver.findElement(By.name("fromPort"));
	  Select s=new Select(list);
	  List<WebElement> alloption =s.getOptions();
	  System.out.println(alloption.size());
	  for(int i=0;i<alloption.size();i++) {
		  System.out.println(alloption.get(i).getText());
	  }
	  
  }
  @AfterTest
  public void End_brower()
  {
	  
  }
}
