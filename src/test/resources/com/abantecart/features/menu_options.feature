@Artem
Feature: Abantecart menu options

  Scenario: Verify apparel & accessories from menu options
    Given I logged into abantecart
    When I hover over Apparel & Accessories menu
    Then following menu options should be visible for Apparel & accessories:
      | Shoes    |
      | T-shirts |

  Scenario: Verify make up from menu options
    Given I logged into abantecart
    When I hover over Makeup menu
    Then following menu options should be visible for Makeup:
      | Cheeks     |
      | Eyes       |
      | Face       |
      | Lips       |
      | Nails      |
      | Value Sets |

  Scenario: Verify Skincare from menu options
    Given I logged into abantecart
    When I hover over Skincare menu
    Then following menu options should be visible for Skincare:
      | Eyes              |
      | Face              |
      | Gift Ideas & Sets |
      | Hands & Nails     |
      | Sun               |

  Scenario: Verify Fragrance from menu options
    Given I logged into abantecart
    When I hover over Fragrance menu
    Then following menu options should be visible for Fragrance:
      | Men   |
      | Women |

  Scenario: Verify Men from menu options
    Given I logged into abantecart
    When I hover over Men menu
    Then following menu options should be visible for Men:
      | Body & Shower       |
      | Fragrance Sets      |
      | Pre-Shave & Shaving |
      | Skincare            |

  Scenario: Verify Haircare from menu options
    Given I logged into abantecart
    When I hover over Haircare menu
    Then following menu options should be visible for Hair Care:
      | Conditioner |
      | Shampoo     |

  Scenario: Verify Books from menu options
    Given I logged into abantecart
    When I hover over Books menu
    Then following menu options should be visible for Books:
      | Audio CD  |
      | Paperback |
