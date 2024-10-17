Feature: Login validation
Scenario Outline: Fb Login validatiion
Given Enter  "<browser>" and "<url>"
When Enter user "<username>" and "<password>"
And Click on Login button
Then Validate the result

Examples:
|browser|url|username|password|
|chrome|https://www.facebook.com/|vijayakumar|password123|