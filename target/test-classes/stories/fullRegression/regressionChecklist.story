Narrative:
In order to assure that the basic functionality of disasterassistance.gov is working
As a tester
I want to run the daily regressions at least twice a day

Meta: 

Scenario: Homepage - Header - All the menu links on the "Get Assistance" tab
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

Scenario: Homepage - Header - All the menu links on the "Information" tab
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

Scenario: Homepage - Header - All the menu links on the "About Us" tab
Meta: 
@category daily

Given I am on the Disaster Assistance homepage
When I click on the <menuLinks> in the About Us tab
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|overview|
|partners|

Scenario: Homepage - Header - All the menu links on the "Help" tab
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

Scenario: Homepage - Key Links - Main links on homepage to assert that the pages open correctly
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

Scenario: Homepage - Currently declared disasters - States in the declared disaster map are clickable
Meta: 
@category daily 
                        
Given I am on the Disaster Assistance homepage
When I am viewing the declared disaster map
Then states with disasters should be clickable

Scenario: Homepage - Currently declared disasters - The declared states on the declared disaster map 
Meta: 
@category daily 

Given I am on the Disaster Assistance homepage
When I am viewing the declared disaster map
Then states with disasters should be clickable 
Then I should be able to view the list of the declared states

Scenario: Homepage - Find Local Resources flows correctly
Meta: 
@category daily 

Given I am on the Disaster Assistance homepage
When I am attempting to find local resources
Then information on resources should be visible

Scenario: News Feeds - All of the titles on the page
Meta: 
@category new 

When I am on the News Feeds landing page node
Then all of the sub-titles should show on the page 

Scenario: Community Leaders - Results of the quick search items  
Meta: 
@category NWD 

Given I am on the Community Leaders page on Disaster Assistance
When I click on a <quickSearch> item on the Community Leaders page
Then the results should include the search words for that item

Examples: 
|quickSearch|
|Community Preparedness|
|Disaster Recovery Resources|
|Emergency Shelter and Housing|
|How Can You Help?|
|Infrastructure, Utilities, and Other Public Assistance|

Scenario: Homepage - Address Look-Up - Declared disasters 
Meta: 
@category daily

Given I am on the declared disasters DAC page 
When I type the declared disaster into the address look-up bar 
Then I should get the results for the given disaster 

Scenario: Address Look-Up - Declared disasters 
Meta: 
@category daily

Given I am on the declared disasters DAC page 
When I type the declared disaster into the address look-up bar from the Address Look-Up page
Then I should get the results for the given disaster  

Scenario: Find Assistance - Benefits results display according to use cases
Meta: 
@category daily
                 
Given I am on the Find Assistance page
When I choose only Employment 
Then I should obtain 9 results and see all the content under the accordions

Scenario: Find Assistance - Dynamically verify results of the questionnaire 
Meta: 
@category daily 
          
Given I am on the Find Assistance page
When I fully complete the questionnaire
Then I should accumulate the same number of results as the text on the Get Results button

Scenario: Find Assistance - All the functionality of the FOA questionnaire
Meta: 
@category daily 

Given I am on the Find Assistance page
When I fully complete the questionnaire
Then I should be able to see all of the content 
When I click next
Then the 3 accordions should have content visible
When I click apply now
Then the DAC page should load 

Scenario: News Feeds - FEMA Twitter feed is present 
Meta: 
@category daily 
               
Given I am on the News Feed page
When I am viewing the FEMA Twitter feed
Then the most recent tweets should be displayed

Scenario: Forms of Assistance - Category Type filter with the first seven types
Meta: 
@category daily

Given I am on the Forms of Assistance page 
When I click on Category Type to check the first seven category types
Then 42 results should appear 

Scenario: Forms of Assistance - Category Type filter with the next eight types 
Meta: 
@category daily

Given I am on the Forms of Assistance page 
When I click on Category Type to check the next eight category types
Then 53 results should appear

Scenario: Forms of Assistance - Federal Agency filter with the first seven types 
Meta: 
@category daily 

Given I am on the Forms of Assistance page 
When I click on Federal Agency to check the first seven federal agencies
Then 40 results should appear

Scenario: Forms of Assistance - Federal Agency filter with the next seven types 
Meta: 
@category daily 

Given I am on the Forms of Assistance page 
When I click on Federal Agency to check the next seven federal agencies 
Then 37 results should appear

Scenario: Homepage - "Apply Online" DAC page includes mobile flag 
Meta: @skip
@category daily 

Given I am on the Disaster Assistance homepage 
When I click on Apply Online
Then the DAC page with the mobile string should appear    

Scenario: Homepage - "Check Status" DAC page includes mobile flag
Meta: @skip
@category daily 

Given I am on the Disaster Assistance homepage 
When I click on Check Status
Then the DAC page with the mobile string should appear 

Scenario: Community Leaders - Type keyword into search bar
Meta:
@category daily

Given I am on the Community Leaders page on Disaster Assistance
When I type a keyword into the search bar
Then the results should include the search words for that item

Scenario: Sitemap - All links in Sitemap point to the right page 
Meta: 
@category daily

Given I am on the sitemap
When I click on a <menuLinks> within the sitemap
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|home|
|address look-up|
|find assistance|
|apply online|
|check your status|
|forms of assistance|
|community leaders|
|other recovery help|
|application checklist|
|forms|
|news feeds|
|immediate needs|
|evacuate or stay put|
|gathering up loved ones|
|emergency food and water|
|emergency shelter|
|emergency medical|
|moving forward|
|your home|
|your business or farm|
|your finances, job, and insurance|
|your health|
|your official documents|
|disabilities or access and functional needs|
|older americans|
|children and families|
|disaster types|
|biological threat|
|chemical threat|
|drought|
|earthquake|
|fire|
|flood|
|heat|
|hurricane|
|landslide|
|radiation and nuclear|
|tornado|
|tsunami|
|volcano|
|wildfires|
|winter storm|
|foreign disasters|
|fact sheets|
|partners|
|faqs|
|contact us|
|privacy policy|
|accessibility|
|download plug-ins|

Scenario: Homepage - Footer - All the links in "Additional Links"
Meta:
@category daily

Given I am on the Disaster Assistance homepage
When I click on the <footerLinks> link under Additional Links
Then the <footerLinks> page should open correctly

Examples:
|footerLinks|
|accountability|
|femaGov|
|usaGov|
|inspectorGeneral|
|privacy|
|femaMobileApp|
|usaGovBus|
|noFearAct|
|foia|
|readyGov|
|cfdaGov|
|budgetPerformance|
|accessibilityFooter|
|dhsGov|
|whiteHouse|
|siteMap|
|plainWriting|

Scenario: Homepage - USA search feeds display results
Meta: 
@category daily

Given I am on the Disaster Assistance homepage
When I type into the USA search box
Then I should be able to see results for that search

Scenario: Homepage - Apply Online - Verify the redirection from DAC when RI is cancelled
Meta: 

Given I am on the Disaster Assistance homepage
When I click on <mainLinksItem> within the main links bar
Then I click on cancel and I should be redirected to the correct environment

Examples:
|mainLinksItem|
|apply online|