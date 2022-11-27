@TCLOUD-741 @Regression
Feature: Log out Functionality-As a user, I should be able to log out.

  Background:
    Given User is already login and is on the dashboard
@TCLOUD-737
  Scenario: User can log out and ends up in login page
    When User click right corner brown Login Icon
    And  User see options and click logout button
    Then User is  on the login page
@TCLOUD-738
  Scenario: User can not go to home page again by clicking step back button after successfully logged out.
    When User click right corner brown Login Icon
    And  User see options and click logout button
    Then User is  on the login page
    And User click step back button
    Then User cannot go to the dashboard and cannot login

