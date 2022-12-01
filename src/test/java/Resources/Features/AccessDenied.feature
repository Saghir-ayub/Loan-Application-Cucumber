@AccessDeniedFeature
Feature: Access is denied to users on specific pages

  Background:
    Given I am on the homepage
    And I click the log in / out button on the homepage

  @AdminAccessDenied
  Scenario: Creating a new loan application as an Admin
    When I enter username: "admin" and password: "password"
    And click sign in
    And navigate to application page
    Then I will see "Access is denied"

  @UserAccessDenied
  Scenario: Trying to access Admin page as a User
    When I enter username: "user" and password: "password"
    And click sign in
    And navigate to admin page
    Then I will see "Access is denied"
