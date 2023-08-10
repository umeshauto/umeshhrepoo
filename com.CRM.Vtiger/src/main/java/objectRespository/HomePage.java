package objectRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.Vtiger.genericUtility.WebdriverUtility;

public class HomePage extends  WebdriverUtility{
	
	@FindBy(xpath = "//a[.='Organizations']/parent::td[@class='tabUnSelected']") private WebElement orgLink;
	@FindBy(linkText = "Contacts") private WebElement contLink;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']") private WebElement Admistrator;
	@FindBy(xpath  ="//a[.='Sign Out']") private WebElement signoutBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void orgclick() {
		orgLink.click();
	}
	
	public void contactclick() {
		contLink.click();
	}
	
	public void logout(WebDriver driver) {
		mouseHover(driver, Admistrator);
		signoutBtn.click();
	}
	
	

	
}
