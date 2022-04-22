#@tag
#Feature: Login Functionality of SwagLabs
#  I want check whether the login page is working successfully or not
#
#  @tag1
#  Scenario: Login Successful
#   Given User is on Login Page
#    When User Enters USERNAME and PASSWORD 
#    Then User Redirects to Product Page

#Feature: Add to Cart Functionality
#	
#Background: User should be Logged In
#	Given User is on Login Page
#  When User Enters USERNAME and PASSWORD 
#  Then User Redirects to Product Page
#	
#	Scenario: Product Added to Cart
#	Given User is on Product Page
#	When User Clicks on Add to Cart Button
#	Then Product is Added
#	When User Open the Cart To Check Product
#	Then Product is Displayed

Feature: Login Functionality of SwagLabs
  I want check whether the login page is working successfully or not

  Scenario Outline: Login Successful
   Given User is on Login Page
    When User Enters <USERNAME> and <PASSWORD> 
    Then User Redirects to Product Page
    Examples: 
    |	USERNAME				|	PASSWORD			|
    | standard_user		| secret_sauce	|
    |	locked_out_user	| secret_sauce	|
    
	