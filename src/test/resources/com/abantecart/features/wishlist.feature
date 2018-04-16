Feature: Add items
 @Smoke
  Scenario: Add item to wishlist
    Given I logged into abantecart
    When I add item "Skinsheen Bronzer Stick" to wishlist
    Then My item "Skinsheen Bronzer Stick" should be in wishlist
    When I delete item from wishlist
    Then Wishlist should be empty

 