package step_definitions.EFC;

import cucumber.api.java.en.Then;
import step_definitions.support.SeleniumBase;

public class EditDetails extends SeleniumBase{

    @Then("^I click on edit experience$")
    public void iClickOnEditExperience() throws Throwable {
        click("EditExperience");

    }

    @Then("^I enable the checkbox of I am a student$")
    public void iEnableTheCheckboxOfIAmAStudent() throws Throwable {
        EnablecheckBox("CheckTheStudent");

    }

    @Then("^I click on Save button of Experience$")
    public void iClickOnSaveButtonOfExperience() throws Throwable {
        click("SaveExperience");
        Thread.sleep(1000);

    }

    @Then("^I disable the checkbox of I am a student$")
    public void iDisableTheCheckboxOfIAmAStudent() throws Throwable {

        click("EditExperience");
        DisableCheckBox("CheckTheStudent");
        click("SaveExperience");
    }

    @Then("^I click on the Relevance dropdown$")
    public void iClickOnTheRelevanceDropdown() throws Throwable {

        SelectTextByVisibleText("RelevanceDropDown","Newest job");


    }

    @Then("^I select the Newest job from the dropdown$")
    public void iSelectTheNewestJobFromTheDropdown() throws Throwable {

    }

}
