Feature: Edit Lead
Scenario: Edit the lead created
And Enter the username as DemoSalesManager
And Enter the password as crmsfa
When Click on the login button
Then Verify the homepage is displayed.
Then Click on CRM
And Click on Leads
And Click on find Leads
And Enter First Name as Kajal
Then Click Lead
Then Click first lead
Then Click Edit Lead Button
Then Clear Comapny 
Then Edit Company Name as TestLeaf
When Click Submit Button
Then Verify Edit Name