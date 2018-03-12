package wikipedia.Framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebUi extends Driver{

    protected void verifyTitle(String pageTitle) throws Exception {
        try {
            Assert.assertTrue(driver.getTitle().contains(pageTitle));
        } catch (Exception e) {
            Logger.error("Exception in verifyPageTitle()");
            Logger.error(e.toString());
            throw new Exception(e);

        }

    }
    public void navigateBack(String URL) {
        driver.get(URL);
    }
}
