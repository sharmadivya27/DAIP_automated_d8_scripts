Narrative:
In order to assure that the basic functionality of disasterassistance.gov is working
As a tester
I want to run the daily regressions at least twice a day

Meta: 

Scenario: Verify all the menu links on the "Get Assistance" tab
Meta: 
@category daily

Given I am on the Disaster Assistance homepage
When I click on the <menuLinks> in the Get Assistance tab
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|address look-up|
|find assistance|
|apply online|
|check your status|
|forms of assistance| 
|community leaders|
|other recovery help|
|application checklist| 
|forms|

Scenario: Verify all the menu links on the "Information" tab
Meta: 
@category daily

Given I am on the Disaster Assistance homepage
When I click on the <menuLinks> in the Information tab
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|news feeds|
|immediate needs| 
|moving forward|
|disabilities or access and functional needs|
|older americans|
|children and families|
|disaster types|
|foreign disasters|
|fact sheets|

Scenario: Verify all the menu links on the "About Us" tab
Meta: 
@category daily

Given I am on the Disaster Assistance homepage
When I click on the <menuLinks> in the About Us tab
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|overview|
|partners|

Scenario: Verify all the menu links on the "Help" tab
Meta: 
@category daily

Given I am on the Disaster Assistance homepage 
When I click on the <menuLinks> in the Help tab
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|faqs|
|contact us|
|privacy policy|
|accessibility|
|download plug-ins|

Scenario: Verify the main links on homepage to assert that the pages open correctly
Meta: 
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
Meta: 
@category daily 
                        
Given I am on the Disaster Assistance homepage
When I am viewing the declared disaster map
Then states with disasters should be clickable

Scenario: Verify the declared states on the declared disaster map 
Meta:  
@category daily 

Given I am on the Disaster Assistance homepage
When I am viewing the declared disaster map
Then states with disasters should be clickable 
Then I should be able to view the list of the declared states

Scenario: Verify Local Resources flows correctly
Meta: 
@category daily 

Given I am on the Disaster Assistance homepage
When I am attempting to find local resources
Then information on resources should be visible

Scenario: Verify all of the titles on the "News Feeds" landing page node
Meta: 
@category new 

When I am on the News Feeds landing page node
Then all of the sub-titles should show on the page 

Scenario: Verify the results of the quick search items 
Meta: 
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
Meta: 

Given I am on the declared disasters DAC page 
When I type the declared disaster into the address look-up bar 
Then I should get the results for the given disaster

Scenario: Verify benefits results display according to use cases
Meta: 
@category daily
                 
Given I am on the Find Assistance page
When I choose only Employment 
Then I should obtain 9 results and see all the content under the accordions

Scenario: Dynamically verify results of the questionnaire on the "Find Assistance" page 
Meta: 
@category daily 
          
Given I am on the Find Assistance page
When I fully complete the questionnaire
Then I should accumulate the same number of results as the text on the Get Results button

Scenario: Verify all the functionality of the FOA questionnaire
Meta:  
@category daily 

Given I am on the Find Assistance page
When I fully complete the questionnaire
Then I should be able to see all of the content 
And the next and back buttons are displayed
When I click next
Then the 3 accordions should have content visible
When I click apply now
Then the DAC page should load 

Scenario: Verify that the FEMA Twitter feed is present on the News Feeds page
Meta:  
@category daily 
               
Given I am on the News Feed page
When I am viewing the FEMA Twitter feed
Then the most recent tweets should be displayed

Scenario: Verify the Category Type filter with the first seven types on the Forms of Assistance page
Meta: 
@category daily

Given I am on the Forms of Assistance page 
When I click on Category Type to check the first seven category types
Then 45 results should appear 

Scenario: Verify the Category Type filter with the next eight types on the Forms of Assistance page
Meta: 
@category daily

Given I am on the Forms of Assistance page 
When I click on Category Type to check the next eight category types
Then 56 results should appear

Scenario: Verify the Federal Agency filter on the Forms of Assistance page 
Meta: 
@category daily 

Given I am on the Forms of Assistance page 
When I click on Federal Agency to check the first seven federal agencies
Then 43 results should appear

Scenario: Verify the Federal Agency filter with the next seven types on the Forms of Assistance page 
Meta: 
@category daily 

Given I am on the Forms of Assistance page 
When I click on Federal Agency to check the next seven federal agencies 
Then 38 results should appear