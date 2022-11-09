
Feature: Dashboard Functionality

  Background: As a user I should be able to modify Dashboard page
    Given the user is logged in


  Scenario: User can see all modules and Username after login (1)
    When User enters a valid username
    And User enters valid password and clicks the Login button
    Then User successfully login on the dashboard page and see all modules

  Scenario: User can click on Customize button and see the status widgets (2.1)
    When User clicks on Customize button
    And  User can see the status widgets
    Then User can select any of status widges

  Scenario: User can click on Customize button and see the background images (2.2)
    When User clicks on Customize button
    And User can see the background images
    Then User can select any of background images

  Scenario: User can click on Set Status button and see the Online status options (3)
    When User can click on Set Status button
    And User can see the Online status options
    Then User can select any of status options

  Scenario: User can click on Set Status button and select any of them (3.1)
    When User can click on Set Status button
    And User can see the Status messages
    Then User can select any of status messages

  Scenario: User can click on Set Status button and Set/Clear the status message(3.2)
    When User can click on Set Status button
    And User can select any of Status messages and clicks on the Set status message button
    Then User clicks the Clear status message button

  Scenario: User can see selections on dashboard (3.3)
    When User is done with selections
    Then User can see selections on dashboard

  Scenario: User can write his/her own status in input box (4)
    When User can see the What's your status ? input box and click on it
    And User can write any status in input box manually
    Then User can click the Set status message button and see the status on dashboard
    # trying to commit

