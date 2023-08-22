package p2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {
	@Test( groups="r")
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SahanadeviV\\OneDrive - Royal Cyber Inc\\Desktop\\chromedriver.exe");
		ChromeDriver a= new ChromeDriver();
		a.get("https://www.saucedemo.com/");
		Thread.sleep(3000);	}
}
