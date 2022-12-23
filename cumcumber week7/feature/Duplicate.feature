Feature: Duplicate Lead
//Background:
//Given Launch the Chrome Browser
//And Enter the URL and Maximize
Scenario Outline: Duplicate Lead is created
And Enter the username as <UserName>
And Enter the password as <Password>
When Click on the login button
Then Verify the homepage is displayed.
Then Click on CRM
And Click on Create Lead
And Enter the Company Name Feild as <CompanyName>
And Enter the First Name as <firstName>
And Enter the Last Name as <lastName>
And Enter the local first name as <local>
And Enter the department as <depart>
And Enter the description as <descrip>
And Enter your email as <ema>
And Select State
When Click the Create Button
And Click on Duplicate button
And Clear the CompanyName
And Enter new CompanyName as <newName>
And Clear the FirstName Field 
And And Enter new FirstName as <firstNew>
When Click on Create Lead Button
Then Get the Title of Resulting Page

Examples:
|UserName|Password|CompanyName|firstName|lastName|local|depart|descrip|ema|newName|firstNew|
|DemoCsr|crmsfa|TestLeaf|Kajal|Ambethkar|kaj|Software|I am a Software Engineer|kajalambethkar1990@gmail.com|Accenture|KAJAL|