Feature: Department

  @debug
  Scenario: Create new department
    Given I create a department with the specialisation of "INFECTED"
    Then "INFECTED" Department should be created