@Deck

Feature: Deck Module Functionality

  Background:
    Given the user is logged in
    Given user clicks on the Decks icon

  Scenario Outline: User can create a new board
    When user clicks on the app-deck navigation button
    And user clicks on add board and write a "<new board name>"
    And user clicks on confirm button
    Then "<new board name>" should be displayed under All boards
    Examples:
  | new board name |
  | test 1         |
  | 2test          |
  | test &/%$      |

  Scenario Outline: User can create a new list of card/task under any board
    When user clicks on the app-deck navigation button
    When "<board>" is selected
    And user clicks on add list button and write a "<new list name>"
    And user clicks on confirm add list button
    Then "<new list name>" should be displayed on the selected "<board>"
    Examples:
      | board     |new list name|
      | test 1    |list1|
      | test 1    |list 2|
      | 2test     |3th List|
      | 2test     |%th _(List)|
      | test &/%$ |List5|
      | test &/%$ |List5|

