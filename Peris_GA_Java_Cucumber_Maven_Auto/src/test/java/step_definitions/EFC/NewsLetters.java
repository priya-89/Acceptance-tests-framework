package step_definitions.EFC;

import cucumber.api.java.en.Then;
import step_definitions.support.Report;
import step_definitions.support.SeleniumBase;

public class NewsLetters extends SeleniumBase {

    @Then("^I click on News letter to expand$")
    public void iClickOnNewsLetterToExpand() throws Throwable {

        click("ExpandNewsLetters");
        Report.info("News letters expanded");

    }

    @Then("^I Enable to check box to unsubscribe all newsletters$")
    public void iEnableToCheckBoxToUnsubscribeAllNewsletters() throws Throwable {
        Thread.sleep(1000);
        EnablecheckBox("UnsubscribeAll");
        Thread.sleep(1000);

    }


    @Then("^I click on USA news letter check box$")
    public void iClickOnUSANewsLetterCheckBox() throws Throwable {
        EnablecheckBox("USACheckBox");
        Thread.sleep(1000);

    }

    @Then("^I click on subscribe button$")
    public void iClickOnSubscribeButton() throws Throwable {

        click("SUBorUNSUBorUPDATEButton");
        Thread.sleep(1000);

    }

    @Then("^I click on USA news letter to uncheck the checkbox$")
    public void iClickOnUSANewsLetterToUncheckTheCheckbox() throws Throwable {
        DisableCheckBox("USACheckBox");
        Thread.sleep(1000);

    }

    @Then("^I click on unsubscribe button$")
    public void iClickOnUnsubscribeButton() throws Throwable {

        click("SUBorUNSUBorUPDATEButton");
        Thread.sleep(1000);

    }
}
