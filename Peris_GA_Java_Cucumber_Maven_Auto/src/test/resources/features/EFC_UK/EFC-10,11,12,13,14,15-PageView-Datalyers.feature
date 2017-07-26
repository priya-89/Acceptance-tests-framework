@suite

Feature: EFC 10,11,12,13,14,15 pageviews

  As a Page View tracker
  I want to track the pageviews on the profile page
  Which needs data layer pushes

  Scenario: Pageviews on profile page

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    And   I navigate to Profile page
    Then  I edit About me
    And   I Save About me
    When  I wait for the page load
    Then  I Edit What i am looking for
    And   I save What i am looking for
    When  I wait for the page load
    Then  I Edit Experience
    And   I click on add another experience
    When  I wait for the page load
    And   I save the experience
    When  I wait for the page load
    And   I edit the qualification
    And   I save the qualification
    And   I wait for the page load

