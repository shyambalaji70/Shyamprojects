package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi {
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driverla\\chromedriver.exe");
	driver.get("https://github.com/shyambalaji70/Shyamprojects");
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("shyambalaji70@gmail.com");
	WebElement passWord = driver.findElement(By.id("pass"));
	passWord.sendKeys("2342323");
	
	
	}

		
	}