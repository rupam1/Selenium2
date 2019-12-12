package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public static WebDriver driver;
	@BeforeTest
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://google.com");
		//driver.get("https://jqueryui.com/droppable/");
		//driver.get("https://rangeslider.js.org/");
		//driver.get("https://www.greyhound.com/");
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	    
	
	}

}

