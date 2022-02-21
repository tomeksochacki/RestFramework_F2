@WorkingToTheCards
Feature: Adding cards to board

  Background:
    Given User goes to the MainBoardsPage

  @AddingNewCards
  Scenario Outline: User adding new cards to board
    Given User clicks the 'Trello Workspace' button, to the left of the page
    When User selects and clicks the 'Boards' button from dropdown of the list
    And User chooses nad clicks one board from the 'Workspace boards'
    And User clicks 'Add a card' button
    And User enters the <title> in to the title field and clicks 'Add card' button
    And User repeats the 5 and 6 steps two more times
    #The name of the new card comes from the table 'title'
    Examples:
      | title     |
      | myTitle1  |
      | myTitle2  |
      | myTitle3  |

