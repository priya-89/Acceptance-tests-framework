@searches

Feature: EFC-49,50,51,56 Make Searchable but anonymous

  Scenario: From not searchable to Searchable but anonymous

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    Then  I mouse over on my profile and click on Account Settings
    And   I ensure its not searchable currently

    Then  I click on Searchable but anonymous
    And   I click on Submit button
    Then  I wait for the page load

    Then  I click on Non searchable
    And   I click on Submit button
    Then  I wait for the page load

    Then  I click on Searchable
    And   I click on Submit button
    Then  I wait for the page load

    Then  I click on Non searchable
    And   I click on Submit button
    Then  I wait for the page load

  Scenario: Refine your search

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    And   I navigate to Job search page
    And   I click on Africa
    And   I wait for the page load