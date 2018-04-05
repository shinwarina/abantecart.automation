Feature: Buying the item

  Scenario: Buy the item through searchbox
    Given I logged into abantecart
    Then I search for "shirt" from search box
    Then I add item "Mens Fine Cotton Giraffe Polo Shirts" to cart
    When I change my shipping address to "Naseer Shinwari"
    And Confirm my order
    Then My order should be processed

  Scenario: Buy the item through menu options
    Given I logged into abantecart
    When I hover over Fragrance menu
    And Click on Men
    Then I add item "Mens Fine Cotton Giraffe Polo Shirts" to cart
    When I change my shipping address to "Naseer Shinwari"
    And Confirm my order
    Then My order should be processed
