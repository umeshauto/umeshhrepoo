package objectRespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Identify the webelement and declare the element as private
	@FindBy(name="user_name") private WebElement usernameEdt;
	@FindBy(name="user_password") private WebElement passwordEdt;
	@FindBy(id="submitButton") private WebElement submitBtn;
	
	//craete constructor to initialize the webelemet
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//craete the generic method for script optimization
	public void login(String un,String pwd) {
		usernameEdt.sendKeys(un);
		passwordEdt.sendKeys(pwd);
		submitBtn.click();
		
		
	}
	
	
	
	

}
