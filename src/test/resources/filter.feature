Feature: Filter
  As an end user
  I want to filter
  So that I can view filter product

Scenario Outline: Filter by rating
  Given when I am on the home page
  When I search for a product "<product>"
  And I select a filter "<filterValue>"
  Then I should see results filtered by "<expectedValue>"
  Examples:
    |product | filterValue | expectedValue |
    |nike | 5only | 5.0 |
    |nike | 4or more | 4.0 |




