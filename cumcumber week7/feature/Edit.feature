Feature: Edit Lead
Scenario: Edit the lead created
And Enter the username as DemoCsr
And Enter the password as crmsfa
When Click on the login button
Then Verify the homepage is displayed.
Then Click on CRM
And Click on Create Lead
And Enter the Company Name Feild as TestLeaf
And Enter the First Name as Kajal
And Enter the Last Name as Ambethkar
And Enter the local first name as kaj
And Enter the department as Software
And Enter the description as I am a Software Engineer
And Enter your email as kajal@gmail.com
And Select State
When Click the Create Button
Then Click on edit button
And Clear the Description Field
And Fill ImportantNote Field with Any text as I am a Test Engineer
When Click on update button
Then Get the Title of Resulting Page