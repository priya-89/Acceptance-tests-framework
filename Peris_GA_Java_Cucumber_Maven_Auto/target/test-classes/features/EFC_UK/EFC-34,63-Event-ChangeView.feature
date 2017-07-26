@suite

Feature: EFC-34,63-Change View- Sort By Most Relevant Jobs Dropdown

  As an Event tracker
  I want to Create a job Alert
  so that I ensure the tag  Event-Change View-Sort By Most Relevant Jobs Dropdown is fired succesfully

  Scenario: Refine the results by selecting an item in the drop down from search page

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    And   I navigate to Job search page
    Then  I click on the Relevance dropdown
    And   I wait for the page load
    And   I select the Newest job from the dropdown
    And  I wait for the page load

  Scenario: Click on next page

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page
    And   I navigate to Job search page
    Then  I click on 2 to navigate to the second page
    And   I wait for the page load
    And   I navigate to the second page
    And   I wait for the page load



