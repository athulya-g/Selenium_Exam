package Test_Pckg;

import org.testng.annotations.Test;

import Base_Pckg.Base_Class;

public class Login_Test extends Base_Class{
	
	@Test
	public void logintest_mthd()
	{
		lp.login_mthd("Admin", "admin123");
		
	}

}
