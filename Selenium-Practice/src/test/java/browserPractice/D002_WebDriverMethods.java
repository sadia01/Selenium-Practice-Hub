package browserPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D002_WebDriverMethods {

	public static void main(String[] args) {
		
        //Invoke Browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://codenboxautomationlab.com/");
        //Maximize Window
        driver.manage().window().maximize();
        //Get Title In Tab
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        //Get Current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        //Close Browser - Closes the Active Window or Tab if only one is opened
        driver.close();
        //Quit Browser - Closes all the Opened Windows or Tabs by Selenium and Terminates the Browser Session
        //driver.quit();

	}

}
