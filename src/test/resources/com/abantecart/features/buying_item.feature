Feature: Buying the item

  Scenario: Buy the item
    Given I logged into abantecart
    Then I add item to cart and proceed to chekout page
    When I change my shipping address to "Naseer Shinwari"
    And Confirm my order
    Then I navigate to order detailes page and my order exists
