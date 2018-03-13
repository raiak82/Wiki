# Wiki

To run the test, user needs to-
1) Java installed on machine and configured in PATH
2) Maven installed on machine and configure Maven_home and M2 in Path
3) Download/Clone the repository and run the following commands

Open the command prompt and navigate to the downloaded repository folder.
Run the following maven command
mvn clean
mvn install
mvn dependency:tree
mvn test

Test Result can be seen under test-output->testng-results.xml folder in the repository

Understanding of Framework folder structure-
1) Framework folder/package has reusable libraries that will be common for any web page.
Base Class- it has methods to initialize, clear cookies, launch URL etc. This is common for any web app
WeBuI class- method to verify title of page. Common utility function
Logger class- for logging
pagedetails class- to initialize the element of page
Driver class- to set up web driver instance

2) Page package- As framework uses page object model, this package has classes specific to page with all the elements. It uses page factory way to extract elements.

3) Test package- This is the actual test methods i.e. test steps of the test.

 Test method testWikiSearch- this test method is for happy path testing.
It validates- title of wikipedia page
Select English search language
Search for Hewlett-Packard
As the search result is positive, heading of search result will have value Hewlett Packard
Navigate to Main page and validate all the headers "From today's featured article”,"In the news”),"Did you know…”,"On this day...")


Test method testwikiSearchResult - this test metho for negative testing of search string 

Search for text "see it comes back and search works" and validate the search result do not have heading with search string if search not present.