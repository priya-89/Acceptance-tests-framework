@suite

Feature: Event-33-Amending Search-Editing A Saved Search

  As an Event tracker
  I want to Create a job Alert
  so that I ensure the tag  Event-Amending Search-Editing A Saved Search is fired succesfully

  Scenario: Update a job alert

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
    And   I click on Create Job Alert Button
    And   I enter Name of the job Alert in the drop box
    Then  I click on Create Job Alert
    And   I wait for the page load
    Then  I click on update Job Alert
    And   I click on Update job Alert button on the layer window
    And   I wait for the page load