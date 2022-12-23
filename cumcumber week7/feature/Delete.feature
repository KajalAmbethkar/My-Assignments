Feature: Delete Lead
//Background:
//Given Launch the Chrome Browser
//And Enter the URL and Maximize
Scenario Outline: Delete the Lead
And Enter the username as <UserName>
And Enter the password as <Password>
When Click on the login button
Then Verify the homepage is displayed.
Then Click on CRM
And Click on Lead
And Click on find Lead
And Click on LeadId
When Click the first lead
Then Click the delete button
Then Find Lead
And See if the lead is present
Then Verify the lead is deleted
Examples:
|UserName|Password|
|DemoCsr|crmsfa|