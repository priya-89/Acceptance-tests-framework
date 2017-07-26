@suite

Feature: EFC-43-Event-Create a CV from your profile

  Scenario: EFC-43 Create a CV from your profile

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    Then  I navigate to Profile page
    Then  I navigate to CV's page
    And   I click on create a CV from your profile link
    Then  I navigate to generate PDF page
    And   I click on create my CV and make it my primary CV button






