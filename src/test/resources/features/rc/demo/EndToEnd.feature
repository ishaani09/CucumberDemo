Feature: Checkout

  As a customer
  I want to be able to continue to payment after adding products to cart

  Background:
    Given I am on the homepage

#  Scenario: As a registered user search for RS stock number and add product to cart
#    Given I login with credentials "Test01192" and "Test2015@"
#    And I search for the RS stock number "729-5117"
#    And I add "1" of the product to cart from pdp page
#    When I view the cart
#    Then I should see the product "729-5117" in the cart
#    And I proceed to checkout
#
#  Scenario: As an anonymous user I add product to cart from Quick Order section
#    Given I add "1" of "729-5117" from quickorder section
#    Then I should see the product "729-5117" in the cart
#    And I proceed to checkout
#    Then I checkout as guest

  Scenario: As a registered user search for RS stock number and add product to cart
    Given I search for text "Rechargeable Batteries"
