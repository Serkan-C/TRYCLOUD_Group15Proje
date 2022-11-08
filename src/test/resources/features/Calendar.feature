Feature:
  As a user, I should be able to see Daily-Weekly-Monthly calendar view and create a new event under the Calendar module

  Background:

    Given the user is logged in

    Scenario:

      When user clicks on Calendar icon
      And user clicks on change calendar view button
      And user clicks on day view button
      Then user can see dayly calendar view

      When user clicks on Calendar icon
      And user clicks on change calendar view button
      And user clicks on week view button
      Then user can see weekly calendar view

      When user clicks on Calendar icon
      And user clicks on change calendar view button
      And user clicks on month view button
      Then user can see monthly calendar view

