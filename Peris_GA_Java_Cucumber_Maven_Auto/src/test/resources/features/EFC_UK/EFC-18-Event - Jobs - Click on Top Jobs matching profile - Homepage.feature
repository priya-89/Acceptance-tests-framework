@suite

Feature: EFC-18-Event - Jobs - Click on Top Jobs matching profile - Homepage

  As a Page View tracker
  I want to track the Event - Jobs - Click on More Jobs like this - Homepage
  So that i can see in real time report

  Scenario:  Click on Top Jobs matching profile - Homepage

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page

    And   I wait for the text on the page Top jobs matching your profile
    And   I click on the displayed job
    Then  I navigate to e-financial careers page that has title as e-financial careers
    And   I wait for the page load


