package step_definitions.EFC;

import cucumber.api.java.en.Then;
import step_definitions.support.SeleniumBase;

public class OpenId extends SeleniumBase {

    SeleniumBase sb = new SeleniumBase();

    @Then("^I login with an open id$")
    public void iLoginWithAnOpenId() throws Throwable {

        sb.click("Yahoo");
        WaitASecond();
    }

    @Then("^I should not Auto login$")
    public void iShouldNotAutoLogin() throws Throwable {

    }

}


