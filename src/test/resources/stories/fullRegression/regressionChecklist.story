Narrative:
In order to assure that the basic functionality of disasterassistance.gov is working
As a tester
I want to run the daily regressions at least twice a day

Meta: @skip

Scenario: Verify the main links on homepage to assert that the pages open correctly
Meta: @skip
@category daily 

Given I am on the Disaster Assistance homepage
When I click on <mainLinksItem> within the main links bar
Then the <mainLinksItem> page should open correctly

Examples:
|mainLinksItem|
|find assistance|
|apply online|
|check status|

Scenario: Verify states in the declared disaster map are clickable
Meta: @skip
@category daily 
                        
Given I am on the Disaster Assistance homepage
When I am viewing the declared disaster map
Then states with disasters should be clickable

Scenario: Verify the declared states on the declared disaster map 
Meta: @skip
@category daily 

Given I am on the Disaster Assistance homepage
When I am viewing the declared disaster map
Then states with disasters should be clickable 
Then I should be able to view the list of the declared states

Scenario: Verify Local Resources flows correctly
Meta: @skip
@category daily 

Given I am on the Disaster Assistance homepage
When I am attempting to find local resources
Then information on resources should be visible

Scenario: Verify all of the titles on the "News Feeds" landing page node
Meta: @skip 
@category new 

When I am on the News Feeds landing page node
Then all of the sub-titles should show on the page 

Scenario: Verify the results of the quick search items 
Meta: @skip
@category NWD 

Given I am on the Community Leaders page on Disaster Assistance
When I click on a <quickSearch> item on the Community Leaders page
Then the results should include the search words for that item

Examples: 
|quickSearch|
|Community Preparedness|
|Emergency Shelter and Housing|
|How Can You Help?|
|Infrastructure, Utilities, and Other Public Assistance|

Scenario: Verify the declared disasters with Address Look-up
Meta: @skip

Given I am on the declared disasters DAC page 
When I type the declared disaster into the address look-up bar 
Then I should get the results for the given disaster

Scenario: Verify benefits results display according to use cases
Meta: @skip
@category daily
                 
Given I am on the Find Assistance page
When I choose only Employment 
Then I should obtain 9 results and see all the content under the accordions

Scenario: Dynamically verify results of the questionnaire on the "Find Assistance" page 
Meta: @skip   
@category daily 
          
Given I am on the Find Assistance page
When I fully complete the questionnaire
Then I should accumulate the same number of results as the text on the Get Results button

Scenario: Verify that the FEMA Twitter feed is present on the News Feeds page
Meta: @skip 
@category daily 
               
Given I am on the News Feed page
When I am viewing the FEMA Twitter feed
Then the most recent tweets should be displayed