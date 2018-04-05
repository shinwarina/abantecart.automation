Feature: Writing Reviews

  @Bahor
  Scenario: Writing review with 5 star
    Given I logged into abantecart
    And I go to order history and choose item "Waterproof Protective Undereye Concealer"
    When I go to Reviews and rate 5 star
    And I fill out name "Bahora" and your review "the item was great, thanks "
    And Get the captcha and fill out input box with and submit

  @Bahor
  Scenario: Writing review with 1 star
    Given I logged into abantecart
    And I go to order history and choose item "Jersey Cotton Striped Polo Shirt"
    When I go to Reviews and rate 1 star
    And I fill out name "Julia" and your review "the item was great, thanks "
    And Get the captcha and fill out input box with and submit
