@LoginFeature
Feature: Creating an application

  Background:
    Given I am on the homepage
    And I click log in button

  @LoginAsUser
  Scenario: Logging in as User
    When enter username: "User" and password: "password"
    And click sign in

  @LoginAsUser
  Scenario: Logging in as Admin
    When enter username: "Admin" and password: "password"
    And click sign in