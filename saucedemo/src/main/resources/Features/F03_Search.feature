@smoke
Feature: User Search Product

  Scenario: User Search From DropDown List

    Given user login with valid data "standard_user" and "secret_sauce"
    When user press on login button
    And user search from dropdown list
