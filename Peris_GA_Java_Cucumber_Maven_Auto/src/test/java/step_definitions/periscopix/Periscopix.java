package step_definitions.periscopix;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import step_definitions.support.Hooks;
import step_definitions.support.SeleniumBase;


public class Periscopix extends SeleniumBase {


    SeleniumBase sb = new SeleniumBase();

    Hooks ObjectH = new Hooks();

    @Given("^I open periscopix website$")
    public void iOpenPeriscopixWebsite() throws Throwable {
        sb.navigate("perisLandingURL");
        Assert.assertEquals(driver.getTitle(), "Periscopix, A Merkle Company | Pay Per Click Management, Display & Google Analytics Services");
    }

    @When("^I wait for the page load$")
    public void iWaitForThePageLoad() throws Throwable {
        Thread.sleep(4000);

    }

    @When("^I click on About link$")
    public void iClickOnAboutLink() throws Throwable {

        sb.clickByXpath("About");

    }

    @When("^I click on The team$")
    public void iClickOnTheTeam() throws Throwable {

        sb.clickByXpath("TheTeam");
        sb.assertUrl("TeamURL");
    }

    @When("^I click on Loves Knitting$")
    public void iClickOnLovesKnitting() throws Throwable {

        sb.clickByXpath("knitting");
    }

    @Then("^The output is Lisa Waterfall$")
    public void theOutputIsLisaWaterfall() throws Throwable {

        sb.assertElePresentXpath("LisaPath");
    }

}
