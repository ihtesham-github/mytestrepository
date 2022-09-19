
Feature: FB Sign In

 

  @tag1
  Scenario Outline: FB Sign In validation
    Given I visit FB homepage
    When I type "<username>" and "<pw>" and click log in
    Then I am able to sign in FB

    Examples: 
      | username  | pw|
      | karim@yahoo.com|Abcxyz | 
      | rahim@yahoo.com| Xyzabc| 
			|bashir@yahoo.com| abcdd|