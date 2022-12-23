Feature: Sales Force
Scenario: Create a Account
And Enter UserName as kajal.ambethkar@Testleaf.test
And Enter Password as Kajal@123
When Click Login
Then Verify Home Page
And Click on toggle menu button from the left corner
And Click view All 
And Click on Accounts tab 
And Click on New button for accounts
Then Enter Account Name as Kajal 
And Select Ownership as Public
And Save the Account
Then Verify the account