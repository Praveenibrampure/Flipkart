package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstWebDriverTest {
	
	public static void main(String args[]) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://google.com");
		//driver.get("https://nichethyself.com/tourism/home.html");
		driver.get("https://nichethyself.com/tourism/home.html");
		
		
		//WebDriver is an interface provided by Selenium
		//ChromeDriver is a class provided by Selenium	
		
		WebElement user = driver.findElement(By.name("username")); // name is a static method
		user.sendKeys("stc123");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("12345");
		
		user.submit();
		
		
	}

}
