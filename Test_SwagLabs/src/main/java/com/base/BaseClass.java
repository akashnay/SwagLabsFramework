package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;

	public BaseClass() {
		prop = new Properties();
		FileInputStream file;

		try {
			file = new FileInputStream(
					"C:\\Users\\Akash\\eclipse-workspace\\Test_SwagLabs\\src\\main\\java\\com\\config\\config.properties");
			prop.load(file);
		} catch (IOException e) {
		}

	}

	public static void openBrowser() {
		String bName = prop.getProperty("browserName");
		String appURL = prop.getProperty("url");

		if (bName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (bName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (bName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(appURL);
		driver.manage().window().maximize();
		/*
		 * driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 */
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}
}
