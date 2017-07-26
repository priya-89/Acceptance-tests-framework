@MultipleRuns

Feature: EFC-37,54,57,58 Play with Job alerts

  Scenario: Browse a saved job alert

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    Then  I mouse over on my profile and click on Job Alerts
    And   I navigate to saved search page
    And   I wait for the page load

    And   I click on Edit button for Saved Alert Java
    Then  I wait for the page load
    Then  I select Never from the drop down Mailing list
    Then  I wait for the page load
    Then  I click on Save button
    And   I wait for the page load
    And   I click on Edit button for Saved Alert Java
    Then  I wait for the page load
    And   I select Daily from the drop down Mailing list
    Then  I wait for the page load
    Then  I click on Save button
    Then  I wait for the page load

    And   I click on top save job alert Java
    And   I wait for the page load

    Then  I navigate directly to Search results page
    Then  I wait for the page load
    And   I click on update Job Alert
    And   I wait for the page load
    And   I clear the textbox and send the same text java to the textbox
    Then  I wait for the page load
    And   I click on Update job Alert button on the layer window
    Then  I wait for the page load

    And   I click on Africa
    And   I wait for the page load
