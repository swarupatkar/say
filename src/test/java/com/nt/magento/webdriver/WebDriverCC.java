package com.nt.magento.webdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.nt.magento.utils.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCC {
	//constructor
	public WebDriverCC() {
		System.out.println("WebDriverCC");
	}
	
	
	
	
	// All the methods related to browser setup and tear-down
	WebDriver driver;
	public static ThreadLocal<WebDriver> thread = new ThreadLocal<WebDriver>();

	@BeforeMethod(alwaysRun = true)
	@Parameters(value = "browser")
	public void setupBrowser(String browserName) {
		System.out.println("setupBrowser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Invalid Browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		setDriver(driver);
	}

	@AfterMethod(alwaysRun = true)
	public void teardownBrowser() {
		System.out.println("teardownBrowser");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.quit();
	}

	public static synchronized void setDriver(WebDriver driver) {
		System.out.println("setDriver");
		thread.set(driver);
	}

	public static synchronized WebDriver getDriver() {
		System.out.println("getDriver");

		return thread.get();
	}
	@DataProvider(name="testdata")
	public String[][] getDataExcel(){
		String[][] data = null;
		try {
			data = ReadExcelData.ReadDataCC("LoginTestData.xlsx", "Sheet1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}

}
