@smoke
  Feature: User Add Products In Cart

    Scenario: User Add Products


      When user login with valid data "standard_user" and "secret_sauce"
      And  user press on login button
      Then user add product to cart
      Then  click on the cart see all the products
