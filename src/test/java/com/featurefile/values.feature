

Feature: Shop online and validate the same

  
    Scenario: user login to application
    Given launch the application
    When user enters the "standard_user" in the username field
    And user enters the "secret_sauce" in the password field and clicks the login button
    
    Scenario: Navigates to sauce lab website and come back to product page
    Given user clicks on menu
    When User clicks on about
    And User validates the sauce labs page
    Then User validates the Products page
    
    Scenario: User add the product and checkout
    Given User selects the product with highest price
    When user goes to cart page
    And user verifies the cart page
    Then User checkout and validates the page
    
    Scenario: User fills personal details
    Given User enters "vishnu" in Firstname  and "priya " in last name
    When user enters "624005" as pincode
    And user clicks continue button
    Then validates the checkout page and total price
    
    
 
 

