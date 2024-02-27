@Erdal
Feature: User Login

  @UI
  Scenario: User should be able to login
    Given User goes to Login Page
    When User write the valid credentials
    Then User should be able to logged in