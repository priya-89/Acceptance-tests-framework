@suite

Feature: EFC-42-Event-Jobs-Kept Unsearchable

  As a Page View tracker
  I want to track the Event-Jobs-Kept Unsearchable
  So that i can see in real time report
  To run this check JobOnTopList in OR.properties

  Scenario: Event-Jobs-Kept Unsearchable

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    Then  I mouse over on my profile and click on Account Settings
    And   I ensure its not searchable currently
    And   I am on the e- Financial Careers landing page
    Then  I enter job title in Text box
    And   I enter City name in Text box
    Then  I click on Search jobs
    And   I wait for the page load

    Then  I navigate to Search results page
    And   I click on the first job that appear on the page
    And   I assert the page referring the Apply button on the right side
    And   I click on Apply Job that appears Green
    And   I wait for the page load

    Then  I navigate to e-financial careers page that has title as e-financial careers
    And   I uncheck allow recruiters to view my CV
    And   I wait for the page load

    And   I click on apply job on the efinancial careers page
    And   I wait for the page load


    Then  I mouse over on my profile and click on Account Settings
    Then  I click on Searchable
    And   I click on Submit button
    Then  I wait for the page load
