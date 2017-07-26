package step_definitions.LBC;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import step_definitions.support.SeleniumBase;

import java.util.ArrayList;


public class LutonPageViewEvents extends SeleniumBase {

    @Given("^I am on the Luton landing page with campaign URL$")
    public void iAmOnTheLutonLandingPageWithCampaignURL() throws Throwable {
        navigate("LutonLandingURLCamp");
        assertUrl("LutonLandingURLCamp");

    }

    @Then("^I click on the image in the carousel$")
    public void iClickOnTheImageInTheCarousel() throws Throwable {
        click("MyAccount");
        assertUrl("MyAccountAssertURL");

    }

    @Then("^I click on Gov\\.uk external link$")
    public void iClickOnGovUkExternalLink() throws Throwable {
        String oldTab = driver.getWindowHandle();
        click("GovUK");

        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));

    }

    @Then("^I ensure a tab is opened with Gov\\.uk site$")
    public void iEnsureATabIsOpenedWithGovUkSite() throws Throwable {
        assertUrl("GovURL");
    }

    @Given("^I am on Adult social care page$")
    public void iAmOnAdultSocialCarePage() throws Throwable {
        navigate("AdultCareCamp");
        assertUrl("AdultCareCamp");

    }

    @Then("^I click on download link of Care Act works$")
    public void iClickOnDownloadLinkOfCareActWorks() throws Throwable {
        click("ActWorkPDF");
        assertUrl("ActWorkPDFAssert");
    }

    @Then("^I click on Contact link to email the luton care Act$")
    public void iClickOnContactLinkToEmailTheLutonCareAct() throws Throwable {
        click("ContactCareAct");

    }

    @Then("^I click on Community centers external link$")
    public void iClickOnCommunityCentersExternalLink() throws Throwable {
        click("CommunityCenters");


    }

    @Then("^I ensure a tab is opened with Community centers site$")
    public void iEnsureATabIsOpenedWithCommunityCentersSite() throws Throwable {
        assertUrl("communityCentersAssert");

    }

    @Then("^I click on Youtube external link$")
    public void iClickOnYoutubeExternalLink() throws Throwable {
        click("youtube");

    }

    @Then("^I ensure a tab is opened with Youtube site$")
    public void iEnsureATabIsOpenedWithYoutubeSite() throws Throwable {
        assertUrl("yt");

    }

    @Then("^I click on Facebook external link$")
    public void iClickOnFacebookExternalLink() throws Throwable {
        click("facebook");

    }

    @Then("^I ensure a tab is opened with Facebook site$")
    public void iEnsureATabIsOpenedWithFacebookSite() throws Throwable {

        assertUrl("fb");
    }

    @Then("^I click on Flicker external link$")
    public void iClickOnFlickerExternalLink() throws Throwable {

        click("flicker");
    }

    @Then("^I ensure a tab is opened with Flicker site$")
    public void iEnsureATabIsOpenedWithFlickerSite() throws Throwable {

        assertUrl("flick");
    }

    @Then("^I click on Twitter external link$")
    public void iClickOnTwitterExternalLink() throws Throwable {

        click("twitter");
    }

    @Then("^I ensure a tab is opened with Twitter site$")
    public void iEnsureATabIsOpenedWithTwitterSite() throws Throwable {
        assertUrl("twit");

    }

    @Then("^I click on Linkedin external link$")
    public void iClickOnLinkedinExternalLink() throws Throwable {
        click("linkedin");

    }

    @Then("^I ensure a tab is opened with Linkedin site$")
    public void iEnsureATabIsOpenedWithLinkedinSite() throws Throwable {
        assertUrl("linkin");

    }

    @Then("^I click on Google Translate external link$")
    public void iClickOnGoogleTranslateExternalLink() throws Throwable {

        String oldTab = driver.getWindowHandle();
        click("GoogleTranslate");

        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));

    }

    @Then("^I ensure a tab is opened with Google Translate site$")
    public void iEnsureATabIsOpenedWithGoogleTranslateSite() throws Throwable {
        assertUrl("GoogleTrans");

    }

    @Then("^I click on Pay Council external link$")
    public void iClickOnPayCouncilExternalLink() throws Throwable {
        click("paycousillink");
    }

    @Then("^I ensure a tab is opened with Pay Council site$")
    public void iEnsureATabIsOpenedWithPayCouncilSite() throws Throwable {
        assertUrl("paycounsil");
    }

    @Then("^I click on School Admissions external link$")
    public void iClickOnSchoolAdmissionsExternalLink() throws Throwable {
        click("schoolAdmissions");
    }

    @Then("^I ensure a tab is opened with School Admissions site$")
    public void iEnsureATabIsOpenedWithSchoolAdmissionsSite() throws Throwable {

        assertUrl("schoolAdmissionsurl");
    }
}
