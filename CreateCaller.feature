Feature: Login to the ServiceNow Application and Create a New Caller

Background:

Given Launch Chrome browser
When Load URL 'https://dev103117.service-now.com/'
Then SwitchFrame
And Type Username as 'admin'
And Type Password as 'India@123'
And Click Login Button

Scenario Outline: Create a Caller in Servicenow

When Enter Callers in filter navigator
And press enter
Then Switch to Frame
And Click New Tab
And Enter First Name as <firstname>
And Enter Last Name as <lastname>
And Enter Email ID as <email>
And Enter Phone Number as <phonenumber>
And Enter Mobile Phone Number as <mobilephonenumber>
And Click Submit
Then Verify the Caller is Created

Examples:

|firstname|lastname|email|phonenumber|mobilephonenumber|
|Adithi|Krithi|abc@gmail.com|9123546854|9225468596|
|Krithi|Vijay|abcd@gmail.com|913256478|9254872545|
