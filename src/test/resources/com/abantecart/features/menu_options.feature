Feature: Abantecart menu options

  Scenario: Verify apparel & accessories from menu options
    Given I logged into abantecart
    When I hover over Apparel & Accessories menu
    Then following menu options should be visible for Apparel & Accessories:
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

  Scenario: Verify Fragrance from menu options
    Given I logged into abantecart
    When I hover over Fragrance menu
    Then following menu options should be visible for Fragrance:
      | Men   |
      | Women |

  Scenario: Verify skincare from menu options
    Given I logged into abantecart
    When I hover over Skincare menu
    Then following menu options should be visible for Skincare:
      | Eyes              |
      | Face              |
      | Gift Ideas & Sets |
      | Hands & Nails     |
      | Sun               |

  Scenario: Verify men from menu options
    Given I logged into abantecart
    When I hover over Men menu
    Then following menu options should be visible for Men:
      | Body & Shower       |
      | Fragrance Sets      |
      | Pre-Shave & Shaving |
      | Skincare            |

  Scenario: Verify HAIRCARE from menu options
    Given I logged into abantecart
    When I hover over HAIRCARE menu
    Then following menu options should be visible for HAIRCARE:
      | Conditioner |
      | Shampoo     |

  Scenario: Verify BOOKS from menu options
    Given I logged into abantecart
    When I hover over BOOKS menu
    Then following menu options should be visible for BOOKS:
      | Audio CD  |
      | Paperback |
