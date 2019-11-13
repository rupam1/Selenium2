package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import test.Base;

public class ChkActionWithoutBuild extends Base{
	
	@FindBy(xpath = "//input[contains(@class,'gLFyf gsfi')]") WebElement searchbox;
	
	public void TestWithoutBuild() {
		
		searchbox.clear();
		Actions act = new Actions(driver);
		act.keyDown(searchbox, Keys.SHIFT);
		act.sendKeys(searchbox, "Without Build");
		act.keyUp(searchbox, Keys.SHIFT);
		act.perform();
		searchbox.clear();
		act.keyDown(searchbox, Keys.SHIFT).sendKeys("Works too").keyUp(searchbox, Keys.SHIFT).perform();
		
	}

}
