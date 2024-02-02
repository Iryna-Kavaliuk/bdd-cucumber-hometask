Feature: Search Cloud Product Calculator Page

  @SmokeTest @RegularTest
  Scenario: Search CP Calculator Page
    Given I open cloud product home page
    When I enter "Search Term"
    Then I find "Targeting term" in Search results