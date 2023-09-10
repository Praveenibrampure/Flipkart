package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MyFirstTestngTest {
	
	WebDriver driver;

	// Methods which are having @Test annotation is your test case
	// test are executed on alphabetical order
	
	@Test
	public void googlesearch() {
		System.out.println("I am inside google search 2nd");
	}

	@Test
	public void thirdtestcase() {
		System.out.println("I am  3rd test case ");
	}
	

	@Test
	public void VerifyloginToNicheThyself() {
		System.out.println("I am inside login to nichethyself 1st");
	   driver.get("https://nichethyself.com/tourism/home.html");
		
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		
		driver.findElement(By.name("password")).sendKeys("12345");
		user.submit();
		
		String expectedvalue = "My account";
		String actuavalue = driver.getTitle();
		
		 
		
		//while working woith java we can use this 
		/*if(expectedvalue.equals(actuavalue)) {
			System.out.println("Test case pass successfully ");
		}else
		{
			System.out.println("Test case Failed");
		}*/
		
		// for making sure tst case is passed or not we can use the assertEquals , for verification
		//assertEquals(actuavalue, expectedvalue);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("----------------------------");
		System.out.println("I am in Before Method");
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
			
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in After method");
		System.out.println("----------------------------");
		
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in Before Class");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am in After class");
		driver.quit();
	}

}
