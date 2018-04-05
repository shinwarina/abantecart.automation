Feature: checkout

  Scenario Outline: checkout
    Given I logged into abantecart
    Then I search for product <Products> from search box
    Then I add item  to cart  and proceed to chekout page
    Then I navigate to order detailes page and my order exists
    Then I will confirm order
    And I Confirm the orders are listed in the history

    Examples: 
      | Products                                 |
      | Jersey Cotton Striped Polo Shirt         |
      | Waterproof Protective Undereye Concealer |

  Scenario Outline: checkout
    Given I logged into abantecart
    Then I search for product <Products> from search box
    Then I add item  to cart  and proceed to chekout page
    Then I navigate to order detailes page and my order exists
    Then I change currency to Euro
    Then I will confirm order
    And I Confirm the orders are listed in the history

    Examples: 
      | Products                                 |
      | Jersey Cotton Striped Polo Shirt         |
      | Waterproof Protective Undereye Concealer |
