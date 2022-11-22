@TCLOUD-916
Feature: As a user, I should be able to see all deleted files and delete/restore them permenantly under the Deleted Files tab.

  Background:
    Given User is already on the login page
    When User enter a valid username
    And User enter a valid password and click Login Button
    Then User successfully login on the dashboard page


  @TCLOUD-900
  Scenario: User can see the most recent deleted file in the first line of the deleted file list when deleted files are ordered by newest to oldest
    When User should click Files module
    And User should click Deleted files module
    Then User should click the deleted button two times for order by newest to oldest

  @TCLOUD-910
  Scenario: User can order the all deleted files by newest to oldest or visa versa
    When User should click Files module
    And User should click Deleted files module
    And User should click the deleted button with the arrow pointing down for order by newest to oldest
    Then User should click the deleted button with the arrow pointing up for order by oldest to newest


  @TCLOUD-912
  Scenario: User can order alphabetically all the deleted files based on their names
    When User should click Files module
    And User should click Deleted files module
    Then User should click the name button with the arrow pointing up for order alphabetically

 @TCLOUD-913
  Scenario: User can delete any deleted file permenantly by using the three dots icon in the file’s line
    When User should click Files module
    And User should click Deleted files module
    And User should click three dots icon
    Then User should click delete permenantly button

   @TCLOUD-914
  Scenario: User can restore any deleted file and see it again under the All Files tab
    When User should click Files module
    And User should click Deleted files module
    And User should click restore button
    Then User can see deleted file again under the All Files tab

  @TCLOUD-915
  Scenario: User can delete any file and see it under the Deleted File tab
    When User should click Files module
    And And User should click three dots icon in all files
    And User should click Delete folder
