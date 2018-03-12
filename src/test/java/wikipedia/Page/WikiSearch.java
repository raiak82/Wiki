package wikipedia.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import wikipedia.Framework.WebUi;

public class WikiSearch extends WebUi {

	@FindBy(how = How.LINK_TEXT, using = "Main page")
	public WebElement mainPage;

	public void verifyPageTitle(String pageTitle) throws Exception{
		verifyTitle(pageTitle);
	}

}
