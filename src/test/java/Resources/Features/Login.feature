@LoginFeature
Feature: Logging in as user and admin

  Background:
    Given I am on the homepage
    And I click the log in / out button on the homepage

  @LoginAsUser
  Scenario: Logging in as User
    When I enter username: "user" and password: "password"
    And click sign in
    Then I see logged in as "user"

  @LoginAsAdmin
  Scenario: Logging in as Admin
    When I enter username: "admin" and password: "password"
    And click sign in
    Then I see logged in as "admin"

  @LogoutAsUser
  Scenario: Logging in as User then logging out
    When I enter username: "user" and password: "password"
    And click sign in
    And I click the log in / out button on the homepage
    Then I see I have been logged out