@smoke
Feature: login user

  Scenario: user could login with valid email and password


    When user login with valid data "standard_user" and "secret_sauce"
    And  user press on login button
    Then user login successfully


  Scenario: user could login with invalid data

    Given user go to login page
    When user login with invalid data "invalid" "youssef" and "2023"
    And  user press on login button
    Then user see the error message