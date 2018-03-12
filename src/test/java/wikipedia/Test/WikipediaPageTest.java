package wikipedia.Test;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import wikipedia.Framework.BaseTest;
import wikipedia.Page.WikiResult;
import wikipedia.Page.WikiSearch;
import wikipedia.Page.WikipediaPage;

import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.stream.Collectors;


public class WikipediaPageTest extends BaseTest{

	public static String searchLanguage = "English";
	public static String searchText = "Hewlett Packard";
	public static String NegativeText = "see it comes back and search works";

	@Test
	public void testWikiSearch() throws Exception{

		WikipediaPage wikiPage = PageFactory.initElements(WikipediaPage.getInstance(), WikipediaPage.class);
		wikiPage.verifyPageTitle("Wikipedia");
		new Select(wikiPage.searchLanguage).selectByVisibleText(searchLanguage);

		wikiPage.searchBox.sendKeys(searchText);
		wikiPage.searchButton.click();

		WikiSearch wikiSearch = PageFactory.initElements(WikiSearch.getInstance(), WikiSearch.class);
		wikiSearch.mainPage.click();

		WikiResult wikiResult = PageFactory.initElements(WikiResult.getInstance(), WikiResult.class);
		int SectionHeadercount= wikiResult.sectionHeaders.size();
		
		
		assert (SectionHeadercount == 9);
		assert(wikiResult.heading.getText().contains(searchText));
		

		//verify the section headers
		List<String> articleHeaders = wikiResult.sectionHeaders.stream()
									.map(element -> element.getText())
									.collect(Collectors.toList());
		assert articleHeaders.contains("From today's featured article");
		assert articleHeaders.contains("In the news");
		assert articleHeaders.contains("Did you know...");
		assert articleHeaders.contains("On this day...");

	}

	
	@Test
  	public void testwikiSearchResult() throws Exception{
	
	   
	   WikipediaPage wikiPage1 = PageFactory.initElements(WikipediaPage.getInstance(), WikipediaPage.class);
	    wikiPage1.navigateBack("https://wikipedia.org");
		new Select(wikiPage1.searchLanguage).selectByVisibleText(searchLanguage);

		wikiPage1.searchBox.sendKeys(NegativeText);
		wikiPage1.searchButton.click();

		WikiResult wikiResult = PageFactory.initElements(WikiResult.getInstance(), WikiResult.class);
  	
	   assertFalse(wikiResult.heading.getText().contains(NegativeText));

	   
  	}
}
