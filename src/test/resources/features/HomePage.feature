@regression
Feature: HomePage

  @testCase
  Scenario: Register on the web page
    Given The user is on the home page
    When The user clicks add users button
    Then The User is navigated to fill form screen