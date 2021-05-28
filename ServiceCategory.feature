Feature: Login to the ServiceNow Application and Order a mobile through Service Catalog 

Background:

Given Launch Chrome browser
When Load URL 'https://dev103117.service-now.com/'
Then Switch to Login Page Frame
And Type Username as 'admin'
And Type Password as 'India@123'
And Click Login Button

Scenario: Create a New Mobile Order in Servicenow

When Enter Service Catalog in filter navigator
And Click Service Catalog
Then Switch to Service Catalog Frame
Then Click on Mobile
And Click Apple Iphone 6S
And Select Update Monthly allowances field as Unlimited
And Select Color field as Rose Gold
And Select Storage Field as 128Gb
Then Click Order Now Button
Then Verify the Order is Placed


