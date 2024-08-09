
@tag
Feature: Verifying login to logout functionality
The user should be able to log in, access certain features,and log out of the application

  @tag1
  Scenario: verifying the login functionality
    When the user enter valid user and password
    And click the login button
    Then user should select one product and add the product to the cart
    And click the cart icon 
    And click the checkout button
    Then the user enter firstname,lastname and pincode
    Then click the finish button
    When the user in response page click the open menu
    Then click the logout button

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
