package kubernetesTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest1
{
	@Test
	public void test() throws MalformedURLException 
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:59195/wd/hub"), options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("title :"+driver.getTitle());
		driver.quit();
	}
}
