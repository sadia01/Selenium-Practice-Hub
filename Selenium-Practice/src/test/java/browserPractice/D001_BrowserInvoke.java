package browserPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D001_BrowserInvoke {

	public static void main(String[] args) {
		
//      Invoke Browser: Chrome, Firefox, Edge
//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new EdgeDriver();

        WebDriver driver = new ChromeDriver();
        driver.get("https://codenbox.com/");

	}

}
