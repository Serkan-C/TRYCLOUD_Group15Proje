@Deck

Feature: Deck Module Functionality

  Background:
    Given the user is logged in
    Given user clicks on "on the Decks" button

  Scenario Outline: User can create a new board
    When user clicks on "the app-deck navigation" button
    And user clicks on "add board" button
    And write a "<new board name>" into the new board input box
    And user clicks on "confirm new board" button
    Then "<new board name>" should be displayed under All boards
    Examples:
      | new board name |
      | test 1         |
      | 2test          |
      | test &/%$      |

  Scenario Outline: User can create a new list of card/task under any board
    When user clicks on "the app-deck navigation" button
    When "<board>" is selected
    And user clicks on "add list" button
    And write a "<new list name>" into the new list input box
    And user clicks on "confirm add list" button
    Then "<new list name>" should be displayed on the selected "<board>"
    Examples:
      | board     | new list name |
      | test 1    | list1         |
      | test 1    | list 2        |
      | 2test     | 3th List      |
      | 2test     | %th _(List)   |
      | test &/%$ | List5         |
      | test &/%$ | List5         |

  Scenario Outline: User can add a new card/task on any list on the current board
    When user clicks on "the app-deck navigation" button
    When "<board>" is selected
    And user clicks on add card button next to "<list name>"
    And write a "<card name>" into the new board input box
    And user clicks on "confirm add card" button
    Then "<card name>" should be displayed on the selected "<list>"
      | board     | list name   | new card name |
      | test 1    | list1       | list1         |
      | test 1    | list 2      | list 2        |
      | 2test     | 3th List    | 3th List      |
      | 2test     | %th _(List) | %th _(List)   |
      | test &/%$ | List5       | List5         |
      | test &/%$ | List5       | List5         |