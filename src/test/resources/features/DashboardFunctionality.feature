@TCLOUD-898 @Regression
Feature: Dashboard Functionality

  Background: As a user I should be able to modify Dashboard page
    Given the user is logged in

@TCLOUD-891
  Scenario: User can see all modules and Username after login
    When User access the dashboard successfully
    Then User can see all modules on dashboard page
    Then User can see Username on dashboard page

@TCLOUD-892
  Scenario Outline: User can see status widgets and select any of them
    When user click "Customize button"
    And User can see the status widgets and click on it
    Then User can select any of "<widgets>"
    Examples:
      |widgets|
      | Weather |
      | Upcoming cards |

@TCLOUD-893
  Scenario Outline: User can see background images and select any of them
    When user click "Customize button"
    And User can see the background images
    Then User can select any of "<background images>" from Images
    Examples:
      |background images |
      | Plain background |
      | Default images   |

@TCLOUD-894
  Scenario Outline: User can click on Set Status button and see the Online status options and select any of them
    When user click "Set Status button"
    And User can see the Online status options
    Then user can select any of "<status options>" from status
    Examples:
      |status options|
      | Do not disturb |
      | Away |

@TCLOUD-895

  Scenario Outline: User can see the Status messages and select any of them

  Scenario Outline: User can see the Status messages and select any of them  (3.1)

    When user clicks Set Status button
    And User can see the Status messages
    Then User can select any of "<status messages>" from messages
    Then user click "Set Status Message"
    Examples:
      |status messages|
      | In a meeting  |
      | Vacationing   |


@TCLOUD-927
  Scenario: User can click on Set Status button and Clear the status message
    When user click "Set Status button"
    And user click "Clear status message"
    Then User can see his selections on dashboard after these steps





@TCLOUD-897
  Scenario: User can write his/her own status in input box
    When user click "Set Status button"
    And User can write any "status" in input box manually
    Then User can click the Set status message button and see the status on dashboard




