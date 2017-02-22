Feature: Form Authentication

  As a user
  I want to authenticate the forms
  So that I can ensure security feature of the site

  Background:
    Given user is on HomePage
    And several available examples are seen on the landing page
    When user click on form Authentication Link
    Then user should be directed to Login page

  @automated
  Scenario: Check a success message is shown when you log in correctly

    And should be able to login successfully with valid "UserName" and "Password"
    And user should veiw login success message "You logged into a secure area!"

  @automated
  Scenario: Check an error message is shown when you log in incorrectly

    And should not be able to login with invalid "UserName" and "Password"
    And user should veiw login error message "Your password is invalid!"

