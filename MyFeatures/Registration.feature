Feature: my registration on mercury application

  Background: launch demo shop website
    Given application is launched

  @Sanity
  Scenario: user access to registration tab ob website
    Given demowebshop website is launched
    And user clicks on register btn
    When user enter proper data
    Then clicks on register btn

  @Sanity
  Scenario Outline: user access to login for registered member
    Given Registered user clicks on LogIn link
    And he provides valid  username"<uname>"
    And he provides valid password for login"<pwd>"
    When clicks on login btn for the login validation

    Examples: 
      | uname           | pwd       |
      | n@s.com         |    123478 |
      | saavi@gmail.com | saavi@123 |

  @Sanity
  Scenario: user access to search item
    Given user searches for item
    And types the item name on search tab
    When user clicks on search tab
    Then page with item information is displayed

  @Sanity
  Scenario: user access to add cart
    Given user clicks on add to cart
    And selects the required features and quantity for item
    When user clicks on add to cart btn
    Then product is succesfully added
