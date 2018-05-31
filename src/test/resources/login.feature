Feature:
  Scenario: Login using username and password
    Given I have registered for argos
    And I am on the home page
    When I input my username and password
    And I click on submit button
    Then I should see welcome message with my name

