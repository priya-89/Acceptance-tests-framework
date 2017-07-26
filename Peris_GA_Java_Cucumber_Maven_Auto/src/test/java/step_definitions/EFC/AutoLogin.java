package step_definitions.EFC;

import cucumber.api.java.en.Then;
import step_definitions.support.SeleniumBase;

public class AutoLogin extends SeleniumBase {

    SeleniumBase sb = new SeleniumBase();

    @Then("^I sign in with valid credentials and enable the \"(.*?)\" checkbox$")
    public void iSignInWithValidCredentialsAndEnableTheCheckbox(String arg1) throws Throwable {

        sb.textBoxInput("LoginEmail", "email");
        sb.textBoxInput("LoginPassword", "pass");
        sb.EnablecheckBox("KeepMeSignIn");
        WaitASecond();
    }


    @Then("^I remember the password in my Account$")
    public void iRememberThePasswordInMyAccount() throws Throwable {

        //TODO There is no prompt for remember password
    }

    @Then("^I click on sign in button$")
    public void iClickOnSignInButton() throws Throwable {
        sb.click("submitform");
        WaitASecond();

    }

    @Then("^I enter the landing page$")
    public void iEnterTheLandingPage() throws Throwable {

        sb.assertUrl("EFCLandingURL");

    }


    @Then("^I open a new TAB and switch to the tab in the same session$")
    public void iOpenANewTABInTheSameSession() throws Throwable {

        sb.openNewTab();
        //sb.switchToTab();
        WaitASecond();
    }

    @Then("^I fire a URL for a post login page$")
    public void iFireAURLForAPostLoginPage() throws Throwable {

        sb.navigate("AccSettings");
        WaitASecond();
        sb.assertUrl("AccSettings");
        WaitASecond();
    }

    @Then("^I should expect an auto logged in page$")
    public void iShouldExpectAAutoLoggedInPage() throws Throwable {

        sb.mouseoverIsElePresent("MouseOnAccount", "MouseToProfile", "Profile");
        WaitASecond();
    }

}
