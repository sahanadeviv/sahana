package maven01;

import org.openqa.selenium.chrome.ChromeDriver;

public class m01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SahanadeviV\\OneDrive - Royal Cyber Inc\\Desktop\\chromedriver.exe");
		ChromeDriver a= new ChromeDriver();
		a.get("https://app.gotestpro.com");
	}

}
