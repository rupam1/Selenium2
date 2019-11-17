package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import test.Base;

public class TakeScreenshot1 extends Base {
	
	public void takeGreyHoundScreenshot() {
		 //Convert web driver object to TakeScreenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		//Call getScreenshotAs method to create image file
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		//File destination = new File(System.getProperty("user.dir") + "/Screenshots/GreyHound.png");
		File destination = new File("D:\\test\\GreyHound.png");
		
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Screenshot Located At " + destination);
	}

}
