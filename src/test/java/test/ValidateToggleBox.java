package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TestPage;
import util.BrowserFactory;

public class ValidateToggleBox {

	WebDriver driver;

	@Test
	public void ValidateToggleCheckBox() throws InterruptedException {

		driver = BrowserFactory.init();
		TestPage testPage = PageFactory.initElements(driver, TestPage.class);
		Thread.sleep(2000);
		testPage.inputData("test1");
		testPage.addData();
		Thread.sleep(2000);
		testPage.inputData2("test2");
		testPage.addData2();
		testPage.checkBox();
		testPage.verifyToggleBox("Complete");
		testPage.checkBox();
		Thread.sleep(4000);
		testPage.selectListItem();
		testPage.removeListItem();
		Thread.sleep(2000);
		testPage.checkBox();
		testPage.removeListItem();
	}
}