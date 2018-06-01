Feature: Filter
  As an end user
  I want to filter
  So that I can view filter product

Scenario: Filter by rating
  Given when I am on the home page
  When I search for a product "nike"
  And I select a filter "5only"
  Then I should see results filtered by "5.0"



