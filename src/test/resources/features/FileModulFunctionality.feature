@TCLOUD-909
Feature: Upload/Edit/Delete File Module Functionality

  User Story :
  As a user, I should be able to upload a file, move or delete any selected file under the Files module


  Background: the user is logged in
    Given User is in the Dashboard And lands in "Files" Module


  @TCLOUD-901
  Scenario Outline:User can upload a file
    When User clicks on "Plus" icon
    And User select Upload file from DropDown box choose a "<File>" and upload it
    Then User should see uploaded "<File>" in page

    Examples:
      |File|
      |testFile4.jpg|
      |testFile1.jpg|


  @TCLOUD-904
  Scenario Outline: User can create a new folder
    When User clicks on "Plus" icon
    And User select "New folder" from DropDown box
    And User types a "<NameOfTheFolder>" for the New folder and hit enter key
    Then User should see created "<NameOfTheFolder>" in the page

    Examples:
      |NameOfTheFolder|
      |TestFolder1|
      |TestFolder2|

    @TCLOUD-906
    Scenario Outline: User can move or copy any selected item to any folder and see the item in the selected folder
      When User select file "<item>" From the list
      And User clicks "Actions" with three dots icon
      And User select "Move or copy" from DropDown box
      And User choose "<Target Folder>" to copy or move the selected item
      And User clicks on "<option>" selected target folder button.
      Then User should see the copied or moved file "<item>" in the "<Target Folder>".

      Examples:
        |item         |Target Folder | option |
       |testFile1.jpg|TestFolder2   |copy to TestFolder2|

  @TCLOUD-907
  Scenario Outline: User can move or copy any selected item to any folder and see the item in the selected folder
    When User select folder "<item>" From the list
    And User clicks "Actions" with three dots icon
    And User select "Move or copy" from DropDown box
    And User choose "<Target Folder>" to copy or move the selected item
    And User clicks on "<option>" selected target folder button.
    Then User should see the copied or moved folder "<item>" in the "<Target Folder>".

    Examples:
      |item         |Target Folder | option |
      |TestFolder2  |TestFolder1   |move to TestFolder1|

  @TCLOUD-908
  Scenario Outline: User can delete any selected item from its three dots menu
    When User select file "<item>" From the list
    And User clicks "Actions" with three dots icon
    And User select "Delete" from DropDown box
    Then User should see deleted "<item>" in "Deleted Files" folder

    Examples:
      |item       |
      |TestFolder1|

