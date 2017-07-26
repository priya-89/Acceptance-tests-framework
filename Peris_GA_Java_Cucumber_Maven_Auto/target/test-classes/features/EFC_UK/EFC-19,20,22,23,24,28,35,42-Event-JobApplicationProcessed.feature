@link

Feature: EFC-19,20,22,23,24,28,35,42-Event-jobs-Job Application Processed and RTB-U Variables for company,id,city,country

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
    And   I assert the page referring the Apply button on the right side
    And   I click on Apply Job that appears Green
    And   I wait for the page load

    Then  I navigate to e-financial careers page that has title as e-financial careers
    And   I uncheck allow recruiters to view my CV
    And   I wait for the page load

    And   I click on apply job on the efinancial careers page
    And   I wait for the page load