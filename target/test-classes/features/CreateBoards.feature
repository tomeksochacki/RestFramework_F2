@newBoards
Feature: Create new boards

  Background:
    Given User navigates to trello page
    And User enters email and password into Trello

 Scenario Outline: Create new 10 boards
    Given User clicks 'create button' in the main bar
    When User selects the 'create board' button from the drop-down menu
    And User fills the 'board title' field with the <boardName>
    Then User clicks 'create' button
   Examples:
     | boardName |
     | myBoard   |

