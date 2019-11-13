package Pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import test.Base;


public class ChkAction extends Base {
	
	//WebDriver driver;
	@FindBy(xpath = "//input[contains(@class,'gLFyf gsfi')]") WebElement searchbox;
	public void ChkAction1() {
		//driver = new ChromeDriver();
		Actions act = new Actions(driver);
		act.keyDown(searchbox, Keys.SHIFT);
		act.sendKeys(searchbox,"with build");
		act.keyUp(searchbox, Keys.SHIFT);
		Action a = act.build();
		a.perform();
		
		
		//a.perform();
		
	}

}
