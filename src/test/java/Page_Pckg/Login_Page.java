package Page_Pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@name=username")WebElement username;
	@FindBy(xpath="//*[@name=password")WebElement password;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")WebElement login;
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void login_mthd(String un,String pswd)
	{
		username.sendKeys(un);
		password.sendKeys(pswd);
		login.click();		
	}
	

}
