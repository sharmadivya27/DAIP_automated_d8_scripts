Narrative:
In order to assert that the basic functionality of https://www.disasterassistance.gov/es/ is working
As a tester
I want to run the daily regressions at least twice a day

Meta: 

Scenario: (Spanish) Verify all the menu links on the "Get Assistance" tab
Meta: 
@category daily

Given I am on the Spanish Disaster Assistance homepage
When I click on the <menuLinks> in the Get Assistance tab
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|buscador de direcciónes|
|encontrar ayuda|
|solicitar asistencia|
|revisar estatus|
|formas de asistencia|
|otra ayuda para recuperación|
|líderes comunitarios|
|lista de verificación para aplicarse|
|formularios|

Scenario: (Spanish) Verify all the menu links on the "Information" tab
Meta:
@category daily

Given I am on the Spanish Disaster Assistance homepage
When I click on the <menuLinks> in the Information tab
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|canales de noticias|
|necesidades inmediatas|
|próximo paso|
|discapacidades o necesidades funcionales y de acceso|
|adultos mayores estadounidenses|
|niños y familias|
|los recursos del desastre|
|desastres en el extranjero|
|hojas de datos|

Scenario: (Spanish) Verify all the menu links on the "About Us" tab
Meta:
@category daily

Given I am on the Spanish Disaster Assistance homepage
When I click on the <menuLinks> in the About Us tab
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|descripción general|
|socios|

Scenario: (Spanish) Verify all the menu links on the "Help" tab
Meta:  
@category daily

Given I am on the Spanish Disaster Assistance homepage 
When I click on the <menuLinks> in the Help tab
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|preguntas comunes|
|contáctenos|
|política de privacidad|
|accesibilidad|
|descargar plug-ins|

Scenario: (Spanish) Verify the main links on homepage to assert that the Spanish pages open correctly
Meta: 
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

Scenario: (Spanish) Verify the declared states on the declared disaster map 
Meta:
@category daily 

Given I am on the Spanish Disaster Assistance homepage
When I am viewing the declared disaster map
Then states with disasters should be clickable
Then I should be able to view the list of the declared states in Spanish

Scenario: (Spanish) Verify Local Resources flows correctly on the Spanish homepage
Meta:
@category daily 
                            
Given I am on the Spanish Disaster Assistance homepage
When I am attempting to find local resources
Then information on resources should be visible

Scenario: (Spanish) Verify all of the titles on the "News Feeds" landing page node
Meta:
@category new 

Given I am on the Spanish Disaster Assistance homepage
When I am on the Spanish News Feeds landing page node
Then all of the spanish sub-titles should show on the page

Scenario: (Spanish) Verify the results of the quick search items 
Meta:
@category NWD 

Given I am on the spanish Community Leaders page on Disaster Assistance
When I click on a <quickSearch> item on the Community Leaders page
Then the results should include the search words for that item

Examples:
|quickSearch|
|Infraestructura, servicios públicos y otra asistencia pública|
|Preparación para la comunidad|
|Recursos para recuperación de desastre|
|Viviendas y refugios de emergencia|
|¿Como puede ayudar?|

Scenario: (Spanish) Verify the declared disasters with Address Look-up
Meta: 

Given I am on the declared disasters DAC page 
When I type the declared disaster into the address look-up bar in Spanish 
Then I should get the results for the given disaster

Scenario: (Spanish) Verify Spanish benefits results display according to use cases
Meta:
@category daily
                    
Given I am on the Find Assistance Spanish page
When I choose only Employment
Then I should obtain 9 results and see all the content under the accordions

Scenario: (Spanish) Dynamically verify results of the questionnaire on the "Find Assistance" page 
Meta:
@category daily 
  
Given I am on the Find Assistance Spanish page
When I fully complete the questionnaire
Then I should accumulate the same number of results as the text on the Get Results button

Scenario: (Spanish) Verify all the functionality of the FOA questionnaire
Meta:
@category daily 

Given I am on the Find Assistance Spanish page
When I fully complete the questionnaire
Then I should be able to see all of the content 
And the next and back buttons are displayed
When I click next
Then the 3 accordions should have content visible
When I click apply now
Then the DAC page should load 

Scenario: (Spanish) Verify that the FEMA Twitter feed is present on the Spanish homepage
Meta:
@category daily 
                             
When I am on the Spanish News Feeds landing page node
When I am viewing the FEMA Twitter feed
Then the most recent tweets should be displayed

Scenario: (Spanish) Verify the Category Type filter with the first seven types on the Forms of Assistance page
Meta: 
@category daily

Given I am on the Spanish Forms of Assistance page 
When I click on Category Type to check the first seven category types
Then 90 spanish results should appear 

Scenario: (Spanish) Verify the Category Type filter with the next eight types on the Forms of Assistance page
Meta: 
@category daily

Given I am on the Spanish Forms of Assistance page
When I click on Category Type to check the next eight category types
Then 112 spanish results should appear

Scenario: (Spanish) Verify the Federal Agency filter on the Forms of Assistance page 
Meta:
@category daily 

Given I am on the Spanish Forms of Assistance page
When I click on Federal Agency to check the first seven federal agencies
Then 43 spanish results should appear

Scenario: (Spanish) Verify the Federal Agency filter with the next seven types on the Forms of Assistance page 
Meta:
@category daily 

Given I am on the Spanish Forms of Assistance page
When I click on Federal Agency to check the next seven federal agencies 
Then 38 spanish results should appear