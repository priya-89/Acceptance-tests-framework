@manual_test_case

Feature: EFC-62-Event-Click on highlighted jobs

  As a Page View tracker
  I want to track the Event-Click on highlighted jobs
  So that i can see in real time report

  Scenario: Event-click on highlighted jobs

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    And   I navigate to a page that has highlighted jobs
    And   I click on a highlighted job
    And   I wait for the page load
