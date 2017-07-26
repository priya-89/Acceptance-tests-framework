package step_definitions.EFC;

import cucumber.api.java.en.Then;
import step_definitions.support.SeleniumBase;

/**
 * Created by naga.priyanka on 07/08/2015.
 */
public class ShareJob extends SeleniumBase{

    @Then("^I click on Share button and select facebook and childwindow appears$")
    public void iClickOnShareButtonAndSelectFacebookAndChildwindowAppears() throws Throwable {
        click("share");
        click("clickGoogleplus");
        Thread.sleep(2000);
    }

}
