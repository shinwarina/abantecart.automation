Feature: Abantecart address book

  Scenario Outline: Adding new address
    Given I logged into abantecart
    When I am at the manage address book page
    When I add a new address:
      | firstname   | lastname   | address   | city   | state   | zipcode   | country   |
      | <firstname> | <lastname> | <address> | <city> | <state> | <zipcode> | <country> |
    Then I should be able to see the information for "<firstname> <lastname>"

    Examples: 
      | firstname | lastname   | address    | city        | state    | zipcode | country       |
      | Artem     | Pashynskyi | 123 abc Dr | Rockville   | Maryland |   20852 | Ukraine       |
      | Busara    | Mamat      | 123 abc Dr | Oakton      | Virginia |   22124 | United States |
      | Naseer    | Shinwari   | 123 abc Dr | Springfield | Virginia |   22152 | United States |
      | Denys     | Yavorskyi  | 123 abc Dr | Alexandria  | Virginia |   22304 | United States |
     
     
