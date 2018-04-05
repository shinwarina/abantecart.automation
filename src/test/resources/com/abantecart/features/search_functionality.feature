Feature: Search

  Scenario: Search item through searchbox
    Given I logged into abantecart
    Then I search for "shirt" from search box
    Then The item "shirt" is displayed in search criteria box

  Scenario Outline: Search item through suggestion categories
    Given I logged into abantecart
    When I select suggestion category from the search box list "<category>"
    Then That category should be selected in search criteria category dropdown list

    Examples: 
      | category              |
      | All Categories        |
      | Apparel & accessories |
      | Makeup                |
      | Skincare              |
      | Fragrance             |
      | Men                   |
      | Hair Care             |
      | Boo                   |
