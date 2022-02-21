@EditingWorkspace
Feature: Editing workspaces

  Background:
    Given User goes to the MainBoardsPage
    And User clicks the 'Workspaces' dropdown
    And User chooses and clicks the Trello Workspace'

  @WorkspaceDetails
  Scenario Outline: User editing workspace details
    Given User clicks the 'Edit Workspace details' button
    When User fills in the 'Name' field the <value>
    And User chooses the <type> of the type in the 'Workspace type' field
    And User fills the <short> in the 'Short name' field
    And User clicks the "Save" button
    Then Changes are saved
    Examples:
      | value            | type      | short  |
      | Tests Workspace  | Education | TWS    |

  @WorkspaceVisibility
  Scenario Outline: User editing workspace visibility
    Given User clicks the 'Setting' button
    When User clicks the 'Change' button
    And User selects and clicks the <value> visibility
    And User checks if the visibility of the Workspace has changed to the top of the page
    Then The visibility of Workspace is 'Public'
    Examples:
      | value   |
      | Public  |
