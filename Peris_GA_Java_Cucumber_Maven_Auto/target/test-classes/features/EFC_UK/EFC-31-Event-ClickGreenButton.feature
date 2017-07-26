@suite

Feature: Event-31-Initiate Search - Click on Green Search Button

  As an Event tracker
  I want to click on green search button on top of any page
  so that I ensure the tag Event - Initiate Search - Click on Green Search Button is successful

  Scenario: Click on Search jobs

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    Then  I enter job title in Text box
    And   I enter City name in Text box
    Then  I click on Search jobs
    And   I wait for the page load