Feature: Add items

  Scenario: Add item to wishlist
    Given I logged into abantecart
    When I add item to wishlist
    And I navigate to wishlist and my item should be there
    When I delete item from wishlist
    Then Wishlist should be empty
    
   Scenario: Add item to cart
   	Given I logged into abantecart
   	When I add item to cart 
   	And I navigate to cart my item is there
   	
