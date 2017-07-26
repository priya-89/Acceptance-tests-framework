@suite

Feature: Pageview-06-AutoLogin
  As a Page View tracker
  I want to Auto login
  so that My page view Auto login tag fires on any the pages

  Scenario: Auto login

  Given I navigate to login page
  When  I wait for the page load
  Then  I sign in with valid credentials and enable the "Keep me signed in" checkbox
  And   I remember the password in my Account
  And   I click on sign in button
  Then  I wait for the page load
  And   I enter the landing page
  Then  I open a new TAB and switch to the tab in the same session
  Then  I fire a URL for a post login page
  Then  I should expect an auto logged in page

