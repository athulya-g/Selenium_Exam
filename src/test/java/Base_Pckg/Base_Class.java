package Base_Pckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Page_Pckg.Home_Page;
import Page_Pckg.Login_Page;

public class Base_Class {

	public static WebDriver driver;
	public Login_Page lp;
	public Home_Page hp;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito--");
		driver=new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void object_mthd()
	{
		lp=new Login_Page(driver);
		hp=new Home_Page(driver);
	}
	
}
