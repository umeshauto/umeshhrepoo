package com.CRM.Vtiger.organisationTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.Vtiger.genericUtility.BaseClass;
import com.CRM.Vtiger.genericUtility.ExcelUtility;

import objectRespository.CreateNewOrgPage;
import objectRespository.HomePage;
import objectRespository.OrganizationInfoPage;
import objectRespository.OrganizationPage;

//@Listeners(com.CRM.Vtiger.genericUtility.ListenerImplimentation.class)
public class VerifyOrganizationNameTest extends BaseClass{
	
	@Test(dataProviderClass = ExcelUtility.class,dataProvider = "getmultiple",groups = "regression")
	public void create(String org) throws Throwable {
		
	
	  //  String orgName = eutl.getDataFromExcel("sheet1", 0, 0)+rn;
	    String orgName = org+jutil.getRandom();
	 
		/*driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();*/
        
        HomePage hop=new HomePage(driver);
        hop.orgclick();
		//driver.findElement(By.xpath("//a[.='Organizations']/parent::td[@class='tabUnSelected']")).click();
        
        OrganizationPage orgp=new OrganizationPage(driver);
        //by using generic mtehod
        orgp.orgLookup();
        //By using getters
        orgp.getOrgLookUpIcon().click();
        //driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
        
        CreateNewOrgPage crtognm=new CreateNewOrgPage(driver);
        crtognm.createOrg(orgName);
		/*driver.findElement(By.name("accountname")).sendKeys(orgName);
        driver.findElement(By.xpath("(//div[@align='center']/input[@name='button'])[1]")).click();*/
        
        //screenshot step
  		//wutil.screenshot(driver, "Verify");
  		
  		OrganizationInfoPage orgif=new OrganizationInfoPage(driver);
  		String ExpectedORgName = orgif.getCreatedOrg();
		//String ExpectedORgName = driver.findElement(By.cssSelector("span[class='dvHeaderText']")).getText();
  		
		//org.testng.Assert.assertTrue( ExpectedORgName.contains(orgName));
  		Assert.assertTrue(ExpectedORgName.contains(orgName));
		System.out.println("Pass");
		
		
		
		/**WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions action=new Actions(driver);
	    action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();	**/	
	}

	
	@Test(groups = { "smoke","regression"})
	public void demo() {
		System.out.println("affected");
	}
}
