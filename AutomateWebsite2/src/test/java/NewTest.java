import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class NewTest {
  @Test
  public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Pictures\\Screenshots\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement signin = driver.findElement(By.id("nav-signin-tooltip"));
		this.takeSnapShot(driver, "E:\\eclipse jee 2\\AutomateWebsite2\\src\\test\\java//1.png") ;
		
		signin.click();
		driver.findElement(By.name("email")).sendKeys("email_id");
		this.takeSnapShot(driver, "E:\\eclipse jee 2\\AutomateWebsite2\\src\\test\\java//2.png") ;
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("password");
		this.takeSnapShot(driver, "E:\\eclipse jee 2\\AutomateWebsite2\\src\\test\\java//3.png") ;
		
		driver.findElement(By.id("signInSubmit")).click();
		
		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("google pixel 6a");
		this.takeSnapShot(driver, "E:\\eclipse jee 2\\AutomateWebsite2\\src\\test\\java//4.png") ;
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		this.takeSnapShot(driver, "E:\\eclipse jee 2\\AutomateWebsite2\\src\\test\\java//5.png") ;
		
		driver.get("https://www.amazon.in/Google-Pixel-Sage-128GB-Storage/dp/B0B3Q23BT4/ref=sr_1_2?keywords=google+pixel+6a&qid=1664879510&qu=eyJxc2MiOiIzLjc5IiwicXNhIjoiMi45MCIsInFzcCI6IjIuNDEifQ%3D%3D&sprefix=google+%2Caps%2C320&sr=8-2");
		this.takeSnapShot(driver, "E:\\eclipse jee 2\\AutomateWebsite2\\src\\test\\java//6.png") ;
		
		WebElement addtocart= driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		
		Thread.sleep(7000);
		this.takeSnapShot(driver, "E:\\eclipse jee 2\\AutomateWebsite2\\src\\test\\java//7.png") ;
		
	}
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	
		File DestFile=new File(fileWithPath);
		
		FileUtils.copyFile(SrcFile, DestFile);
		}
}
