Feature: New Opportunity
Scenario: Create New Individual
And Enter UserName as kajal.ambethkar@Testleaf.test
And Enter Password as Kajal@123
When Click Login
Then Verify Home Page
And Click on toggle menu button from the left corner
And Click view All
And click Individuals from App Launcher
Then Verify the Individual
And Click on New Individual
And Enter the Last Name as Kumar
When Click Save
Then Verify the Individual