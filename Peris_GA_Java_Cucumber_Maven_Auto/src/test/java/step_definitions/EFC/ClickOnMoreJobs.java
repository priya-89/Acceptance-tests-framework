package step_definitions.EFC;

import cucumber.api.java.en.Then;
import step_definitions.support.SeleniumBase;


public class ClickOnMoreJobs extends SeleniumBase {

    @Then("^I click on more jobs like this button on the bottom of the page$")
    public void iClickOnMoreJobsLikeThisButtonOnTheBottomOfThePage() throws Throwable {

        click("SeeMoreJobs");
        WaitASecond();
    }

    @Then("^I stay on the same page$")
    public void iStayOnTheSamePage() throws Throwable {
        dynamicPageTitle("JobPageTitle");

    }
}
