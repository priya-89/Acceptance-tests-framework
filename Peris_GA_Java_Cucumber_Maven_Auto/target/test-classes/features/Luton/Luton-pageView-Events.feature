@luton


Feature: Luton Pageviews and Events

  As a Page View tracker
  I want to Navigate through the Pages and fire events
  so that I ensure the page view tag and all the 4 events are fired successfully

  Scenario:  UA (Rollup) – Pageview

    Given  I am on the Luton landing page with campaign URL
    When   I wait for the page load


  Scenario: UA (Rollup) – Event - Carousel

    Given  I am on the Luton landing page with campaign URL
    Then   I click on the image in the carousel
    And    I wait for the page load

  Scenario: UA (Rollup) – Event – Email Link

    Given  I am on Adult social care page
    Then   I click on download link of Care Act works
    And    I wait for the page load


  Scenario: UA (Rollup) – Event – Filetype Link

    Given  I am on Adult social care page
    Then   I click on Contact link to email the luton care Act
    And    I wait for the page load

  Scenario: UA (Rollup) – Event - External Link

    Given  I am on the Luton landing page with campaign URL
    Then   I click on Gov.uk external link
    And    I wait for the page load
    And    I ensure a tab is opened with Gov.uk site

  Scenario: UA (Rollup) – Event - External Link

    Given  I am on the Luton landing page with campaign URL
    Then   I click on Community centers external link
    And    I wait for the page load
    And    I ensure a tab is opened with Community centers site

  Scenario: UA (Rollup) – Event - External Link

    Given  I am on the Luton landing page with campaign URL
    Then   I click on Youtube external link
    And    I wait for the page load
    And    I ensure a tab is opened with Youtube site

  Scenario: UA (Rollup) – Event - External Link

    Given  I am on the Luton landing page with campaign URL
    Then   I click on Facebook external link
    And    I wait for the page load
    And    I ensure a tab is opened with Facebook site

  Scenario: UA (Rollup) – Event - External Link

    Given  I am on the Luton landing page with campaign URL
    Then   I click on Flicker external link
    And    I wait for the page load
    And    I ensure a tab is opened with Flicker site

  Scenario: UA (Rollup) – Event - External Link

    Given  I am on the Luton landing page with campaign URL
    Then   I click on Twitter external link
    And    I wait for the page load
    And    I ensure a tab is opened with Twitter site

  Scenario: UA (Rollup) – Event - External Link

    Given  I am on the Luton landing page with campaign URL
    Then   I click on Linkedin external link
    And    I wait for the page load
    And    I ensure a tab is opened with Linkedin site

  Scenario: UA (Rollup) – Event - External Link

    Given  I am on the Luton landing page with campaign URL
    Then   I click on Google Translate external link
    And    I wait for the page load
    And    I ensure a tab is opened with Google Translate site

  Scenario: UA (Rollup) – Event - External Link

    Given  I am on the Luton landing page with campaign URL
    Then   I click on Pay Council external link
    And    I wait for the page load
    And    I ensure a tab is opened with Pay Council site

  Scenario: UA (Rollup) – Event - External Link

    Given  I am on the Luton landing page with campaign URL
    Then   I click on School Admissions external link
    And    I wait for the page load
    And    I ensure a tab is opened with School Admissions site

