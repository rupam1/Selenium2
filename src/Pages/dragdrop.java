package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import test.Base;

public class dragdrop extends Base {
	
	@FindBy(xpath = "//p[contains(.,'Drag me to my target')]") WebElement drag;
	@FindBy(xpath = "//div[contains(@id,'droppable')]") WebElement drop;
	
	public void draganddropcheck() {
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop);
		act.perform();
	}

}
