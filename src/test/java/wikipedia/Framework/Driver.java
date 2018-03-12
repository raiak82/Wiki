package wikipedia.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    protected static WebDriver driver;

    public static WebDriver getInstance() {

        if (driver == null) {
        	System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        }

        return driver;

    }

}
