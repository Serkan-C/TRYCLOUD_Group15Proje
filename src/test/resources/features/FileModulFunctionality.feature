Feature: Upload/Edit/Delete File Module Functionality

  User Story :
  As a user, I should be able to upload a file, move or delete any selected file under the Files module


  Background: the user is logged in
    Given User is in the Dashboard And lands in "Files" Module


  @mohammad
  Scenario Outline:User can upload a file
    When User clicks on "Plus" icon
    And User select Upload file from DropDown box choose a "<File>" and upload it
    Then User should see uploaded "<File>" in page

    Examples:
      |File|
      |testFile4.jpg|
      |testFile1.jpg|

  @mohammad
  Scenario Outline: User can create a new folder
    When User clicks on "Plus" icon
    And User select "New folder" from DropDown box
    And User types a "<NameOfTheFolder>" for the New folder and hit enter key
    Then User should see created "<NameOfTheFolder>" in the page

    Examples:
      |NameOfTheFolder|
      |TestFolder1|
      |TestFolder2|
