Feature: Verifying Welcome back menu options

  @Artem
  Scenario: Verify welcome back options are displayed
    Given I logged into abantecart
    When I hover over Welcome back menu
    Then Items should be displayed:
      | Account Dashboard    |
      | My wish list         |
      | Edit account details |
      | Change password      |
      | Manage Address Book  |
      | Order history        |
      | Transaction history  |
      | Downloads            |
      | Notifications        |
      | Not Admin? Logoff    |
