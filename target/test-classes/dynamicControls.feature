Feature: Dynamic Controls

  As a user
  I want to test Dynamic Controls
  So that I can ensure that the buttons are working


  Background:
    Given user is on HomePage
    When user click on form Dynamic Controls
    Then he should be directed to the Dymanic Controls Page

  @automated
  Scenario: Check that the remove button removes the checkbox and the user is shown a confirmation message

    And he should be able to remove checkbox tag
    And he should see a success message "It's gone!"

  @automated
  Scenario:Check that the add button returns the checkbox and the user is shown a confirmation message

    And he should be able to add the checkbox again
    And he should see a message "Its back"
