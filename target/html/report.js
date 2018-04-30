$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/TagTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "How to Test based on Tag",
  "description": "",
  "id": "how-to-test-based-on-tag",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 31,
  "name": "This is scenario 3",
  "description": "",
  "id": "how-to-test-based-on-tag;this-is-scenario-3",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "test Three",
  "keyword": "Given "
});
formatter.match({
  "location": "Tagging.test_Three()"
});
formatter.result({
  "duration": 1211882550,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "This is scenario 7",
  "description": "",
  "id": "how-to-test-based-on-tag;this-is-scenario-7",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "test Seven",
  "keyword": "Given "
});
formatter.match({
  "location": "Tagging.test_Seven()"
});
formatter.result({
  "duration": 70034,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "This is scenario 10",
  "description": "",
  "id": "how-to-test-based-on-tag;this-is-scenario-10",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "test ten",
  "keyword": "Given "
});
formatter.match({
  "location": "Tagging.test_ten()"
});
formatter.result({
  "duration": 63394,
  "status": "passed"
});
formatter.scenario({
  "line": 59,
  "name": "This is scenario 13",
  "description": "",
  "id": "how-to-test-based-on-tag;this-is-scenario-13",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 58,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "test OneThree",
  "keyword": "Given "
});
formatter.match({
  "location": "Tagging.test_OneThree()"
});
formatter.result({
  "duration": 56148,
  "status": "passed"
});
formatter.scenario({
  "line": 68,
  "name": "This is scenario 16",
  "description": "",
  "id": "how-to-test-based-on-tag;this-is-scenario-16",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 67,
      "name": "@End2End"
    },
    {
      "line": 67,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "test OneSix",
  "keyword": "Given "
});
formatter.match({
  "location": "Tagging.test_OneSix()"
});
formatter.result({
  "duration": 68827,
  "status": "passed"
});
});