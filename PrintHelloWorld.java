package Script;

import java.util.Timer;

import org.openqa.selenium.WebDriver;

public class PrintHelloWorld {
	public WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		 
	        Timer timer = new Timer();
	        timer.schedule(new RunEverySeconds(), 0,1000);
	 }

}
