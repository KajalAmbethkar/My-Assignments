Feature: Create Lead
//Background:
//Given Launch the Chrome Browser
//And Enter the URL and Maximize
//@Regression
Scenario Outline: Verify the lead is created.
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
Then Get the page title of the resulting page
Then Get the company number
Examples:
|UserName|Password|CompanyName|firstName|lastName|local|depart|descrip|ema|
|DemoCsr|crmsfa|TestLeaf|Kajal|Ambethkar|kaj|Software|I am a Software Engineer|kajalambethkar1990@gmail.com|



