@wio-autoIT

Feature: EFC-46-Event-Profile-CV imported

  Scenario: Import CV

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    Then  I navigate to Profile page
    And   I click on Import CV link
    And   I Browse the CV from desktop
    And   I click upload CV green button
    And   I wait for the page load
    And   I click OK green button

    Then  I navigate to profile page ending with hash




