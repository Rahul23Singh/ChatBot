package Script;
import java.util.TimerTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunEverySeconds extends TimerTask {

	public WebDriver driver;
	
	@BeforeMethod
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\ChatBot\\Jars\\chromedriver.exe");
		driver.findElement(By.xpath(""));
	}
	
	@Test
    public void run() {
    	WebElement OpeningProce = driver.findElement(By.xpath(""));
        System.out.println("Hello World");
    }
}
