@Deck
Feature: Deck Module Functionality

  Background:
    Given the user is logged in

    Scenario: User can create a new board
      When user clicks on the Decks icon
      And user clicks on the app-deck navigation button
      And user clicks on add board and write a new board name
      Then New created board should be displayed under All boards
