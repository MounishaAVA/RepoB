package Java.ABC;


import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
	

	@Test
	public void Test1() throws Exception{ 
		
		System.out.println("Hi");
	}
	
	@Test
	public void Test3() throws Exception{ 
		
		System.out.println("Hi");
	}
	

	@Test
	public void Test4() throws Exception{ 
		
		System.out.println("Hi");
	}
	
	
	@Test
	public void Test2() throws Exception{ 
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		
		
		options.addArguments("--headless");
		
		options.addArguments("window-size=1980,1080");
		
		WebDriver driver = new ChromeDriver(options);

        
        //navigate to url
        driver.get("https://demoqa.com");
        
        System.out.println("Hello");
        
       //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("E:\\ss\\3.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        //closing the webdriver
        driver.quit();
    }

}