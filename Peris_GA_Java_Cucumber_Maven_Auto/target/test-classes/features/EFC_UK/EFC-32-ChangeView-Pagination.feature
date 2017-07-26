@suite

Feature: EFC-32-Event-ChangeView-Pagination

  As a Page View tracker
  I want to track the Event-Changeview Pagination
  So that i can see in real time report

  Scenario: Event-Changeview-Pagination

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
    And   I click on page number to change the view
    And   I wait for the page load