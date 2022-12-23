Feature: Sales Force
Scenario: Create Opportunity Without Mandatory Fields
And Enter UserName as kajal.ambethkar@Testleaf.test
And Enter Password as Kajal@123
When Click Login
Then Verify Home Page
And Click on toggle menu button from the left corner
And Click view All 
And Click Sales from App Launcher
Then Click Opportunity
Then Click on New button 
And Choose Close date as Tomorrow Date
When Click on save 
Then Verify the Alert message 