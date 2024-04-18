package testngseession;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@BeforeTest
	public void launcBrowser() {
		System.out.println("BT -- Launch the browsr");
	}
	

	@Test
	public void titleTest() {
		System.out.println("titleTest");
	}

	@Test
	public void urlTest() {
		System.out.println("urlTest");
	}

	@Test
	public void headerTest() {
		System.out.println("headerTest");
	}
    @AfterTest
	public void closeBrowser() {
		System.out.println("AT -- Browsr is closed");
	}
}
