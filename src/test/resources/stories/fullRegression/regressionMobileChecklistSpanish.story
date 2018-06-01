Narrative:
In order to assure that the basic functionality of disasterassistance.gov is working
As a tester
I want to run the daily regressions at least twice a day

Meta: @mobile


Scenario:  (Mobile) Community Leaders - Results of the quick search items
Meta: @skip @broken
@category NWD

Given I am on the spanish Community Leaders page on Disaster Assistance
When I click on a <quickSearch> item on the Community Leaders page (mobile)
Then the results should include the search words for that item

Examples:
|quickSearch|
|Infraestructura, servicios públicos y otra asistencia pública|
|Preparación para la comunidad|
|Recursos para recuperación de desastre|
|Viviendas y refugios de emergencia|
|¿Como puede ayudar?|

Scenario: (Mobile) Community Leaders - Type keyword into search bar
Meta:  @passed
@category daily

Given I am on the spanish Community Leaders page on Disaster Assistance
When I type a keyword into the search bar (mobile)
Then the results should include the search words for that item

Scenario: (Mobile) Forms of Assistance - Federal Agency filter with the next seven types
Meta:  @passed
@category daily

Given I am on the Spanish Forms of Assistance page
When I click on Federal Agency to check the next seven federal agencies (mobile)
Then 37 spanish results should appear (mobile)


Scenario: (Mobile) Forms of Assistance - Federal Agency filter with the first seven types
Meta:  @passed
@category daily

Given I am on the Spanish Forms of Assistance page
When I click on Federal Agency to check the first seven federal agencies (mobile)
Then 40 spanish results should appear (mobile)


Scenario: (Mobile) Forms of Assistance - Category Type filter with the next eight types
Meta:  @passed
@category daily

Given I am on the Spanish Forms of Assistance page
When I click on Category Type to check the next eight category types (mobile)
Then 53 spanish results should appear (mobile)


Scenario: (Mobile) Forms of Assistance - Category Type filter with the first seven types
Meta:  @passed-ish
@category daily

Given I am on the Spanish Forms of Assistance page
When I click on Category Type to check the first seven category types (mobile)
Then 42 spanish results should appear (mobile)

Scenario: (Mobile) News Feeds - FEMA Twitter feed is present
Meta: @skip
@category daily

Given I am on the Spanish News Feed landing page node
When I am viewing the FEMA Twitter feed
Then the most recent mobile tweets should be displayed


Scenario: (Mobile) Find Assistance - All the functionality of the FOA questionnaire
Meta:  @passed
@category daily

Given I am on the Find Assistance Spanish page
When I fully complete the questionnaire
Then I should be able to see all of the content (mobile)
When I click next (mobile)
Then the 3 accordions should have content visible
When I click apply now (mobile)
Then the mobile DAC page should load



Scenario: (Mobile) Address Look-Up - Declared disasters
Meta:  @passed
@category daily

Given I am on the declared disasters DAC page
When I type the declared disaster into the address look-up bar from the Address Look-Up page in Spanish (mobile)
Then I should get the results for the given disaster (mobile)


Scenario: (Mobile) Homepage - Address Look-Up - Declared disasters
Meta:  @passed
@category daily

Given I am on the declared disasters DAC page
When I type the declared disaster into the address look-up bar in Spanish
Then I should get the results for the given disaster (mobile)



Scenario: (Mobile) Homepage - If I click on the nav bar spanish link, then I should go to the spanish homepage
Meta:

Given I am on the  Spanish Disaster Assistance homepage
When I click on the nav menu
Then <navLink> tab should be visible
When I click on <navLink>
Then I should still be on the mobile homepage

Examples:
|navLink|
|english|

Scenario: (Mobile) Homepage - If I click on the nav bar home link, then I should return to the homepage
Meta:  @passed

Given I am on the Spanish Disaster Assistance homepage
When I click on the nav menu
Then <navLink> tab should be visible
When I click on <navLink>
Then I should still be on the mobile homepage

Examples:
|navLink|
|inicio|

Scenario: (Mobile) Homepage - Header - All the menu links on the "Information" tab
Meta:  @passed

Given I am on the Spanish Disaster Assistance homepage
When I click on the nav menu
Then <navLink> tab should be visible
When I click on <navLink>
Then <menuLinks> should be visible in the mobile Information tab
When I click on the <menuLinks> in the mobile Information tab
Then the <menuLinks> page should open correctly

Examples:
|navLink|menuLinks|
|información|canales de noticias|
|información|necesidades inmediatas|
|información|próximo paso|
|información|discapacidades o necesidades funcionales y de acceso|
|información|adultos mayores estadounidenses|
|información|niños y familias|
|información|los recursos del desastre|
|información|desastres en el extranjero|
|información|hojas de datos|

Scenario: (Mobile) Homepage - Header - All the links in the nav bar should be visible
Meta:  @passed
@category daily

Given I am on the Spanish Disaster Assistance homepage
When I click on the nav menu
Then <navLink> tab should be visible

Examples:
|navLink|
|obtener asistencia|
|información|
|acerca de|
|ayuda|

Scenario: (Mobile) Homepage - Header - All the menu links on the "Help" tab
Meta:  @passed

Given I am on the Spanish Disaster Assistance homepage
When I click on the nav menu
Then <navLink> tab should be visible
When I click on <navLink>
Then <menuLinks> should be visible in the mobile Help tab
When I click on the <menuLinks> in the mobile Help tab
Then the <menuLinks> page should open correctly

Examples:
|navLink|menuLinks|
|ayuda|preguntas comunes|
|ayuda|contáctenos|
|ayuda|política de privacidad|
|ayuda|accesibilidad nav|
|ayuda|descargar plug-ins|

Scenario: (Mobile) Homepage - Header - All the menu links on the "About Us" tab
Meta:  @passed

Given I am on the Spanish Disaster Assistance homepage
When I click on the nav menu
Then <navLink> tab should be visible
When I click on <navLink>
Then <menuLinks> should be visible in the mobile About Us tab
When I click on the <menuLinks> in the mobile About Us tab
Then the <menuLinks> page should open correctly

Examples:
|navLink|menuLinks|
|acerca de|descripción general|
|acerca de|socios|

Scenario: (Mobile) Homepage - Header - All the menu links on the "Get Assistance" tab
Meta:  @passed

Given I am on the Spanish Disaster Assistance homepage
When I click on the nav menu
Then <navLink> tab should be visible
When I click on <navLink>
Then <menuLinks> should be visible in the mobile Get Assistance tab
When I click on the <menuLinks> in the mobile Get Assistance tab
Then the <menuLinks> page should open correctly

Examples:
|navLink|menuLinks|
|obtener asistencia|buscador de direcciónes|
|obtener asistencia|encontrar ayuda|
|obtener asistencia|solicitar asistencia|
|obtener asistencia|revisar estatus|
|obtener asistencia|formas de asistencia|
|obtener asistencia|líderes comunitarios|
|obtener asistencia|otra ayuda para recuperación|
|obtener asistencia|lista de verificación para aplicarse|
|obtener asistencia|formularios|


Scenario: Homepage - Key Links - Main links on homepage to assert that the pages open correctly
Meta:  @passed
@category daily

Given I am on the Spanish Disaster Assistance homepage
When I click on <mainLinksItem> within the main links bar
Then the <mainLinksItem> page should open correctly

Examples:
|mainLinksItem|
|encontrar ayuda|
|solicitar asistencia|
|revisar estatus|

Scenario: Homepage - Find Local Resources flows correctly
Meta:  @passed
@category daily

Given I am on the Spanish Disaster Assistance homepage
When I am attempting to find local resources
Then information on resources should be visible

Scenario: News Feeds - All of the titles on the page
Meta:  @passed
@category new

Given I am on the Spanish Disaster Assistance homepage
When I am on the Spanish News Feeds landing page node
Then all of the spanish sub-titles should show on the page


Scenario: Find Assistance - Benefits results display according to use cases
Meta:  @passed
@category daily

Given I am on the Find Assistance Spanish page
When I choose only Employment
Then I should obtain 9 results and see all the content under the accordions


Scenario: (Mobile) Find Assistance - Dynamically verify results of the questionnaire
Meta:  @passed
@category daily

Given I am on the Find Assistance Spanish page
When I fully complete the questionnaire
Then I should accumulate the same number of results as the text on the Get Results button (mobile)

Scenario: Homepage - "Apply Online" DAC page includes mobile flag
Meta:  @skip
@category daily

Given I am on the Spanish Disaster Assistance homepage
When I click on Apply Online
Then the DAC page with the mobile string should appear


Scenario: Homepage - "Check Status" DAC page includes mobile flag
Meta:  @skip
@category daily

Given I am on the Spanish Disaster Assistance homepage
When I click on Check Status
Then the DAC page with the mobile string should appear

Scenario: Sitemap - All links in Spanish Sitemap point to the right page
Meta: @skip
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

Scenario: Homepage - USA search feeds display results
Meta: @skip
@category daily

Given I am on the Disaster Assistance homepage
When I type into the USA search box
Then I should be able to see results for that search
