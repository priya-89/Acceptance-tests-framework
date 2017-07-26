package step_definitions.EFC;

import cucumber.api.java.en.Then;
import step_definitions.support.Report;
import step_definitions.support.SeleniumBase;

public class Searches extends SeleniumBase {

    @Then("^I mouse over on my profile and click on Account Settings$")
    public void iMouseOverOnMyProfileAndClickOnAccountSettings() throws Throwable {
        mouseover("MouseOnAccount", "AccountSettings");
        assertUrl("AccSettings");
    }

    @Then("^I ensure its not searchable currently$")
    public void iEnsureItsNotSearchableCurrently() throws Throwable {

        isRadioChecked("NotSearchable");
        click("NotSearchable");
        click("Submit");
        Report.info("PROFILE NOT SEARCHABLE");

    }

    @Then("^I click on Searchable but anonymous$")
    public void iClickOnSearchableButAnonymous() throws Throwable {
        click("SearchAnonymous");
        Report.info("PROFILE SEARCHABLE BUT ANONYMOUS");
    }

    @Then("^I click on Submit button$")
    public void iClickOnSubmitButton() throws Throwable {
        click("Submit");

    }

    @Then("^I click on Non searchable$")
    public void iClickOnNonSearchable() throws Throwable {
        click("NotSearchable");
        click("Submit");
        Report.info("PROFILE NOT SEARCHABLE");
    }

    @Then("^I click on Searchable$")
    public void iClickOnSearchable() throws Throwable {
        click("Searchable");
        click("Submit");
        Report.info("PROFILE SEARCHABLE");
    }

    @Then("^I click on (\\d+) to navigate to the second page$")
    public void iClickOnToNavigateToTheSecondPage(int arg1) throws Throwable {
        click("SecondPage");

    }

    @Then("^I navigate to the second page$")
    public void iNavigateToTheSecondPage() throws Throwable {
        assertUrl("Secondpageurl");
    }


}
