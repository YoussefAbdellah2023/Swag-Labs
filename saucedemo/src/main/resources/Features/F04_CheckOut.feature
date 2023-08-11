@smoke
Feature: User Make a CheckOut

  Scenario: User Buy The Product With Valid Data

    Given user login with valid data "standard_user" and "secret_sauce"
    When  user press on login button
    And   user add product to cart
    Then  click on the cart see all the products
    And   click on the checkout button
    Then  fill all require data
    And   click on continue button
    And  click on the finish button to see success message and click on back home button
    Then click on tap menu and logout


  Scenario: User Buy The Product With Invalid Data

    Given user login with valid data "standard_user" and "secret_sauce"
    When  user press on login button
    And   user add product to cart
    Then  click on the cart see all the products
    And   click on the checkout button
    Then  leave all require data empty
    And   click on continue button and see error message

