@link

    Feature: EFC-39-Event-Jobs-Cover letter created

    As a Page View tracker
    I want to track the Event-Jobs-Cover letter created
    So that i can see in real time report

    Scenario: Event-Jobs-Cover letter created

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
      And   I wait for the page load

      And   I click on create a cover letter link
      And   I enter text in the first text box
      And   I checkbox the Save in my Document library
      And   I enter name the document

      And   I click on apply job on the efinancial careers page
      And   I wait for the page load