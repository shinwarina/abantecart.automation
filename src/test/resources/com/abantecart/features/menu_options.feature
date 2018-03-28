Feature: Abantecart menu options

  Scenario: Verify apparel & accessories from menu options
  Given I logged into abantecart
  When I hover over apparel & accessories menu
  Then following menu options should be visible for apparel & accessories:
  |Shoes|
  |T-shirts|
  
  Scenario: Verify make up from menu options
  Given I logged into abantecart
  When I hover over make up menu
  Then following menu options should be visible for make up:
  |Cheeks|
  |Eyes|
  |Face|
  |Lips|
  |Nails|
  |Value Sets|
  