package objectRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	
	@FindBy(css = "span[class='dvHeaderText']") private WebElement headerText;
	
	public OrganizationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	public String getCreatedOrg() {
		return headerText.getText();
		}
	

}
