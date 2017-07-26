@suite

Feature: Pageview-01-Top 5 page views

  As a Page View tracker
  I want to Navigate through the available Top few web pages
  so that I ensure the page view tag is fired on the available page URL's

  Scenario: Navigating through the pages where login is not necessary

    Given  I am on the e- Financial Careers landing page
    When   I wait for the page load
    And    I navigate to Job search page
    And    I navigate to login page
    Then   I ensure i am successful in browsing the top search pages without login


  Scenario: Navigating through the pages where login is required

    Given  I navigate to login page
    Then   I sign in with non-open id valid credentials
    And    I navigate to Profile page
    And    I navigate to CV's page
    And    I navigate to search job page
    Then   I ensure i am successful in browsing the top pages with login

