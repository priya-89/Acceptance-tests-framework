package step_definitions.EFC;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import step_definitions.support.SeleniumBase;

import java.util.concurrent.TimeUnit;


public class CV extends SeleniumBase {

    @Then("^I click on create a CV from your profile link$")
    public void iClickOnCreateACVFromYourProfileLink() throws Throwable {

        click("CreateCVURProfile");

    }

    @Then("^I navigate to generate PDF page$")
    public void iNavigateToGeneratePDFPage() throws Throwable {

        assertUrl("GeneratePDF");
    }

    @Then("^I click on create my CV and make it my primary CV button$")
    public void iClickOnCreateMyCVAndMakeItMyPrimaryCVButton() throws Throwable {


        click("CreateCVMakePrimary");
        assertUrl("AfterPDF");

    }

    @Then("^I click on Upload CV Green button$")
    public void iClickOnUploadCVGreenButton() throws Throwable {

        click("UploadCVGreen");

    }

    @Then("^I send my CV by using the browse button$")
    public void iSendMyCVByUsingTheBrowseButton() throws Throwable {
        //click("BrowseCV");
/*        WebElement file_input = driver.findElement(By.xpath("(//a[contains(text(),'Browse for your CV')])[2]"));*/
        //file_input.sendKeys("C:/Users/naga.priyanka/Desktop/AutoTestCV.docx");

        driver.findElement(By.xpath("(//a[contains(text(),'Browse for your CV')])[2]"));
        driver.switchTo()
                .activeElement()
                .sendKeys(
                        "C:/Users/naga.priyanka/Desktop/AutoTestCV.docx");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //driver.findElement(By.id("convertButton"));

        click("UploadCVPopUp");

    }

    @Then("^I observe the url changes with hash post fix$")
    public void iObserveTheUrlChangesWithHashPostFix() throws Throwable {

        assertUrl("CVChange");
    }


    @Then("^I click on Import CV link$")
    public void iClickOnImportCVLink() throws Throwable {

        driver.findElement(By.xpath("//a[contains(.,'Import a CV')]")).click();
        // run autoIt exe file , pls change the path where u place the uploadResume.ese file
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\naga.priyanka\\Desktop\\AutoIT\\uploadResume.exe");
        //click on browse button
        driver.findElement(By.xpath("(//a[contains(.,'Browse for your CV')])[3]")).click();

        Thread.sleep(9000);


        driver.findElement(By.xpath("(//div[@id='cvUploadButton']/a)[3]")).click();

        Thread.sleep(5000);


    }

    @Then("^I Browse the CV from desktop$")
    public void iBrowseTheCVFromDesktop() throws Throwable {

        }

    @Then("^I click upload CV green button$")
    public void iClickUploadCVGreenButton() throws Throwable {



    }

    @Then("^I click OK green button$")
    public void iClickOKGreenButton() throws Throwable {



    }

    @Then("^I navigate to profile page ending with hash$")
    public void iNavigateToProfilePageEndingWithHash() throws Throwable {


    }


}
