@suite

Feature: PageView-8 No Auto Login-Non-Open ID
  As a Page View tracker
  I want to Login and no auto login
  so that My page view tag is fired

  Scenario: Login and No open ID

    Given I navigate to login page
    When  I wait for the page load
    Then  I sign in with non-open id valid credentials
    Then  I wait for the page load
    Then  I enter the landing page