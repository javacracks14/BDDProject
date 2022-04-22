Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario Outline: Login Successful
   Given User is on Login Page
    When User Enters <USERNAME> and <PASSWORD> 
    Then User Redirects to Product Page

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
