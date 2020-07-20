package seleniumTest;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_test {
	
	public static Properties prop;
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@Test
	@Parameters(value= {"Browser"})
	public static void initialise(String Browser) {
		
		if(Browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("---disable-notifications" );
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
			
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,20);
		driver.navigate().to("https://www.google.com");
		
		

}
	
}
