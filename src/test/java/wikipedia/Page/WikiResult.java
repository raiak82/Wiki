package wikipedia.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import wikipedia.Framework.WebUi;

import java.util.List;

public class WikiResult extends WebUi {
//	@FindBy(how = How.CLASS_NAME, using = "mw-headline")
//	public WebElement sectionHeaders;
//
	@FindAll(@FindBy(how = How.CLASS_NAME, using = "mw-headline"))
	public List<WebElement> sectionHeaders;
	
	@FindBy(how = How.ID, using = "firstHeading")
 	public WebElement heading;
}
