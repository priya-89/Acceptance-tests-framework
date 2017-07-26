@wip-autoIT

  Feature: EFC-43-Event-Create a CV from your profile

      Scenario: EFC-44 Upload a CV

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    Then  I navigate to Profile page
    Then  I navigate to CV's page
    And   I click on Upload CV Green button
    And   I send my CV by using the browse button
    And   I observe the url changes with hash post fix