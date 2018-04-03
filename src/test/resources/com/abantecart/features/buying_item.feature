Feature: Buying the item
@Bahor
  Scenario: Buy the item
    Given I logged into abantecart
    Then I search for "shirt" from search box
    Then I add item "Mens Fine Cotton Giraffe Polo Shirts" to cart and proceed to chekout page
    When I change my shipping address to "Naseer Shinwari"
    And Confirm my order
    Then I navigate to order detailes page and my order exists
@Bahor
  Scenario: Buy the item
    Given I logged into abantecart
    When I hover over Fragrance menu
    And Click on Men
    Then I add item "Acqua Di Gio Pour Homme" to cart and proceed to chekout page
    When I change my shipping address to "Naseer Shinwari"
    And Confirm my order
    Then I navigate to order detailes page and my order exists
