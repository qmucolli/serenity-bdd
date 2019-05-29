Feature: SignUp

  @smoke @regression
  Scenario: Sign up
    Given user is on home page
    When user registers a new account
    Then user should be registered