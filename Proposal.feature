Feature: Login to the ServiceNow Application and Create a New Proposal

Background:

Given Load URL 'https://dev103117.service-now.com/'
Then Switch to Login Page Frame
And Type Username as 'admin'
And Type Password as 'India@123'
And Click Login Button

Scenario Outline: Create New Proposal

When Enter Proposal in filter navigator
And Click My Proposals
Then Switch Frame
And Click New to Create New Proposal
Then Open new Proposal
And Enter the field Short Description as <shortdescription>
And Click Change Request
Then Clear the field
And Enter Description as <description>
And Click SUbmit


Examples:

|shortdescription|description|
|New Proposal submitted|Test Proposal Created|
