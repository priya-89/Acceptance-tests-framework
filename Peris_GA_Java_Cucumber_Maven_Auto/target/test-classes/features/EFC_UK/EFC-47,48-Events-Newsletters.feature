@suite

Feature: EFC-47,48- Events-Newsletters

  Scenario: Subscribe or Un-subscribe from Newsletters

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    #Then  I navigate to Profile page

    Then  I mouse over on my profile and click on Account Settings
    Then  I click on News letter to expand
    And   I Enable to check box to unsubscribe all newsletters
    And   I click on unsubscribe button
    When  I wait for the page load

    Then  I click on USA news letter check box
    And   I click on subscribe button
    When  I wait for the page load

    Then  I click on USA news letter to uncheck the checkbox
    And   I click on unsubscribe button
    When  I wait for the page load

