Feature: User able to Login and Logout from ShopRite Application #MyPlan

@Sanity 
Scenario: User able to login in to shoprite application with valid username and verify on the grid.

	Given User able to open any browsers.
	And   User able enter "https://www.shoprite.com/sm/planning/rsid/218/" URL
	When  user able to click sign in button One
	And   User able to enter username  
	And   User able to enter password 
	When  User able to  click login in button Two
	Then  User able to verify the user information "at ShopRite of Brooklyn" on the UI and Logout
	 
	