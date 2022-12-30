Feature: Create Lead
#Background:
#Given Launch the Chrome Browser
#And Enter the URL and Maximize
#@Regression
#Scenario Outline: Verify the lead is created.
Scenario:
And Enter the username as DemoSalesManager
And Enter the password as crmsfa
When Click on the login button
Then Verify the homepage is displayed.
Then Click on CRM
And Click on Leads
And Click on Create Lead
And Enter the Company Name Feild as TestLeaf
And Enter the First Name as Kajal
And Enter the Last Name as ambethkar
And Enter the local first name as kaja
And Enter the department as Software
And Enter the description as I am a Software Engineer
And Enter your email as kajalambethkar1990@gmail.com
And Select State
When Click the Create Button
Then Get the page title of the resulting page
Then Get the company number
#Examples:
#|UserName|Password|CompanyName|firstName|lastName|local|depart|descrip|ema|
#|DemoSalesManager|crmsfa|TestLeaf|Kajal|Ambethkar|kaj|Software|I am a Software Engineer|kajalambethkar1990@gmail.com|



