package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public String homeUrl = "https://demo.nopcommerce.com/";

	
	public void openApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(homeUrl);
		driver.manage().window().maximize();

	}
	

}
