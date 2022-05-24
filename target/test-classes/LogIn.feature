@Login
Feature: LogIn feature
  As a Customer
  I Want to Log in
  So that I can see my e-mails

  Scenario: Validate Log In Page
    Given I am on the home page
    When I click on the Log in
    Then I should see "Welcome, Please Sign In!" text on login page
    And the url should contain with "/login"

#  Scenario: LogIn with valid credentials
#    Given I am on home page
#    When I entre User Name & Password
#    And I click on Log in button
#    Then I should be Logged in
