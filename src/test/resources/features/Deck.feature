@Deck @TCLOUD-890
Feature: Deck Module Functionality

  Background:
    Given the user is logged in
    Given user clicks on "on the Decks" button
    Given user clicks on "the app-deck navigation" button


  @TCLOUD-862
  Scenario Outline: User can create a new board
    When user clicks on "add board" button
    And write a "<new board name>" into the new board input box
    And user clicks on "confirm new board" button
    Then "<new board name>" should be displayed under All boards
    Examples:
      | new board name |
      | test 1         |
      | 2test          |
      | test &/%$      |
      | test4          |

  @TCLOUD-864
  Scenario Outline: User can create a new list of card/task under any board
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
      | test4     | test4         |

  @TCLOUD-871
  Scenario Outline: User can add a new card/task on any list on the current board
    When "<board>" is selected
    And user clicks on add card button next to "<list>" and write a "<card name>"
    And user clicks on confirm add card button next to the "<list>" input box
    Then "<card name>" should be displayed under the selected "<list>"
    Examples:
      | board     | list        | card name   |
      | test 1    | list1       | card1       |
      | test 1    | list 2      | card 2      |
      | 2test     | 3th List    | 3th card    |
      | 2test     | %th _(List) | %th _(card) |
      | test &/%$ | List5       | card5       |
      | test &/%$ | List5       | card5       |
      | test 1    | list1       | card 6      |
      | test 1    | list 2      | CARD7       |
      | 2test     | 3th List    | 8 DRAC      |
      | 2test     | %th _(List) | ?? card     |
      | test4     | test4       | test4       |

  @TCLOUD-872
  Scenario Outline: User can assign any card/task to himself/herself by using the three dots on the related card
    When "<board>" is selected
    And user clicks on three dots button inside "<card name>" under "<list>"
    And user clicks on "assign to me" button
    Then users icon should display inside the "<card name>"
    Examples:
      | board     | list        | card name   |
      | test 1    | list1       | card1       |
      | 2test     | %th _(List) | %th _(card) |
      | test &/%$ | List5       | card5       |
      | test 1    | list 2      | CARD7       |
      | 2test     | 3th List    | 8 DRAC      |
      | test4     | test4       | test4       |

  @TCLOUD-874
  Scenario Outline: User can move any card on the current board to any other list of other board
    When "<board>" is selected
    And user clicks on three dots button inside "<card name>" under "<list>"
    And user clicks on "Move card" button
    And user clicks on "Select a board" button
    And user chooses "<board destination>"
    And user clicks on "Select a list" button
    And user chooses "<list destination>"
    And user clicks on "confirm move card" button
    And "<board destination>" is selected
    Then "<card name>" should be displayed under the selected "<list destination>"
    Examples:
      | board     | list        | card name   | board destination | list destination |
      | test 1    | list1       | card1       | 2test             | 3th List         |
      | test 1    | list 2      | card 2      | test &/%$         | List5            |
      | 2test     | 3th List    | 3th card    | test 1            | list1            |
      | 2test     | %th _(List) | %th _(card) | test &/%$         | List5            |
      | test &/%$ | List5       | card5       | test 1            | list1            |
      | test &/%$ | List5       | card5       | test 1            | list 2           |
      | test 1    | list1       | card 6      | 2test             | 3th List         |

  @Reverse
  Scenario Outline: (Reverse) User can move any card on the current board to any other list of other board
    When "<board>" is selected
    And user clicks on three dots button inside "<card name>" under "<list>"
    And user clicks on "Move card" button
    And user clicks on "Select a board" button
    And user chooses "<board destination>"
    And user clicks on "Select a list" button
    And user chooses "<list destination>"
    And user clicks on "confirm move card" button
    And "<board destination>" is selected
    Then "<card name>" should be displayed under the selected "<list destination>"
    Examples:
      | board     | list     | card name   | board destination | list destination |
      | 2test     | 3th List | card1       | test 1            | list1            |
      | test &/%$ | List5    | card 2      | test 1            | list 2           |
      | test 1    | list1    | 3th card    | 2test             | 3th List         |
      | test &/%$ | List5    | %th _(card) | 2test             | %th _(List)      |
      | test 1    | list1    | card5       | test &/%$         | List5            |
      | test 1    | list 2   | card5       | test &/%$         | List5            |
      | 2test     | 3th List | card 6      | test 1            | list1            |

  @TCLOUD-883
  Scenario Outline:User can assign any tag to any card/task
    When "<board>" is selected
    And user clicks on "<card name>" under "<list>"
    And user clicks on "Assign a tag to this card..." button
    And user chooses a "<tag>" from the tag-list
    Then "<tag>" should display inside the "<card name>" under "<list>"
    Examples:
      | card name   | board     | list     | tag          |
      | card1       | 2test     | 3th List | tagGenerator |
      | card 2      | test &/%$ | List5    | tagGenerator |
      | 3th card    | test 1    | list1    | tagGenerator |
      | %th _(card) | test &/%$ | List5    | tagGenerator |
      | card5       | test 1    | list1    | tagGenerator |
      | card5       | test 1    | list 2   | tagGenerator |
      | card 6      | 2test     | 3th List | tagGenerator |
      | test4       | test4     | test4    | tagGenerator |

    @Delete
    Scenario: Delete all Decks
      When Decks are existing
      Then delete all existing decks
