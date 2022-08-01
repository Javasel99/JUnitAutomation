package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestPage extends BasePage {

	WebDriver driver;

	public TestPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='data']")
	WebElement Input_data;
	@FindBy(how = How.XPATH, using = "//input[@value ='Add']")
	WebElement Add_data;

	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement Check_Box;
	@FindBy(how = How.XPATH, using = "//input[@value='Complete']")
	WebElement Toggle_Box;
	@FindBy(how = How.XPATH, using = "//div/form/ul/li[1]")
	WebElement Select_List_Item;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement Remove_List_Item;

	public void inputData(String test1) {
		Input_data.sendKeys(generateRandomNo(999) + test1);
	}

	public void addData() {
		Add_data.click();
	}

	public void inputData2(String test2) {
		Input_data.sendKeys(generateRandomNo(999) + test2);
	}

	public void addData2() {
		Add_data.click();
	}

	public void checkBox() {
		Check_Box.click();

	}

	public void verifyToggleBox(String Complete) {
		Assert.assertEquals(Toggle_Box.isSelected(), false);
	}

	public void selectListItem() {
		Select_List_Item.click();
	}

	public void removeListItem() {
		Remove_List_Item.click();

	}

}