package step_definitions.EFC;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import step_definitions.support.SeleniumBase;


public class TopPageViews extends SeleniumBase {

    SeleniumBase sb = new SeleniumBase();

    @Given("^I am on the e- Financial Careers landing page$")
    public void iAmOnTheEFinancialCareersLandingPage() throws Throwable {
        sb.navigate("EFCLandingURL");
        sb.assertUrl("EFCLandingURL");

    }


    @When("^I navigate to Job search page$")
    public void iNavigateToJobSearchPage() throws Throwable {
        sb.navigate("EFCSearch");
        sb.assertUrl("EFCSearch");

    }

    @When("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        sb.navigate("EFCLogin");
        sb.assertUrl("EFCLogin");

    }

    @Then("^I ensure i am successful in browsing the top search pages without login$")
    public void iEnsureIAmSuccessfulInBrowsingTheTopSearchPagesWithoutLogin() throws Throwable {

        WaitASecond();

    }

    @Then("^I sign in with non-open id valid credentials$")
    public void iSignInWithValidCredentials() throws Throwable {
        sb.textBoxInput("LoginEmail", "email");
        sb.textBoxInput("LoginPassword", "pass");
        sb.click("submitform");
        WaitASecond();
        //assertion
        sb.assertUrl("EFCLandingURL");
        driver.findElement(By.id("continueCountrySelection")).click();
        Thread.sleep(15000);
        sb.acceptAlertIfAvailable(3000);



    }

    @Then("^I navigate to Profile page$")
    public void iNavigateToProfilePage() throws Throwable {

        sb.mouseover("MouseOnAccount", "MouseToProfile");
        WaitASecond();
        sb.assertUrl("EFCProfile");

    }

    @Then("^I navigate to CV's page$")
    public void iNavigateToCVSPage() throws Throwable {
        sb.click("DocLibrary");
        WaitASecond();
        sb.assertUrl("EFCDocLibrary");

    }

    @Then("^I navigate to search job page$")
    public void iNavigateToSearchJobPage() throws Throwable {

        //URL not working. SO to be checked in GA.

    }

    @Then("^I ensure i am successful in browsing the top pages with login$")
    public void iEnsureIAmSuccessfulInBrowsingTheTopPagesWithLogin() throws Throwable {

        WaitASecond();

    }


}



