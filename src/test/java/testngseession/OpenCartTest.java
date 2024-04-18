package testngseession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//BS -- Connection established
//BT -- Launch the browsr
//BC -- User is created

//BM -- Login the APP
//headerTest
//AM -- Logout the app

//BM -- Login the APP
//titleTest
//AM -- Logout the app

//BM -- Login the APP
//urlTest
//AM -- Logout the app

//AC -- User is deletd
//AT -- Browsr is closed
//AS : DB Connection Disconnected

// before -test-after
public class OpenCartTest {
//Before annotations
	//1
	@BeforeSuite
	public void DbConnection() {
		System.out.println("BS -- Connection established");
	}
    //2
	@BeforeClass
	public void CreateUser() {
		System.out.println("BC -- User is created");
	}
    //3
	@BeforeTest
	public void launcBrowser() {
		System.out.println("BT -- Launch the browsr");
	}
    //4 7 10
	@BeforeMethod
	public void loginApp() {
		System.out.println("BM -- Login the APP");
	}
    //8
	@Test
	public void titleTest() {
		System.out.println("titleTest");
	}
    //11
	@Test
	public void urlTest() {
		System.out.println("urlTest");
	}
	//5
	@Test
	public void headerTest() {
		System.out.println("headerTest");
	}
//After annotations
	//6 9 12
	@AfterMethod
	public void logut() {
		System.out.println("AM -- Logout the app");
	}
   //13
	@AfterTest
	public void closeBrowser() {
		System.out.println("AT -- Browsr is closed");
	}
	 //14
	@AfterClass
	public void deleteUser() {
		System.out.println("AC -- User is deletd");
	}
	 //15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS : Disconnected with DB");
	}
}
