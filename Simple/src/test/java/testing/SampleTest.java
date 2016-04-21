package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public static void test1()
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com");
                System.out.println("Browser opened");
		driver.close();
		driver.quit();
	}

}
