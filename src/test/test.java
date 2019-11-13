package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.ChkAction;
import Pages.ChkActionWithoutBuild;
import Pages.dragSliderLeftSide;
import Pages.dragdrop;

public class test extends Base{

	/*@Test(priority=0)
	public void ChkActions() {
		
		ChkAction ChkAct= PageFactory.initElements(driver, ChkAction.class);
		ChkAct.ChkAction1();
	}
	*/
	
	/*@Test(priority=1)
	public void ChkActionWithoutBuildMethod() {
		ChkActionWithoutBuild withoutBuild = PageFactory.initElements(driver, ChkActionWithoutBuild.class);
		withoutBuild.TestWithoutBuild();
	}
	*/
/*	@Test
	public void draganddrop() {
		dragdrop dradrop = PageFactory.initElements(driver, dragdrop.class);
		dradrop.draganddropcheck();
	}*/
	
	@Test
	public void dragSliderLeft() {
		dragSliderLeftSide drgslider = PageFactory.initElements(driver, dragSliderLeftSide.class);
		drgslider.dragleftslider();
		
		
	}

}
