@suite

Feature: EFC-29-Event - Jobs - Click on More Jobs Like This - Link

  As an Event tracker
  I want to complete form and apply for an internal job
  so that I ensure the tag Event-jobs-Job Application Processed tag is fired succesfully

  Scenario: Complete form and apply for a job

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
    And   I click on the first job that appear on the page
    And   I click on the suggested job from more jobs like this