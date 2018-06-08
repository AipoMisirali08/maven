package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBaseClass {
	protected WebDriver driver;
	
	
	@BeforeClass
	public void setup(@Optional String browser) {
		driver= Driver.getDriver(browser);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(Config.getProperty("url"));

	}
	

}
