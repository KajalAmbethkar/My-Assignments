Feature: Delete Lead
//Background:
//Given Launch the Chrome Browser
//And Enter the URL and Maximize
Scenario: Delete the Lead
And Enter the username as DemoSalesManager
And Enter the password as crmsfa
When Click on the login button
Then Verify the homepage is displayed.
Then Click on CRM
And Click on Leads
And Click on find Leads
And Click on LeadId
When Click first lead
Then Click the delete button
Then Click find Leads
And Click LeadId
#And See if the lead is present
#Then Verify the lead is deleted
