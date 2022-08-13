
package Java.ABC;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
	
	@Test

	public void Ctest() throws IOException {
		

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();		
			
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");
		
		String S = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).getAttribute("value");
		
		Assert.assertEquals(S, "Google Search", "Value matched");
		
		System.out.println("Hi --- Makkale1");
		
		driver.quit();
		

		
	}
	
	@Test
	
	public void fftest() throws IOException {

		WebDriverManager.firefoxdriver().setup();

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");

		WebDriver driver = new FirefoxDriver(options);

		driver.get("https://www.mozilla.org/en-US/firefox/download/thanks/");
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(screenshot, new File("E:\\ss\\2.png"));

		System.out.println("Hi --- Makkale");
		
		driver.quit();
	}
		
		
		@Test
		public void fftest1() throws IOException {

			WebDriverManager.firefoxdriver().setup();

			WebDriver driver = new FirefoxDriver();

			driver.get("https://www.facebook.com/");
			
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        FileUtils.copyFile(screenshot, new File("E:\\ss\\2.png"));

			System.out.println("Hi --- Makkale");
			
			driver.quit();
			

	}
}