Feature: Register

  @Smoke
  Scenario: Register with valid credentials
    Given User is registered
    Then User should see Login page