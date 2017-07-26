@link

Feature: EFC-16,17-Event - Jobs - Click on Top Jobs matching profile - Topjobs, Thank you page

  As a Page View tracker
  I want to track the Event - Jobs - Click on More Jobs like this - Topjobs, Thank you page
  So that i can see in real time report

  Scenario:  Click on Top Jobs matching profile - Top jobs

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    Then  I enter job title in Text box
    And   I enter City name in Text box
    Then  I click on Search jobs
    And   I wait for the page load

    Then  I navigate to Search results page
    And   I click on the first job that appear on the page
    And   I assert the page referring the Apply button on the right side
    And   I click on Apply Job that appears Green
    And   I wait for the page load
    Then  I navigate to e-financial careers page that has title as e-financial careers

    And   I click on apply job on the efinancial careers page
    #And   I assert the text you might also be interested in these jobs
    #And   I assert the text Top jobs matching your profile

    Then  I click on first job of interested jobs
    Then  I navigate to the next page
    And   I wait for the page load
    Then  I navigate to the previous page
    And   I click on first job on top jobs matching profile
    And   I wait for the page load


