package Kitetest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Baseclass;
import KiteApp.pom1;
import KiteApp.pom2;
import KiteApp.pom3;
import Utility.KiteUtilityclass;

public class Test_class extends Baseclass{
//declare all useful members as global
	pom1 login1;
	pom2 login2;
	pom3 home;
	
	@BeforeClass
	public void openBrowser()    {
		initializeBrowser();
		//all objects of pom class
		login1=new pom1(driver);
		login2=new pom2(driver);
		home=new pom3(driver);
	}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		//enter un
		login1.enterUN(KiteUtilityclass.getTD(0, 0));//DPG458
		System.out.println(KiteUtilityclass.getTD(0, 1));
		//click on loginbtn
		login1.clickLOGINBTN();
		//enter pin
		login2.enterPIN(KiteUtilityclass.getTD(0, 2));
		//click on continue btn
		login2.clickcnbtn();
	}
	@Test
	public void verifyuserID()  {
		Reporter.log("running verify userID",true);
		Object actID = home.verifyELEMENT();
	
		String expID = KiteUtilityclass.getTD(0, 0);
		Assert.assertEquals(expID,actID,"both are different tc is failed" );
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout the application",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the app",true);
	
	
	}
	
}
