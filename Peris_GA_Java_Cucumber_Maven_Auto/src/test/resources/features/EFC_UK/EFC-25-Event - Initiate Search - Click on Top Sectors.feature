@suite

Feature: EFC-25-Event-Initiate search- Click on Top sectors

  Scenario: click on top sectors

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    And   I click on View all and click on information technology in the child window
    And   I wait for the page load