@test

Feature: Open companies website

  Scenario: Launch browser in sauce lab

    Given I open periscopix website
    When  I wait for the page load
    And   I click on About link
    And   I click on The team
    And   I click on Loves Knitting
    Then  The output is Lisa Waterfall



    