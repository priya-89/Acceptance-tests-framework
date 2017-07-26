@suite

Feature: EFC-40-Event-Job Shared on Social Network

  As an Event tracker
  I want to share a job
  so that I ensure the tag  Event-Job Shared on Social Network tag is fired succesfully

  Scenario: Share any job in Social networking sites

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    Then  I enter job title in Text box
    And   I enter City name in Text box
    Then  I click on Search jobs
    Then  I navigate to Search results page
    And   I click on the first job that appear on the page
    Then  I navigate to e-financial careers page that has title as e-financial careers
    And   I click on Share button and select facebook and childwindow appears

