Feature: Serkan type something here please

  Background:
    Given the user is logged in

  Scenario: User can create a new conversation
    Given the user navigate the Talk Module and click
    When user click the Plus icon
    And user enter a conversation "cydeo3" and click  add participant
    Then user add user from list and click Create conversation Button
    Then user created  "cydeo3" conversation and is on this conversation page

  Scenario: User can add any selected participant to any conversation
    Given the user navigate the Talk Module and click
    When user select any conversation
    When user click participant Icon
    When user enter "Employee100" into the input
    When user click the "Employee100" under the  Add User Text
    Then user see added participant "Employee100" in the conversation box

