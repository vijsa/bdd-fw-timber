@PageObject
Feature: Automated End2End Tests 
Description: The purpose of this feature is to upload images through the FILES sections on CMS Admin


Scenario: Customer place an order by purchasing an item from search
	Given user is on Login Page 
	When he enters username as "demo@bigtreecms.org"
	And he enters password as "demo"
	Then he clicks on Login
	Then he clicks on Files
	Then he clicks on Add Images
	Then he clicks on Manual Upload