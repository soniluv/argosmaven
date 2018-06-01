Feature: Filter
  As an end user
  I want to filter
  So that I can view filter product

Scenario Outline: Filter by rating
  Given when I am on the home page
  When I search for a product "nike"
  And I select a filter "<filterValue>"
  Then I should see results filtered by "<expectedValue>"
  Examples:
    | filterValue | expectedValue |
    | 5only | 5.0 |
    | 4or more | 4.0 |




