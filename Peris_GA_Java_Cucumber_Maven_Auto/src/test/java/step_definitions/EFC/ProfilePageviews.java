package step_definitions.EFC;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import step_definitions.support.SeleniumBase;


public class ProfilePageviews extends SeleniumBase {

    @Then("^I edit About me$")
    public void iEditAboutMe() throws Throwable {

        click("AboutEdit");
    }

    @Then("^I Save About me$")
    public void iSaveAboutMe() throws Throwable {

        click("AboutSave");
    }

    @Then("^I Edit What i am looking for$")
    public void iEditWhatIAmLookingFor() throws Throwable {

        click("LookingXpath");
    }

    @Then("^I save What i am looking for$")
    public void iSaveWhatIAmLookingFor() throws Throwable {
        click("LookingSave");

    }

    @Then("^I Edit Experience$")
    public void iEditExperience() throws Throwable {
        click("Experience");

    }

    @Then("^I click on add another experience$")
    public void iClickOnAddAnotherExperience() throws Throwable {

        click("AddExperience");
    }

    @When("^I save the experience$")
    public void iSaveTheExperience() throws Throwable {

        click("SaveXperience");
    }

    @When("^I edit the qualification$")
    public void iEditTheQualification() throws Throwable {

        click("qualification");
        
    }

    @When("^I save the qualification$")
    public void iSaveTheQualification() throws Throwable {
        
       click("saveQualification");
    }


}
