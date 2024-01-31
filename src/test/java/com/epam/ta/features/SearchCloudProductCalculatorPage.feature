Feature: Search Cloud Product Calculator Page

  Scenario: Search CP Calculator Page
    Given I open cloud product home page
    When I enter "Search Term"
    Then I find "Targeting term" in Search results