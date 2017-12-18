Narrative:
In order to assert that the basic functionality of https://www.disasterassistance.gov/es/ is working
As a tester
I want to run the daily regressions at least twice a day

Meta:

Scenario: (Spanish) Verify the main links on homepage to assert that the Spanish pages open correctly
Meta: @skip 
@category daily 
                          
Given I am on the Spanish Disaster Assistance homepage
When I click on <mainLinksItem> within the main links bar
Then the <mainLinksItem> page should open correctly

Examples:
|mainLinksItem|
|encontrar ayuda|
|solicitar asistencia|
|revisar estatus|

Scenario: (Spanish) Verify states in the Spanish declared disaster map are clickable
Meta:  
@category daily 
                               
Given I am on the Spanish Disaster Assistance homepage
When I am viewing the declared disaster map
Then states with disasters should be clickable