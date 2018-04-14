Feature: checkout 

  @Bakhor
  Scenario Outline: default checkout 
    Given I logged into abantecart
    Then I buy the item "<Items>" from search box
    Then I proceed to checkout with selecting address of "Java Killers"
    And I will confirm the existing order
    And I Confirm the orders are listed in the history

    Examples: 
      | Items                                    |
      | Mens Fine Cotton Giraffe Polo Shirts     |
      | Waterproof Protective Undereye Concealer |

  @Bakhor
  Scenario Outline: checkout with Euro currency
    Given I logged into abantecart
    Then I buy the item "<Items>" from search box
    Then I change currency to Euro
    Then I proceed to checkout with selecting address of "Java Killers"
    And I will confirm the existing order
    And I Confirm the orders are listed in the history

    Examples: 
      | Items                                    |
      | Viva Glam Lipstick                       |
      | Waterproof Protective Undereye Concealer |

  @Bakhor
  Scenario Outline: checkout with Dollar currency
    Given I logged into abantecart
    Then I buy the item "<Items>" from search box
    Then I change currency to Dollar
    Then I proceed to checkout with selecting address of "Java Killers"
    And I will confirm the existing order
    And I Confirm the orders are listed in the history

    Examples: 
      | Items                                    |
      | Viva Glam Lipstick                       |
      | Waterproof Protective Undereye Concealer |
      
  @Bakhor
  Scenario Outline: checkout with Pound Sterling
    Given I logged into abantecart
    Then I buy the item "<Items>" from search box
    Then I change currency to Pound
    Then I proceed to checkout with selecting address of "Java Killers"
    And I will confirm the existing order
    And I Confirm the orders are listed in the history

    Examples: 
      | Items                                    |
      | Viva Glam Lipstick                       |
      | Waterproof Protective Undereye Concealer |