Feature: User

  @debug
  Scenario: Create new user
    Given I create user with email "test@gmail.com", username "qendrim123", firstName "Qendrim", lastName "Mucolli", password "my-password" and roleType "ADMIN"
    Then User should be created