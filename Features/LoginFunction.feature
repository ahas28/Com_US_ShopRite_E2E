Feature: User able to Login and Logout from ShopRite Application #MyPlan

@Sanity 
Scenario: User able to login in to shoprite application with valid username and verify on the grid.

	Given User able to open any browsers.
	And   User able enter "https://www.shoprite.com/sm/planning/rsid/218/" URL
	When  user able to click sign in button
	And   User able to enter username  
	And   User able to enter password 
	And   User able to login in button
	Then  User able to verify the user information "ShopRite" on the UI
	And   LogOut
	