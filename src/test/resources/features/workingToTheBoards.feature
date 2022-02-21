@WorkingToTheBoards
Feature: Working to the boards

  Background:
    Given User goes to the MainBoardsPage

  @CreatingNewBoard
  Scenario Outline: User creating new board
    Given User clicks 'Create' button to the top of the page
    When User selects and clicks the 'Create board' button from dropdown of the list
    And User fills <nameBoard> in the 'Board title' field
    And User clicks 'Create' button
    Then New board has been created
    Examples:
      | nameBoard |
      | myBoard1  |

  @SortingBoards
  Scenario: User alphabetically sorting boards
    Given User clicks the 'Workspaces' dropdown
    When User chooses and clicks the 'Trello Workspace'
    And User clicks the "Boards" button
    And User selects 'Alphabetically A-Z' position from the dropdown list
    And User checks if the first board has a name beginning with the letter 'A'
    And User checks if the last board has a name beginning with the letter 'Z'



