package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import test.Base;

public class dragSliderLeftSide extends Base {
	
	@FindBy(xpath = "//div[@id='js-rangeslider-0']/div[2]") WebElement slider;
	@FindBy(id= "js-output") WebElement output;
	
	public void dragleftslider() {
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, -85, 0).perform();
		System.out.println("What is the Output after Dragging Left" + output.getText());
		
	}

}
