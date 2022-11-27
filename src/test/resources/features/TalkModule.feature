@TCLOUD-876 @Regression
Feature: Talk Module Functionality

  Background:
    Given the user is logged in

  @TCLOUD-856 @smoke
  Scenario Outline: User can create a new conversation
    Given the user navigate the "talk" Module and click
    When user click "Plus Icon"
    And user enter  "<conversation>" and click  add participant
    When user click "Create Conversation"
    Then user created  "<conversation>" conversation and is on this conversation page
    Examples:
      | conversation |
      | deneme3      |
      | deneme4      |

  @TCLOUD-865 @regression
  Scenario Outline: User can add any selected participant to any conversation
    Given the user navigate the "talk" Module and click
    When user select "<conversation>" from conversation list
    When user click "participant Icon"
    When user enter "<participant>" into the input
    When user select "<participant>"  from participant list
    Then user see added participant "<participant>" in the conversation box
    Examples:
      | conversation | participant |
      | deneme4       | Employee104 |

  @TCLOUD-868
  Scenario: Display all conversation list under the Talk module
    Given the user navigate the "talk" Module and click
    When user click "Menu Button"
    Then user see "all conversation"

  @TCLOUD-870 @mywip
  Scenario Outline: User can start a call with any participant and leave the call
    Given the user navigate the "talk" Module and click
    When user select "Menu Button"
    When user select "<conversation>" from conversation list
    When user click "Start Call" and click accept
    When user click "Leave Call"
    Examples:
      | conversation |
      | cydeo2       |




@TCLOUD-875
  Scenario Outline: User can promote any participant to moderator
    Given the user navigate the "talk" Module and click
    When user select "<conversation>" from conversation list
    When user click "participant Icon"
    Then user click "<participant>" participant menu button
    Then user click "Promote to Moderator Button"

    Examples:
      | conversation | participant |
      | deneme4       | Employee104 |

  @TCLOUD-873
  Scenario Outline: User can delete a conversation
    Given the user navigate the "talk" Module and click
    When User click the "<conversation>" menu botton
    When user click "Delete Button"
    When user click "Yes Button"
    Then "<conversation>" is removed from the list

    Examples:
      | conversation |
      | deneme3      |
      | deneme4      |

