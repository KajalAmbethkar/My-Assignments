Feature: New Opportunity
Scenario: Create a new Opportunity
And Enter UserName as kajal.ambethkar@Testleaf.test
And Enter Password as Kajal@123
When Click Login
Then Verify Home Page
And Click on toggle menu button from the left corner
And Click view All 
And Click Sales from App Launcher
Then Click Opportunity
Then Click on New button 
And Enter Opportunity name as Salesforce Automation by Kajal
And Choose close date as Today 
And Select Stage as Need Analysis
When Click on save
Then VerifyOppurtunity Name
