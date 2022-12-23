Feature: New Opportunity
//Backhground:
//Given Launch the Browser
//And Load the URL and Maximize
Scenario Outline: Positive Login
And Enter UserName as <UserName>
And Enter Password as <PassWord>
When Click Login
Then Verify Home Page
Examples:
|UserName|PassWord|
|kajal.ambethkar@Testleaf.test|Kajal@123|
Scenario: Negative Login
And Enter UserName as hari.radhakrishnan@qeagle.com
And Enter Password as Testleaf$32
When Click Login
But Verify the error message
 