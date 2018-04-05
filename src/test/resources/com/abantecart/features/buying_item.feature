
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
    And I select Men from Fragrance menu
    Then I add item "Pour Homme Eau de Toilette" to cart
    When I change my shipping address to "Rajash Kumar"
    And Confirm my order
    Then My order should be processed
