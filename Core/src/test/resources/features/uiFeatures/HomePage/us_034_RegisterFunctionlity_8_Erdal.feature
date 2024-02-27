@Erdal
Feature: As a user, I should be able to check valid and invalid name, surname, email.

  @UI
  Scenario: Successful registration should be achieved when all information is entered correctly.
    Given User goes to direct Register Page
    Then User should be able to write or not the following information
      |           | false |         | true  |          | false |                       | false |
      | Mehmet123 | false | Emin456 | false | Demir123 | false | @                     | false |
      | Mehmet@   | false | Emin#   | false | Demir-   | false | mehmetemin.com        | false |
      | Mehmet    | true  | Emin    | true  | Demir    | true  | mehmet.emin@          | false |
      | Mehmet    | true  | Emin    | true  | Demir    | true  | mehmet emin@demir.com | false |
      | Mehmet    | true  | Emin    | true  | Demir    | true  | mehmet.emin@demir.com | true  |






