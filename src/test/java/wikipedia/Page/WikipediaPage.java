package wikipedia.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import wikipedia.Framework.WebUi;

public class WikipediaPage extends WebUi{

	@FindBy(how = How.ID, using = "searchLanguage")
	public WebElement searchLanguage;

	@FindBy(how = How.ID, using = "searchInput")
	public WebElement searchBox;


	@FindBy(how = How.CLASS_NAME, using = "pure-button-primary-progressive")
	public WebElement searchButton;

	public void verifyPageTitle(String pageTitle) throws Exception{
		verifyTitle(pageTitle);
	}

}
