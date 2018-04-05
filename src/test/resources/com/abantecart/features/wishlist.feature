Feature: Add items

  Scenario: Add item to wishlist
    Given I logged into abantecart
    When I add item "Skinsheen Bronzer Stick" to wishlist
    Then My item "Skinsheen Bronzer Stick" should be in wishlist
    When I delete item from wishlist
    Then Wishlist should be empty

  @Busara
  Scenario: Add item to cart
    Given I logged into abantecart
    When I add item "Skinsheen Bronzer Stick" to cart
    Then My item "Skinsheen Bronzer Stick" should be in cart
    When I delete item from cart
    Then Cart should be empty
