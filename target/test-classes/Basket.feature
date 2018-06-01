Feature:
  Scenario: Add a product to basket
    Given when I am on the home page
    When I search for a product "nike"
    And I select a product
    And I add product to basket
    Then I should see product in basket
