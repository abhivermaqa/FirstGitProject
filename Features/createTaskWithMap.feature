Feature: Deal data creation

  Scenario: Free CRM create a new deal with multiple dataset
    Given Open the browser
    And enter the URL
    Then verify the page title
    Then user enters username and password
      | username     | password      |
      | abhishek_015 | abhi@verma123 |
    Then click on login button
    Then user on home page
    Then user moves to deal page
    Then user enter deals details
      | Title      | Completion | Description |
      | Deal Test1 |         20 | Test1       |
      | Deal Test2 |         30 | Test2       |
      | Deal Test3 |         40 | Test3       |
      | Deal Test4 |         50 | Test4       |
    Then close the browser
