Feature: User

  @debug
  Scenario: Create user
    Given I create user with name "Filan", age "23" and Salary "200"
    Then User should be created
