Feature:Contacts Module Functionality
  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Background:
    Given the user is logged in

  @fk
  Scenario Outline: User can create a new contact
    And User clicks Contacts icon on Dashboard page
    And User is on contacts page
    When User clicks "NewContacts_button" button.
    #And User waits "2" seconds.
    #And User enters  "<name>" in "NewContact_Box".
    And User enters  "<name>" in "NewContact_CompanyBox".
    And User enters  "<surname>" in "NewContact_TitleBox".
    And User waits "2" seconds.
    And User clicks "AllContacts_button" button.
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


  Scenario Outline: User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
    And User clicks Contacts icon on Dashboard page
    And User is on contacts page
    And User clicks "AllContacts_button" button.
    #Then User should see "<name>" and "<surname>" in the All contacts list.
    And User should see that number of cantacts are equal to given total number.
    And User logs out

    Examples:
      | name  | surname |
      | Tylor | Durden  |
      | Jason | Bourne  |
      | Emily | Stark   |


  Scenario: User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option


  Scenario: User can delete any selected contact

  Scenario: Delete this line and write your own AC.