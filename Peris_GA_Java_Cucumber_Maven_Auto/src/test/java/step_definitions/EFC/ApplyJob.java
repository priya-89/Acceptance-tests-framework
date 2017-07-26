package step_definitions.EFC;

import cucumber.api.java.en.Then;
import step_definitions.support.SeleniumBase;

public class ApplyJob extends SeleniumBase {

    @Then("^I click on the first job that appear on the page$")
    public void iClickOnTheFirstJobThatAppearOnThePage() throws Throwable {
        click("JobOnTopList");
    }

    @Then("^I assert the page referring the Apply button on the right side$")
    public void iAssertThePageReferringTheApplyButtonOnTheRightSide() throws Throwable {
        mouseoverIsElePresent("ClickApplyButton", "ClickApplyButton", "ApplyText");

    }

    @Then("^I click on Apply Job that appears Green$")
    public void iClickOnApplyJobThatAppearsGreen() throws Throwable {
        click("ClickApplyButton");
    }

    @Then("^I navigate to e-financial careers page that has title as e-financial careers$")
    public void iNavigateToEFinancialCareersPageThatHasTitleAsEFinancialCareers() throws Throwable {
        dynamicPageTitle("JobPageTitle");
    }

    @Then("^I click on apply job on the efinancial careers page$")
    public void Iclickonapplyjobontheefinancialcareerspage() throws Throwable {
        click("FinalApply");
    }

    @Then("^I uncheck allow recruiters to view my CV$")
    public void iUncheckAllowRecruitersToViewMyCV() throws Throwable {
        DisableCheckBox("AllowRecruiters");
        Thread.sleep(1000);
    }

    @Then("^I click on create a cover letter link$")
    public void iClickOnCreateACoverLetterLink() throws Throwable {

        click("Coverletter");
        Thread.sleep(3000);
    }

    @Then("^I enter text in the first text box$")
    public void iEnterTextInTheFirstTextBox() throws Throwable {
        textBoxInput("CoverletterBox1","CoverletterBoxvalue1");

    }

    @Then("^I enter name the document$")
    public void iEnterNameTheDocument() throws Throwable {
        textBoxInput("CoverletterBox2","CoverletterBoxvalue2");

    }
    @Then("^I checkbox the Save in my Document library$")
    public void iCheckboxTheSaveInMyDocumentLibrary() throws Throwable {

        click("CoverletterCheckBox");

         }
}
