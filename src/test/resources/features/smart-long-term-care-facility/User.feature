Feature: User

  @debug
  Scenario: Create new user
    Given I create user with email "test@gmail.com", username "qendrim123", firstName "Qendrim", lastName "Mucolli", password "my-password" and roleType "ADMIN"
    Then User with role should be created

  Scenario: Login user with username and password
    Given I login with the username "testing" and password "password"
    Then User should see the Homepage
