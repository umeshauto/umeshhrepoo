package objectRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {

	
	@FindBy(css = "span[class='dvHeaderText']") 
	private WebElement conatctText;   
	
	public ContactInfoPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public String getCreatedconatc() {
		return conatctText.getText();
	}
	
}
