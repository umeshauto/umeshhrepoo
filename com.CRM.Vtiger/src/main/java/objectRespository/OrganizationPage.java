package objectRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	@FindBy(xpath= "//img[@alt='Create Organization...']") private WebElement OrgLookUpIcon;

	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void orgLookup() {
		 OrgLookUpIcon.click();
	}

	public WebElement getOrgLookUpIcon() {
		return OrgLookUpIcon;
	}
	
	//By using getters
	
	
	
	
	
	

}
