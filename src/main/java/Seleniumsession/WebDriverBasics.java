package Seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// open browser
		// enter the url
		// get the title
		//verfify exp vs act

		//Automation steps
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("Title is :"+title);
		
		//checkpoint/verifiaction point/act vs expeated result
		if(title.equals("Google")) {
			System.out.println("Correct Title :PASS");
		}
		else {
			System.out.println("Wrong Title :FAIL");
		}
		
		//Automation Steps +Verfiaction=Autoamtion Testing
		//Test steps +Verifiaction point -Testcase
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.contains("google.com")){
			System.out.println("URL is correct:PASS");
		}
		else {
			System.out.println("URL is incorrect:Failed");
		}
		
		//close the browser and quit
		driver.close();
	}

}
