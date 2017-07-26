@suite

Feature: EFC-30-Event-Click more jobs like this

  As an Event tracker
  I want to click more jobs like this button to expand my search
  so that I ensure the tag  Event-click more jobs like this tag is fired succesfully

  Scenario: Click more jobs like this to expand the search

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
    And   I click on more jobs like this button on the bottom of the page
    Then  I stay on the same page
    And   I wait for the page load