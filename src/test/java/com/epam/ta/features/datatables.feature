Feature: Data Tables

  @ListOfStrings
  Scenario: Cloud Product Price Generation
    Given I set parameters for "Compute Engine" program
    |ParameterName      |ParameterValue |
    |NUMBER_OF_INSTANCES|4              |
    |PROVISIONING_MODEL |Regular        |
    When I click Estimate button
    Then Estimated price is "1,840.40 / mo"