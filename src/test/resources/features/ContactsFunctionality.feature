Feature:Contacts Module Functionality
  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Background:
    Given the user is logged in
    And User clicks Contacts icon on Dashboard page
    And User is on contacts page


  Scenario Outline: User can create a new contact
    When User clicks "NewContacts_button" button.
    And User enters  "<name>" in "NewContact_CompanyBox".
    And User enters  "<surname>" in "NewContact_TitleBox".
    And User clicks "Contacts_button" button.
    Then User should see "<name>" and "<surname>" in the All contacts list.

    Examples:
      | name  | surname |
      | Tylor | Durden  |
      | Jason | Bourne  |
      | Emily | Stark   |


  Scenario: User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
    And User clicks "AllContacts_button" button.
    And User should see that number of cantacts are equal to given total number.
      #You can add negative testing here



  Scenario: User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
    And User deletes all the contacts
    And User clicks "NewContacts_button" button.
    And User saves web element "ContactAvatarPic" attribute "_prevClass" value.
    And User clicks "ContactsIconPic_button" button.
    And User clicks "ChooseFromFile_button" button.
    And User finds ".jpg" web element and click.
    When User clicks "Choose_button" button.
    Then User should see web element "ContactAvatarPic" attribute "_prevClass" value has changed



  Scenario: User can delete any selected contact
    And User chooses any contact in the list.
    When User deletes selected contact.
    Then User should not see the selected contact in list.


  Scenario: User can hide app-navigation by clicking hide icon.
    And User can see app-navigation column on the left.
    When User clicks "AppNavigation_button" button.
    Then User should see app-navigation column is hidden

