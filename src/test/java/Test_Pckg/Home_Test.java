package Test_Pckg;

import org.testng.annotations.Test;

import Base_Pckg.Base_Class;

public class Home_Test extends Base_Class {
	
	@Test(priority = 1)
	public void logo_verification()
	{
		boolean logo_verify=hp.logo_mthd();
		System.out.println("Logo is displayed "+logo_verify);
	}
	
	@Test(priority = 2)
	public void user_details()
	{
		hp.detail_mthd("Abcd", "update 4Ys 010Z");
		
	}
	
	@Test(priority = 3)
	public void screenshot_mthd() throws Exception
	{
		hp.scr_mtd();
	}
	
	@Test(priority = 4)
	public void logout_verify()
	{
		hp.profile_mthd();
	}
}
