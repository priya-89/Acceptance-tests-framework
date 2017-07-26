package step_definitions.EFC;


import cucumber.api.java.en.Then;
import org.testng.Assert;
import step_definitions.support.SeleniumBase;

public class Alerts extends SeleniumBase {

    SeleniumBase sb = new SeleniumBase();

    @Then("^I enter job title in Text box$")
    public void iEnterJobTitleInTextBox() throws Throwable {

        sb.textBoxInput("JobTittle", "JobName");
    }

    @Then("^I enter City name in Text box$")
    public void iEnterCityNameInTextBox() throws Throwable {

        sb.textBoxInput("city", "CityName");
    }

    @Then("^I click on Search jobs$")
    public void iClickOnSearchJobs() throws Throwable {
        click("searchBox");
    }

    @Then("^I navigate directly to Search results page$")
    public void iNavigateDirectlyToSearchResultsPage() throws Throwable {
        assertTitle("SearchPageTitle");

    }
    @Then("^I navigate to Search results page$")
    public void iNavigateToSearchResultsPage() throws Throwable {
        assertTitle("SearchPageTitle");

    }

    @Then("^I click on Create Job Alert Button$")
    public void iClickOnCreateJobAlertButton() throws Throwable {
        click("CreateJobAlert");

    }

    @Then("^I enter Name of the job Alert in the drop box$")
    public void iEnterNameOfTheJobAlertInTheDropBox() throws Throwable {

        sb.textBoxInput("NameJobAlert", "JobAlertValue");

    }

    @Then("^I click on Create Job Alert$")
    public void iClickOnCreateJobAlert() throws Throwable {
        click("CreateJobAlertGreen");

    }

    @Then("^I click on update Job Alert$")
    public void iClickOnUpdateJobAlert() throws Throwable {

        click("UpdateJobAlert");

    }

    @Then("^I click on Update job Alert button on the layer window$")
    public void iClickOnUpdateJobAlertButtonOnTheLayerWindow() throws Throwable {
        click("UpdateJobAlertGreen");

    }

    @Then("^I mouse over on my profile and click on Job Alerts$")
    public void iMouseOverOnMyProfileAndClickOnJobAlerts() throws Throwable {

        mouseover("MouseOnAccount", "MouseToJobAlerts");

    }

    @Then("^I navigate to saved search page$")
    public void iNavigateToSavedSearchPage() throws Throwable {

        assertUrl("SavedSearch");
    }

    @Then("^I click on top save job alert Java$")
    public void iClickOnTopSaveJobAlertJava() throws Throwable {
        click("javaAlert");

    }


    @Then("^I click on Edit button for Saved Alert Java$")
    public void iClickOnEditButtonForSavedAlertJava() throws Throwable {
        click("EditButton");

    }

    @Then("^I select Never from the drop down Mailing list$")
    public void iSelectNeverFromTheDropDownMailingList() throws Throwable {

        SelectTextByVisibleText("MailListDropDown", "Never");
        //SelectTextByIndex("MailListDropDown", 0);

    }

    @Then("^I click on Save button$")
    public void iClickOnSaveButton() throws Throwable {
        click("SaveButton");

    }

    @Then("^I select Daily from the drop down Mailing list$")
    public void iSelectDailyFromTheDropDownMailingList() throws Throwable {
        SelectTextByVisibleText("MailListDropDown", "Daily");

    }

    @Then("^I clear the textbox and send the same text java to the textbox$")
    public void iClearTheTextboxAndSendTheSameTextJavaToTheTextbox() throws Throwable {

        textBoxInput("updateTextBox", "AlertText");

    }

    @Then("^I click on Africa$")
    public void iClickOnAfrica() throws Throwable {

        click("Africa");

    }


    @Then("^I navigate to a page that has highlighted jobs$")
    public void iNavigateToAPageThatHasHighlightedJobs() throws Throwable {
       navigate("HighlightedURL");
        assertUrl("HighlightedURL");
    }

    @Then("^I click on a highlighted job$")
    public void iClickOnAHighlightedJob() throws Throwable {

        click("Highlightedjobs");
        assertTitle("HighlightTitle");
    }

    @Then("^I click on page number to change the view$")
    public void iClickOnPageNumberToChangeTheView() throws Throwable {
        click("pagination");

    }


    @Then("^I wait for the text on the page Top jobs matching your profile$")
    public void iWaitForTheTextOnThePageTopJobsMatchingYourProfile() throws Throwable {
        String s = getTextee("TopjobsTextHomePage");
        Assert.assertEquals(s, "Top jobs matching your profile");
    }

    @Then("^I click on the displayed job$")
    public void iClickOnTheDisplayedJob() throws Throwable {
        click("TopJobHomePage");

    }

    @Then("^I assert the text you might also be interested in these jobs$")
    public void iAssertTheTextYouMightAlsoBeInterestedInTheseJobs() throws Throwable {

        String s = getTextee("InterestJobsThankyou");
        Assert.assertEquals(s, "You might also be interested in these jobs");
    }

    @Then("^I assert the text Top jobs matching your profile$")
    public void iAssertTheTextTopJobsMatchingYourProfile() throws Throwable {

        String s = getTextee("MatchingJobsThankyou");
        Assert.assertEquals(s, "Top jobs matching your profile");
    }

    @Then("^I click on first job of interested jobs$")
    public void iClickOnFirstJobOfInterestedJobs() throws Throwable {
        click("InterestedJobThankyouPage");


    }

    @Then("^I navigate to the next page$")
    public void iNavigateToTheNextPage() throws Throwable {

       String t= getTittle();
        Assert.assertTrue(t.contains("eFinancialCareers jobs:"));
    }

    @Then("^I navigate to the previous page$")
    public void iNavigateToThePreviousPage() throws Throwable {
        driver.navigate().back();
        dynamicPageTitle("JobPageTitle");

    }

    @Then("^I click on first job on top jobs matching profile$")
    public void iClickOnFirstJobOnTopJobsMatchingProfile() throws Throwable {

        click("TopJobThankyouPage");
        Thread.sleep(2000);
        String t= getTittle();
        Assert.assertTrue(t.contains("eFinancialCareers jobs:"));

    }

    @Then("^I click on View all and click on information technology in the child window$")
    public void iClickOnViewAllAndClickOnInformationTechnologyInTheChildWindow() throws Throwable {
        String winHandleBefore = driver.getWindowHandle();

        click("ViewAll");
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        String winHandleAfter = driver.getWindowHandle();
        Thread.sleep(2000);
        click("ITChildWin");
        Thread.sleep(4000);
        assertUrl("ITUrl");

    }

    @Then("^I click on the suggested job from more jobs like this$")
    public void iClickOnTheSuggestedJobFromMoreJobsLikeThis() throws Throwable {

        click("MoreJobsLink");
    }
}
