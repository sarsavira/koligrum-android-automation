@login @android
Feature: Login
  @positive
  Scenario: Verify user successfully login when input valid username and password
    Given user is on login page
    When user input username "admin"
    And user input password "admin"
    And user click login button
    Then user successfully login
  @negative
  Scenario: Verify user successfully login when input valid username and password
    Given user is on login page
    When user input username "admin"
    And user input password "admin"
    And user click login button
    Then user successfully login


