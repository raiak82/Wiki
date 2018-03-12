package wikipedia.Framework;

import wikipedia.Page.WikipediaPage;


public class PageDetails {

    private static WikipediaPage wikiPage;


    public static void initializePageObjects() {

        wikiPage = new WikipediaPage();
    }

}
