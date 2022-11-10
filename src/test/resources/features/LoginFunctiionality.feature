      @TCLOUD-724
Feature: As a user, I should be able to login so that I can land on the dashboard page.

  Background:
    Given User is already on the login page

  @mylogin @TCLOUD-671
  Scenario: User can login with valid credentials click enter
    When User enter a valid username
    And User enter a valid password and click Enter key from keyboard
    Then User successfully login on the dashboard page

  @mylogin @TCLOUD-672

  Scenario: User can login with valid credentials click Login button
    When User enter a valid username
    And User enter a valid password and click Login Button
    Then User successfully login on the dashboard page

  @mylogin @TCLOUD-673

  Scenario Outline: User can not login with  invalid username
    When User enter invalid "<username>"
    And User enter a valid password and click Login Button
    Then Wrong username or password should be displayed
    Examples:
      | username   |
      | employee85 |
      | driver23   |
      | developer  |
      | tester12   |

  @mylogin @TCLOUD-674
  Scenario Outline: User can not login with  invalid password
    When User enter a valid username
    And User enter a invalid "<password>" and click Login Button
    Then Wrong username or password should be displayed
    Examples:
      | password    |
      | EMPloyee123 |
      | driver23    |
      | developer   |
      | tester12    |

  @mylogin @TCLOUD-675

  Scenario: User can not login without username
    When username is empty
    And User enter a valid password and click Login Button
    Then Please fill out this field should be displayed

  @mylogin1 @TCLOUD-676

  Scenario: User can not login without password
    When User enter a valid username
    And Password is empty and click Login Button
    Then Please fill out this field should be displayed on the password input box

  @mylogin  @TCLOUD-678

  Scenario: User can not login with any invalid credentials
    When username is empty
    And Password is empty and click Login Button
    Then Please fill out this field should be displayed

  @mylogin @TCLOUD-687
  Scenario Outline: User can see the password in a form of dots by default
    When User types any "<password>" in the password input box
    Then User can see the password in a form of dots

    Examples:
      | password    |
      | EMPloyee123 |
      | driver23    |
      | developer   |
      | tester12    |

  @mylogin @TCLOUD-688
  Scenario Outline: User can see the password explicitly if needed
    When User types any "<password>" in the password input box
    And User clicks eye button in the password input box
    Then User see the password explicitly

    Examples:
      | password    |
      | EMPloyee123 |
      | driver23    |
      | developer   |
      | tester12    |

   @TCLOUD-692
  Scenario: User can see the "Forgot password?" link on the login page and
  can see the "Reset Password" button on the next page after clicking on forget password link

    When User see the Forgot Password? link
    And User clicks the Forgot Password link
    Then User see the Reset Password button on the next page

  @mylogin  @TCLOUD-695
  Scenario: User can see valid placeholders on Username and Password fields
    When User see Username as a placeholders on username fields
    When User see Password as a placeholders on password fields