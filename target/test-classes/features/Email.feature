@Email
Feature: Check user email

  Background:
    Given User navigates to trello page

  @Trello
  Scenario: Compare email values - login by Trello
    When User enters email and password into Trello
    And User opens member menu
    And User compares the value of the email field with his email address
    Then the email values are equal

  @Google
  Scenario: Compare email values - login by Google
    When User clicks Continue with Google button
    And User enters email and password into Google Account
    And User opens member menu
    And User compares the value of the email field with his email address
    Then the email values are equal

