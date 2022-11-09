@Deck
Feature: Deck Module Functionality

  Background:
    Given the user is logged in

  Scenario Outline: User can create a new board
    When user clicks on the Decks icon
    And user clicks on the app-deck navigation button
    And user clicks on add board and write a "<new board name>"
    And user clicks on confirm button
    Then "<new board name>" should be displayed under All boards
    Examples:
      | new board name |
      | test 1         |
      | 2test          |
      | test &/%$      |

