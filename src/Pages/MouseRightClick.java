package Pages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import test.Base;

public class MouseRightClick extends Base {
	
	@FindBy(xpath = "//span[contains(.,'right click me')]") WebElement rightclickbtn;
	
	public void mouserightclick() {
		Actions act = new Actions(driver);
		act.contextClick(rightclickbtn).perform();
		List <WebElement> elements = driver.findElements(By.cssSelector("li span"));
		System.out.println("WebElements After Right click");
		for (WebElement element :  elements)
		{
			highlighter.highlightElement(driver, element);
			System.out.println("\t" + element.getText());
		}
	}

}
