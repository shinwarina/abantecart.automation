Feature: Search

  Scenario: Search Item
    Given I logged into abantecart
    Then I search for item
    Then The item is displayed

  Scenario: Search Item
    Given I logged into abantecart
    When I click in search box
    When I select option from the list:
      | All Categories        |
      | Apparel & accessories |
      | Makeup                |
      | Skincare              |
      | Fragrance             |
      | Men                   |
      | Hair Care             |
      | Boo                   |
    Then that option should be selected in search criteria
