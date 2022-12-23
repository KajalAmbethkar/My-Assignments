Feature: New Opportunity
Scenario: CreateNewDashboard
And Enter UserName as kajal.ambethkar@Testleaf.test
And Enter Password as Kajal@123
When Click Login
Then Verify Home Page
And Click on toggle menu button from the left corner
And Click view All
And click Dashboards from App Launcher
And Click on the New Dashboard option 
And Enter Name as Sales Force Automation by Kajal 
When Click on Create Button
And Click on Save
Then Verify the Dashboard Name
