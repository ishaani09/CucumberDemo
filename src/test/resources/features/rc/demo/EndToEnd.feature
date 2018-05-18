Feature: Checkout

  As a customer
  I want to be able to continue to payment after adding products to cart

  Background:
    Given I am on the homepage

  Scenario: Add product to cart by searching for RS Stock No. and proceed to checkout
    Given As a registered user I login with credentials "Test01192" and "Test2015@"
    And I search for the RS stock number "729-5117"
    And I add "1" of the product to cart from pdp page
    And I view the cart
#    When I proceed to checkout
#    And I enter delivery address and continue to payment
#    Then I should see the payment page

##  Scenario: Add product to cart from Quick Order section
##    Given
##    And I procced to checkout
##    When I submit my login details "<string>" and "<string>"
##    Then I am taken to delivery details page
#
#  Scenario: Search for a sku as an anonymous user
#    Given I am on the homepage
#    And I search for the RS Stock number "729-5117"
