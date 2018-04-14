Feature: User Registration

  @register
  Scenario: All fields are present on the registration page
    Given I navigate to the registration page
    Then I should see "CREATE ACCOUNT"
    And all labels with their fields should be present:
      | First Name                                  |
      | Last Name                                   |
      | E-Mail                                      |
      | Telephone                                   |
      | Fax                                         |
      | Company                                     |
      | Address 1                                   |
      | Address 2                                   |
      | City                                        |
      | Region / State                              |
      | ZIP Code                                    |
      | Country                                     |
      | Login name                                  |
      | Password                                    |
      | Password Confirm                            |
      | Subscribe                                   |
      | I have read and agree to the Privacy Policy |

  @register
  Scenario: Click on Continue button without filling any fields
    Given I navigate to the registration page
    When I click on Continue
    Then I should see "Error: You must agree to the Privacy Policy!"
    And warning alert should be displayed
    And all help messages should be displayed:
      | First Name must be between 1 and 32 characters!                       |
      | Last Name must be between 1 and 32 characters!                        |
      | Email Address does not appear to be valid!                            |
      | Address 1 must be between 3 and 128 characters!                       |
      | City must be between 3 and 128 characters!                            |
      | Please select a region / state!                                       |
      | Zip/postal code must be between 3 and 10 characters!                  |
      | Login name must be alphanumeric only and between 5 and 64 characters! |
      | Password must be between 4 and 20 characters!                         |

  @register_account
  @register
  Scenario Outline: Register an account filling fields with valid credential
    Given I navigate to the registration page
    And I enter personal details:
      | firstName   | lastName   | email   | telephone   | fax   |
      | <firstName> | <lastName> | <email> | <telephone> | <fax> |
    And I enter address:
      | company   | address   | address2   | city   | state   | zipCode   | country   |
      | <company> | <address> | <address2> | <city> | <state> | <zipCode> | <country> |
    And I enter login details:
      | loginName   | password   | passwordConfirm   |
      | <loginName> | <password> | <passwordConfirm> |
    And I agree to the Privacy Policy
    When I click on Continue
    Then I should see "YOUR ACCOUNT HAS BEEN CREATED!"
    And I should see "Welcome back <firstName>"
    And all my account links should be displayed:
      | Account Dashboard    |
      | My wish list         |
      | Edit account details |
      | Change password      |
      | Manage Address Book  |
      | Order history        |
      | Transaction history  |
      | Downloads            |
      | Notifications        |
      | Logoff               |

    Examples: Fill required fields only
      | firstName | lastName  | email               | address       | city     | state       | zipCode | country       | loginName | password   | passwordConfirm |
      | Lionel    | Messi     | messi@gmail.com     | 4224 Hill Dr  | Mountain | Virginia    |   22222 | United States | messi     | messi123   | messi123        |
      | Ronaldo   | Cristiano | ronaldo@hotmail.com | 7727 River St | Ocean    | Kara        |   43322 | Togo          | ronaldo   | ronaldo123 | ronaldo123      |
      | Luis      | Suarez    | Suarez@yahoo.com    | 5223 Tree St  | Forest   | Al Buhayrat |   55555 | Sudan         | suarez    | suarez123  | suarez123       |

    Examples: Fill all the fields
      | firstName | lastName | email            | telephone  | fax        | company   | address            | address2          | city    | state    | zipCode | country     | loginName | password | passwordConfirm |
      | Indiana   | Jones    | jones@mail.com   | 6673452234 | 6223341124 | hollywood | 3232 WhatIsThat Dr | 3232 IDontKnow Dr | Rock    | Ica      |   55334 | Peru        | jones     | jones123 | jones123        |
      | Bond      | James    | bond@outlook.com | 4233355334 | 7233445224 | hollywood | 4323 MyNameIs Bond | 2233 JamesBond St | Flower  | Oslo     |   44224 | Norway      | bond      | bond123  | bond123         |
      | Han       | Solo     | solo@yahoo.com   | 6112342342 | 2251355334 | hollywood | 5533 Ahhhh Dr      | 6322 Uhhhhh Ct    | Starwar | Auckland |   00000 | New Zealand | solo      | solo123  | solo123         |

  @register
  Scenario Outline: Unable to register a user if one field was not filled
    Given I navigate to the registration page
    And I enter personal details:
      | firstName   | lastName   | email   | telephone   | fax   |
      | <firstName> | <lastName> | <email> | <telephone> | <fax> |
    And I enter address:
      | company   | address   | address2   | city   | state   | zipCode   | country   |
      | <company> | <address> | <address2> | <city> | <state> | <zipCode> | <country> |
    And I enter login details:
      | loginName   | password   | passwordConfirm   |
      | <loginName> | <password> | <passwordConfirm> |
    And I agree to the Privacy Policy
    When I click on Continue
    Then warning alert should be displayed
    And I should not see "YOUR ACCOUNT HAS BEEN CREATED!"

    Examples: Leave one required field blank
      | firstName | lastName | email          | address          | city    | state    | zipCode | country               | loginName | password | passwordConfirm |
      |           | Smith    | mary@gmail.com | 1234 Maryland Dr | Herndon | Virginia |   20123 | United States         | mery      | mery123  | mery123         |
      | Mary      |          | mary@gmail.com | 1234 Maryland Dr | Herndon | Virginia |   20123 | United States         | mery      | mery123  | mery123         |
      | Mary      | Smith    |                | 1234 Maryland Dr | Herndon | Virginia |   20123 | United States         | mery      | mery123  | mery123         |
      | Mary      | Smith    | mary@gmail.com |                  | Herndon | Virginia |   20123 | United States         | mery      | mery123  | mery123         |
      | Mary      | Smith    | mary@gmail.com | 1234 Maryland Dr |         | Virginia |   20123 | United States         | mery      | mery123  | mery123         |
      | Mary      | Smith    | mary@gmail.com | 1234 Maryland Dr | Herndon |          |   20123 | United States         | mery      | mery123  | mery123         |
      | Mary      | Smith    | mary@gmail.com | 1234 Maryland Dr | Herndon | Virginia |         | United States         | mery      | mery123  | mery123         |
      | Mary      | Smith    | mary@gmail.com | 1234 Maryland Dr | Herndon | Virginia |   20123 | --- Please Select --- | mery      | mery123  | mery123         |
      | Mary      | Smith    | mary@gmail.com | 1234 Maryland Dr | Herndon | Virginia |   20123 | United States         |           | mery123  | mery123         |
      | Mary      | Smith    | mary@gmail.com | 1234 Maryland Dr | Herndon | Virginia |   20123 | United States         | mery      |          | mery123         |
      | Mary      | Smith    | mary@gmail.com | 1234 Maryland Dr | Herndon | Virginia |   20123 | United States         | mery      | mery123  |                 |
