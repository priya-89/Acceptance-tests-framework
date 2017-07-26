@wip

Feature: Pageview-07-LoginOpenID
  As a Page View tracker
  I want to Login with Open id and no auto login
  so that My page view tag is fired

  Scenario: No Aut  o Login, Login with Open id

    Given I navigate to login page
    When  I wait for the page load
    Then  I login with an open id
    And   I should not Auto login
    Then  I wait for the page load
    #Then  I enter the landing page
