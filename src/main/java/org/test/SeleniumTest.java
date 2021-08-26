package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class SeleniumTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",

				"C:\\Course\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ExtentSparkReporter reporter = new ExtentSparkReporter("report.html");
		ExtentReports extReports = new ExtentReports();
		extReports.attachReporter(reporter);
		ExtentTest test = extReports.createTest("India vs Srilanka");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.co.in");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("India vs Srilanka");
		driver.findElement(By.xpath("//input[@name='q']")).submit();
		test.pass("Test Passed");
		driver.quit();
		extReports.flush();
	}
}
