@mywip
Feature: Talk Module Functionality

  Background:
    Given the user is logged in
  @TCLOUD-856
  Scenario: User can create a new conversation
    Given the user navigate the "talk" Module and click
    When user click "Plus Icon"
    And user enter a conversation "cydeo3" and click  add participant
    Then user add "User" from list
    When user click "Create Conversation"
    Then user created  "cydeo3" conversation and is on this conversation page
  @TCLOUD-865
  Scenario: User can add any selected participant to any conversation
    Given the user navigate the "talk" Module and click
    When user select "cydeo2"
    When user click "participant Icon"
    When user enter "Employee103" into the input
    When user click "Employee103"
    Then user see added participant "Employee103" in the conversation box
  Scenario: Display all conversation list under the Talk module
    Given the user navigate the "talk" Module and click
    When user click "Menu Button"
    Then user see "all conversation"

  Scenario: User can start a call with any participant and leave the call
    Given the user navigate the "talk" Module and click
    When user select "Menu Button"
    When user select "cydeo2"
    When user click "Start Call"
    When user click "Leave Call"



