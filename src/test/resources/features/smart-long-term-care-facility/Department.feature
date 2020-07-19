Feature: Department

  @Smoke
  Scenario: Create new department
    Given I create a department with the specialisation of "CARDIO"
    Then "CARDIO" Department should be created