Feature: Cloud Product Management

  @RegularTest
  Scenario: Add a program
    Given I open cloud product calculator
    And I select "Compute Engine" program
    When I specify pre-defined cloud program parameters
    Then I get cloud product estimated price