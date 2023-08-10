package objectRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {
	
	@FindBy(name ="lastname") 
	private WebElement contactname;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']") private WebElement saveBttn;
	
	
	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		}
	
	public void createContact(String contactnm) {
		contactname.sendKeys(contactnm);
		saveBttn.click();
	}
	
	

}
