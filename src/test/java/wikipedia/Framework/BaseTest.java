package wikipedia.Framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest extends PageDetails {

    WebDriver driver = null;
    private String AppUrl = "https://wikipedia.org";

    @BeforeSuite(alwaysRun = true)
    public void LaunchApp() {
        initialize();
        clearCookies();
        goToHomePage();
    }


    public void initialize() {
        driver = Driver.getInstance();
        initializePageObjects();

    }

    @AfterSuite(alwaysRun = true)
    public void close() {
        driver.close();
    }


    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }

    public void goToHomePage() {
        driver.get(AppUrl);
    }

}
