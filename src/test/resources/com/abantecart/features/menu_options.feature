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
  
  Scenario: Verify skincare from menu options
  Given I logged into abantecart
  When I hover over skincare menu
  Then following menu options should be visible for skincare:
   |Eyes|
   |Face|
   |Gift Ideas & Sets|
   |Hands & Nails|
   |Sun|
   
   Scenario: Verify men from menu options
  Given I logged into abantecart
  When I hover over men menu
  Then following menu options should be visible for men:
   |Body & Shower|
   |Fragrance Sets|
   |Pre-Shave & Shaving|
   |Skincare|