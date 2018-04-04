Narrative:
In order to assert that the basic functionality of https://www.disasterassistance.gov/es/ is working
As a tester
I want to run the daily regressions at least twice a day

Meta: 

Scenario: (Spanish) Homepage - Header - All the menu links on the "Get Assistance" tab
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

Scenario: (Spanish) Homepage - Header - All the menu links on the "Information" tab
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

Scenario: (Spanish) Homepage - Header - All the menu links on the "About Us" tab
Meta:
@category daily

Given I am on the Spanish Disaster Assistance homepage
When I click on the <menuLinks> in the About Us tab
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|descripción general|
|socios|

Scenario: (Spanish) Homepage - Header - All the menu links on the "Help" tab
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

Scenario: (Spanish) Homepage - Key Links - Main links on homepage to assert that the Spanish pages open correctly
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

Scenario: (Spanish) Homepage - Currently declared disasters - States in the Spanish declared disaster map are clickable
Meta:
@category daily 
                               
Given I am on the Spanish Disaster Assistance homepage
When I am viewing the declared disaster map
Then states with disasters should be clickable

Scenario: (Spanish) Homepage - Currently declared disasters - The declared states on the declared disaster map 
Meta:
@category daily 

Given I am on the Spanish Disaster Assistance homepage
When I am viewing the declared disaster map
Then states with disasters should be clickable
Then I should be able to view the list of the declared states in Spanish

Scenario: (Spanish) Homepage - Find Local Resources flows correctly in Spanish
Meta:
@category daily 
                            
Given I am on the Spanish Disaster Assistance homepage
When I am attempting to find local resources
Then information on resources should be visible

Scenario: (Spanish) News Feeds - All of the titles on the page
Meta:
@category new 

Given I am on the Spanish Disaster Assistance homepage
When I am on the Spanish News Feeds landing page node
Then all of the spanish sub-titles should show on the page

Scenario: (Spanish) Community Leaders - Results of the quick search items
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

Scenario: (Spanish) Homepage - Address Look-Up - Declared disasters 
Meta:

Given I am on the declared disasters DAC page 
When I type the declared disaster into the address look-up bar in Spanish 
Then I should get the results for the given disaster

Scenario: (Spanish) Address Look-Up - Declared disasters 
Meta:
@category daily

Given I am on the declared disasters DAC page 
When I type the declared disaster into the address look-up bar from the Address Look-Up page in Spanish
Then I should get the results for the given disaster  

Scenario: (Spanish) Find Assistance - Spanish benefits results display according to use cases
Meta: 
@category daily
                    
Given I am on the Find Assistance Spanish page
When I choose only Employment
Then I should obtain 9 results and see all the content under the accordions

Scenario: (Spanish) Find Assistance - Dynamically verify results of the questionnaire  
Meta:
@category daily 
  
Given I am on the Find Assistance Spanish page
When I fully complete the questionnaire
Then I should accumulate the same number of results as the text on the Get Results button in Spanish

Scenario: (Spanish) Find Assistance - All the functionality of the FOA questionnaire
Meta:
@category daily 

Given I am on the Find Assistance Spanish page
When I fully complete the questionnaire
Then I should be able to see all of the content in Spanish
When I click next
Then the 3 accordions should have content visible
When I click apply now in Spanish
Then the DAC page should load 

Scenario: (Spanish) News Feeds - FEMA Twitter feed is present
Meta:
@category daily 
                             
When I am on the Spanish News Feeds landing page node
When I am viewing the FEMA Twitter feed
Then the most recent tweets should be displayed

Scenario: (Spanish) Forms of Assistance - Category Type filter with the first seven types
Meta:
@category daily

Given I am on the Spanish Forms of Assistance page 
When I click on Category Type to check the first seven category types
Then 42 spanish results should appear 

Scenario: (Spanish) Forms of Assistance - Category Type filter with the next eight types
Meta:
@category daily

Given I am on the Spanish Forms of Assistance page
When I click on Category Type to check the next eight category types
Then 53 spanish results should appear

Scenario: (Spanish) Forms of Assistance - Federal Agency filter with the first seven types 
Meta:
@category daily 

Given I am on the Spanish Forms of Assistance page
When I click on Federal Agency to check the first seven federal agencies
Then 40 spanish results should appear

Scenario: (Spanish) Forms of Assistance - Federal Agency filter with the next seven types
Meta:
@category daily 

Given I am on the Spanish Forms of Assistance page
When I click on Federal Agency to check the next seven federal agencies 
Then 37 spanish results should appear

Scenario: (Spanish) Community Leaders - Type keyword into search bar
Meta:
@category daily

Given I am on the spanish Community Leaders page on Disaster Assistance
When I type a keyword into the search bar
Then the results should include the search words for that item

Scenario: (Spanish) Sitemap - All links in Sitemap point to the right page 
Meta: 
@category daily

Given I am on the spanish sitemap
When I click on a <menuLinks> within the sitemap
Then the <menuLinks> page should open correctly 

Examples:
|menuLinks|
|inicio|
|buscador de direcciónes|
|encontrar ayuda|
|solicitar asistencia|
|revisar estatus|
|formas de asistencia|
|líderes comunitarios|
|otra ayuda para recuperación|
|lista de verificación para aplicarse|
|formularios|
|canales de noticias|
|necesidades inmediatas|
|desaloje o permanezca alerta|
|reuniendo a los seres queridos|
|comida y agua en una emergencia|
|refugios de emergencia|
|emergencia médica|
|próximo paso|
|su hogar|
|su negocio o finca|
|sus finanzas, trabajo y seguro|
|su salud|
|sus documentos oficiales|
|discapacidades o necesidades funcionales y de acceso|
|adultos mayores estadounidenses|
|niños y familias|
|los recursos del desastre|
|amenaza biológica|
|amenaza química|
|sequía|
|terremoto|
|incendios|
|inundaciones|
|calor extremo|
|huracanes|
|derrumbamiento de tierra|
|radiación y incidente nuclear|
|tornados|
|tsunamis|
|volcanes|
|incendios forestales|
|tormentas invernales|
|desastres en el extranjero|
|hojas de datos|
|socios|
|preguntas Comunes|
|contáctenos|
|política de privacidad|
|accesibilidad|
|descargar plug-ins|

Scenario: (Spanish) Homepage - Footer - All the links in "Additional Links"
Meta:
@category daily

Given I am on the Spanish Disaster Assistance homepage
When I click on the <footerLinks> link under Additional Links
Then the <footerLinks> page should open correctly

Examples:
|footerLinks|
|responsibilidad|
|femaGovEs|
|gobierno usa|
|inspectorGeneral|
|privacidad|
|la aplicacion de fema|
|usa.gov negocios|
|acta no fear|
|foia|
|readyGovEs|
|cfdaGov|
|presupuesto y rendimiento|
|accesibilidad|
|dhsGovEs|
|whiteHouse|
|mapa del sitio|
|escritura simple|

Scenario: (Spanish) Homepage - USA search feeds display results
Meta: 
@category daily

Given I am on the Spanish Disaster Assistance homepage
When I type into the USA search box
Then I should be able to see results for that search