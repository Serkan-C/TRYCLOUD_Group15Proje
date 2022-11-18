Feature:Contacts Module Functionality
  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Background:
    Given the user is logged in
    And User clicks Contacts icon on Dashboard page
    And User is on contacts page


  Scenario Outline: User can create a new contact
    When User clicks "NewContacts_button" button.
    #And User waits "2" seconds.
    #And User enters  "<name>" in "NewContact_Box".
    And User enters  "<name>" in "NewContact_CompanyBox".
    And User enters  "<surname>" in "NewContact_TitleBox".
    And User waits "2" seconds.
    And User clicks "Contacts_button" button.
    #And User returns dashboard page.
    And User waits "2" seconds.
    #And User clicks Contacts icon on Dashboard page
    #And User clicks "AllContacts_button" button.
    Then User should see "<name>" and "<surname>" in the All contacts list.
    And User logs out

    Examples:
      | name  | surname |
      | Tylor | Durden  |
      | Jason | Bourne  |
      | Emily | Stark   |


  Scenario: User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
    And User clicks "AllContacts_button" button.
    And User should see that number of cantacts are equal to given total number.
    And User logs out
      #You can add negative testing here




  Scenario: User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
    And User deletes all the contacts
    And User clicks "NewContacts_button" button.
    And User saves web element "ContactAvatarPic" attribute "_prevClass" value.
    And User clicks "ContactsIconPic_button" button.
    And User clicks "ChooseFromFile_button" button.
    And User finds ".jpg" web element and click.
    And User waits "2" seconds.
    When User clicks "Choose_button" button.
    And User waits "2" seconds.
    #And User clicks "Contacts_button" button.
    Then User should see web element "ContactAvatarPic" attribute "_prevClass" value has changed
    #And User waits "2" seconds.
    And User logs out

  @fk
  Scenario: User can delete any selected contact

  Scenario: Delete this line and write your own AC.