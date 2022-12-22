package com.amazon.resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonActions  {

	public static WebDriver driver;
	public static Actions a;

	public void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	public void browserClose() {
		driver.quit();
	}
	
	public void clickElement(WebElement element) {
		Actions a = new Actions(driver);
		element.click();
	}

	public void inserttext(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public void insertTextEnter(WebElement element,String value) {
		element.sendKeys(value, Keys.ENTER);;
	}

	public void windowsHandling() {
		String parenturl = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if (!parenturl.equals(x)) {
				driver.switchTo().window(x);
			}
		}
	}
	
//	public void screenShot(String name) throws IOException {
//		TakesScreenshot tk = (TakesScreenshot) driver;
//		File source = tk.getScreenshotAs(OutputType.FILE);
//		File location = new File("C:\\Users\\Windows\\Ramesh\\CucumberFrames\\target\\"+name+".png");
//		FileUtils.copyFile(source, location);
//	}	
	public void keyboard() throws AWTException {
		Robot r = new Robot();
	}

}
