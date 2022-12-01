@LoanApplicationFeature
Feature: Creating an application

  Background:
    Given I am on the homepage
    And I click the log in / out button on the homepage
    And I enter username: "User" and password: "password"
    And click sign in
    And navigate to Loan application page

  @FillingInCorrectUserInfo
  Scenario:Filling in User information
    When I input the application details
      | First Name     | Bobby                  |
      | Last Name      | Smith                  |
      | Age            | 24                     |
      | Address Line 1 | 12                     |
      | Address Line 2 | Bob Lane               |
      | Address Line 3 | Bob Town               |
      | Address Line 4 | Bobby                  |
      | Post code      | GIR 0AA                |
      | Email          | BobTheTester@ten10.com |
      | Loan Amount    | 10000                  |
    And click the submit button