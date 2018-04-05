@Naseer
Feature: Abantecart address book

  Scenario Outline: Adding new address using Beans
    Given I logged into abantecart
    When I am at the manage address book page
    When I add a new address using beans:
      | firstname   | lastname   | address   | city   | state   | zipcode   | country   |
      | <firstname> | <lastname> | <address> | <city> | <state> | <zipcode> | <country> |
    Then I should be able to see the information for "<firstname> <lastname>"

    Examples: 
      | firstname | lastname   | address    | city        | state    | zipcode | country       |
      | Artem     | Pashynskyi | 123 abc Dr | Rockville   | Maryland |   20852 | United States |
      | Busara    | Mamat      | 123 abc Dr | Oakton      | Virginia |   22124 | United States |
      | Naseer    | Shinwari   | 123 abc Dr | Springfield | Virginia |   22152 | United States |
      | Denys     | Yavorskyi  | 123 abc Dr | Alexandria  | Virginia |   22304 | United States |

  Scenario Outline: Adding a new Address using Maps
    Given I logged into abantecart
    When I am at the manage address book page
    When I add a new address using maps:
      | firstname | <firstname> |
      | lastname  | <lastname>  |
      | address   | <address>   |
      | city      | <city>      |
      | state     | <state>     |
      | zipcode   | <zipcode>   |
      | country   | <country>   |
    Then I should be able to see the information for "<firstname> <lastname>"

    Examples: 
      | firstname | lastname | address    | city        | state    | zipcode | country       |
      | Rohan     | Verma    | 225 ert Dr | Rockville   | Maryland |   20852 | United States |
      | Pasha     | Naseerov | 589 rfv Dr | Oakton      | Virginia |   22124 | United States |
      | Radika    | Gupta    | 896 tre Dr | Springfield | Virginia |   22152 | United States |
      | Rajash    | Kumar    | 236 iop Dr | Alexandria  | Virginia |   22304 | United States |
      | Abdul     | Sarin    | 147 plm Dr | Alexandria  | Virginia |   22304 | United States |
