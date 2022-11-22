@Calendar @Regression
Feature: 
  As a user, I should be able to see Daily-Weekly-Monthly calendar view and create a new event under the Calendar module

  Background:

    Given the user is logged in

  Scenario: User can display daily calendar view
    When user clicks on Calendar icon
    And user clicks on change calendar view button
    And user clicks on day view button
    Then user can see daily calendar view


  Scenario: User can display weekly calendar view
    When user clicks on Calendar icon
    And user clicks on change calendar view button
    And user clicks on week view button
    Then user can see weekly calendar view


  Scenario: User can display monthly calendar view
    When user clicks on Calendar icon
    And user clicks on change calendar view button
    And user clicks on month view button
    Then user can see monthly calendar view


  Scenario Outline: User can create a new event under the Calendar module and
  see it on the related day through the Monthly Calendar view
    When user clicks on Calendar icon
    And user clicks on new Event Button
    And user writes "<new Event>"
    And user clicks save Button
    Then user can see "<new Event>" in the Monthly Calendar view
    Examples:
      | new Event |
      | dr Date  |


  Scenario Outline: User can delete any event through the Monthly Calendar view by clicking on the event
  and then using “more” option
    When user clicks on Calendar icon
    When user clicks on "<event>"
    And  user clicks more option Button
    And user clicks on three dots Button
    And user clicks delete Button
    Then user can delete any "<event>"
  Examples:
    | event   |
    | dr Date |

  @calendar
  Scenario Outline: User can add Category in to any Event
    When user clicks on Calendar icon
    When user clicks on "<event>"
    And user clicks more option Button
    And user clicks on Search or add Categories Button
    And user clicks one "<Category>" from Category
    And user clicks Update Button
    When user clicks on "<event>"
    And user clicks more option Button
    Then user see updated "<Category>"
    Examples:
      | event   | Category |
      | dr Date | Business |


