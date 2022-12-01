@GuestAccessFeature
Feature: Checking guest access

  Background:
    Given I am on the homepage
    And I am not logged in

  @GuestApplicationPage
  Scenario: Navigating to application page as a guest
    When navigate to Application page
    Then I will be redirected to sign in page

  @GuestAdminPage
  Scenario: Navigating to admin page as a guest
    When navigate to Admin page
    Then I will be redirected to sign in page

  @GuestSearchPage
  Scenario: Navigating to search page as a guest
    When navigate to Search page
    Then I will be on the Search page

  @GuestAboutPage
  Scenario: Navigating to about page as a guest
    When navigate to About page
    Then I will be on the About page