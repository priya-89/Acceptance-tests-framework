@suite

Feature: EFC-38-Profile-IsGraduate

  As an Event tracker
  I want to Create a job Alert
  so that I ensure the tag  Event-Profile-Is Graduate A Saved Search is fired succesfully

  Scenario: Profile - Is Graduate

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    And   I navigate to Profile page
    And   I click on edit experience
    Then  I enable the checkbox of I am a student
    And   I click on Save button of Experience

    And  I click on edit experience
    Then I disable the checkbox of I am a student
    And  I click on Save button of Experience


