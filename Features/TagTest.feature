#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: How to Test based on Tag

@SmokeTest
Scenario: This is scenario 1
Given test One

@RegressionTest
Scenario: This is scenario 2
Given test Two

@End2End
Scenario: This is scenario 3
Given test Three

@SmokeTest
Scenario: This is scenario 4
Given test Four
@RegressionTest
Scenario: This is scenario 6
Given test Six
@End2End
Scenario: This is scenario 7
Given test Seven
@SmokeTest
Scenario: This is scenario 8
Given test Eight
@RegressionTest
Scenario: This is scenario 9
Given test Nine
@End2End
Scenario: This is scenario 10
Given test ten
@SmokeTest
Scenario: This is scenario 11
Given test Eleven
@RegressionTest
Scenario: This is scenario 12
Given test OneTwo
@End2End
Scenario: This is scenario 13
Given test OneThree
@SmokeTest
Scenario: This is scenario 14
Given test OneFour
@RegressionTest @End2End
Scenario: This is scenario 15
Given test OneFive
@End2End @SmokeTest
Scenario: This is scenario 16
Given test OneSix
@RegressionTest @End2End
Scenario: This is scenario 17
Given test OneSeven