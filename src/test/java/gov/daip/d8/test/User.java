package gov.daip.d8.test;

import net.thucydides.core.annotations.Step;

import org.junit.Assert;

import gov.daip.d8.test.pageObject.DAPage;
import gov.daip.d8.test.pageObject.DAHomepage;
import gov.daip.d8.test.pageObject.DALandingPage;
import gov.daip.d8.test.pageObject.DAQuestionnaire;
import gov.daip.d8.test.pageObject.DASitemap;
import gov.daip.d8.test.pageObject.DrupalPage;
import gov.daip.d8.test.exceptions.LocalResourcesException;
import gov.daip.d8.test.exceptions.FeedException;
import gov.daip.d8.test.exceptions.StateException;

/*************************************************************************
 * The "user" that is performing all of the actions on the web page. Provides an
 * extra layer of abstraction so all the functions called are named to emulate
 * actions that a real user would perform.
 * 
 * @author Chris Viqueira
 * @author Divya Sharma
 ************************************************************************/

public class User {

	DAPage dapage;
	DAHomepage daHomepage;
	DALandingPage daLanding;
	DAQuestionnaire daQues;
	DrupalPage drupalPage;
	DASitemap sitemap;

	/*********************************************/

	@Step
	public void home() {
		daHomepage.getDriver().get("https://www.disasterassistance.gov");
	}

	@Step
	public void clickIcon() {
		dapage.clickIcon();
	}

	@Step
	public void seeHome() {
		Assert.assertEquals("Home | DisasterAssistance.gov | Access to Disaster Help and Resources",
				dapage.shouldSeeHome());
	}

	/*********************************************/

	@Step
	public void open_page(String directoryPath) {
		dapage.clearCookies();
		String url = dapage.defaultUrl + directoryPath;
		if (dapage.defaultUrl.contains("staging")) {
			url += "?mobile=unL9HuS";
		}

		daHomepage.openAt(url);
	}

	@Step
	public void clickGetAssistanceMenuLinks(String menuLinks) {
		if ((menuLinks.equals("address look-up")) || (menuLinks.equals("buscador de direcciones"))) {
			daHomepage.clickAddressLookUp();
		} else if ((menuLinks.equals("find assistance")) || (menuLinks.equals("encontrar ayuda"))) {
			daHomepage.clickFindAssistance();
		} else if ((menuLinks.equals("apply online")) || (menuLinks.equals("solicitar asistencia"))) {
			daHomepage.clickApplyOnline();
		} else if ((menuLinks.equals("check your status")) || (menuLinks.equals("revisar estatus"))) {
			daHomepage.clickCheckYourStatus();
		} else if ((menuLinks.equals("forms of assistance")) || (menuLinks.equals("formas de asistencia"))) {
			daHomepage.clickFormsOfAssistance();
		} else if ((menuLinks.equals("community leaders")) || (menuLinks.equals("líderes comunitarios"))) {
			daHomepage.clickCommLeaders();
		} else if ((menuLinks.equals("other recovery help")) || (menuLinks.equals("otra ayuda para recuperación"))) {
			daHomepage.clickOtherHelp();
		} else if ((menuLinks.equals("application checklist"))
				|| (menuLinks.equals("lista de verificación para aplicarse"))) {
			daHomepage.clickApplicationChecklist();
		} else if ((menuLinks.equals("forms")) || (menuLinks.equals("formularios"))) {
			daHomepage.clickForms();
		}
	}

	@Step
	public void clickInfoMenuLinks(String menuLinks) {
		if ((menuLinks.equals("news feeds")) || (menuLinks.equals("canales de noticias"))) {
			daHomepage.clickNewsFeeds();
		} else if ((menuLinks.equals("immediate needs")) || (menuLinks.equals("necesidades inmediatas"))) {
			daHomepage.clickImmediateNeeds();
		} else if ((menuLinks.equals("moving forward")) || (menuLinks.equals("próximo paso"))) {
			daHomepage.clickMovingForward();
		} else if ((menuLinks.equals("disabilities or access and functional needs"))
				|| (menuLinks.equals("discapacidades o necesidades funcionales y de acceso"))) {
			daHomepage.clickDisabilities();
		} else if ((menuLinks.equals("older americans")) || (menuLinks.equals("adultos mayores estadounidenses"))) {
			daHomepage.clickOlderAmericans();
		} else if ((menuLinks.equals("children and families")) || (menuLinks.equals("niños y familias"))) {
			daHomepage.clickChildrenAndFamilies();
		} else if ((menuLinks.equals("disaster types")) || (menuLinks.equals("los recursos del desastre"))) {
			daHomepage.clickDisasterTypes();
		} else if ((menuLinks.equals("foreign disasters")) || (menuLinks.equals("desastres en el extranjero"))) {
			daHomepage.clickForeignDisasters();
		} else if ((menuLinks.equals("fact sheets")) || (menuLinks.equals("hojas de datos"))) {
			daHomepage.clickFactSheets();
		}
	}

	@Step
	public void clickAboutMenuLinks(String menuLinks) {
		if ((menuLinks.equals("overview")) || (menuLinks.equals("descripción general"))) {
			daHomepage.clickOverview();
		} else if ((menuLinks.equals("partners")) || (menuLinks.equals("socios"))) {
			daHomepage.clickPartners();
		}
	}

	@Step
	public void clickHelpMenuLinks(String menuLinks) {
		if ((menuLinks.equals("faqs")) || (menuLinks.equals("preguntas comunes"))) {
			daHomepage.clickFaqs();
		} else if ((menuLinks.equals("contact us")) || (menuLinks.equals("contáctenos"))) {
			daHomepage.clickContactUs();
		} else if ((menuLinks.equals("privacy policy")) || (menuLinks.equals("política de privacidad"))) {
			daHomepage.clickPrivacyPolicy();
		} else if ((menuLinks.equals("accessibility")) || (menuLinks.equals("accesibilidad"))) {
			daHomepage.clickAccessibility();
		} else if ((menuLinks.equals("download plug-ins")) || (menuLinks.equals("descargar plug-ins"))) {
			daHomepage.clickDownload();
		}
	}

	@Step
	public void clickMainLink(String mainLink) {
		if ((mainLink.equals("find assistance")) || (mainLink.equals("encontrar ayuda"))) {
			daHomepage.clickAssistanceMainLink();
			daHomepage.pause(2000);
		} else if ((mainLink.equals("apply online")) || (mainLink.equals("solicitar asistencia"))) {
			daHomepage.clickApplyOnlineMainLink();
			daHomepage.pause(2000);
		} else if ((mainLink.equals("check status")) || (mainLink.equals("revisar estatus"))) {
			daHomepage.clickCheckStatusMainLink();
			daHomepage.pause(2000);
		}
	}

	/************************************************************************
	 * Runs the assertions to make sure a page is valid using simple checks such
	 * as comparing the page title.
	 *
	 * @param expectedPageName
	 *            : name of the page being tested
	 *************************************************************************/
	@Step
	public void shouldSeePage(String expectedPageName) {
		switch (expectedPageName) {
		case "get assistance":
		case "obtener asistencia":
		case "information":
		case "información":
		case "about us":
		case "acerca de":
		case "help":
		case "ayuda":
		case "community leaders":
		case "líderes comunitarios":
		case "forms of assistance":
		case "formas de asistencia":
		case "immediate needs":
		case "necesidades inmediatas":
		case "moving forward":
		case "community resources":
		case "próximo paso":
		case "disabilities or access and functional needs":
		case "discapacidades o necesidades funcionales y de acceso":
		case "older americans":
		case "adultos mayores estadounidenses":
		case "children and families":
		case "niños y familias":
		case "disaster types":
		case "los Recursos del desastre":
			// TODO: Should this assertion be done on all pages?
			// If so, delete all cases above this and move this assertion to
			// after switch
			Assert.assertEquals(expectedPageName.toLowerCase(), daHomepage.pullPageTitle().toLowerCase());
			break;

		case "other recovery help":
		case "otra ayuda para recuperación":
		case "application checklist":
		case "lista de verificación para aplicarse":
		case "forms":
		case "formularios":
		case "news feeds":
		case "canales de noticias \"feeds\"":
		case "foreign disasters":
		case "desastres en el extranjero":
		case "fact sheets":
		case "hojas de datos":
		case "overview":
		case "descripción general":
		case "partners":
		case "socios":
		case "contact us":
		case "contáctenos":
		case "privacy policy":
		case "política de privacidad":
		case "accessibility":
		case "accesibilidad":
		case "download plug-ins":
		case "descargar plug-ins":
			Assert.assertEquals(expectedPageName.toLowerCase(), daHomepage.pullPageSubTitle().toLowerCase());
			break;

		case "accountability":
			Assert.assertEquals("https://www.dhs.gov/previous-performance-and-accountability-reports",
					dapage.processWindows());
			break;
		case "responsibilidad":
			Assert.assertEquals("https://www.dhs.gov/previous-performance-and-accountability-reports",
					dapage.processWindows());
			break;
		case "privacy":
			Assert.assertEquals("Privacy Policy", daHomepage.pullPageSubTitle());
			break;
		case "privacidad":
			Assert.assertEquals("Política de Privacidad", daHomepage.pullPageSubTitle());
			break;
		case "foia":
			Assert.assertEquals("https://www.fema.gov/foia", dapage.processWindows());
			break;
		case "accessibilityFooter":
			Assert.assertEquals("https://www.fema.gov/accessibility", dapage.processWindows());
			break;
		case "accesibilidadFooter":
			Assert.assertEquals("https://www.fema.gov/es/accesibilidad-0", dapage.processWindows());
			break;
		case "plainWriting":
			Assert.assertEquals("https://www.dhs.gov/plain-writing-dhs", dapage.processWindows());
			break;
		case "escritura simple":
			Assert.assertEquals("https://www.dhs.gov/plain-writing-dhs", dapage.processWindows());
			break;
		case "femaGov":
			Assert.assertEquals("https://www.fema.gov/", dapage.processWindows());
			break;
		case "femaGovEs":
			Assert.assertEquals("https://www.fema.gov/es", dapage.processWindows());
			break;
		case "femaMobileApp":
			Assert.assertEquals("https://www.fema.gov/mobile-app", dapage.processWindows());
			break;
		case "la aplicacion de fema":
			Assert.assertEquals("https://www.fema.gov/es/aplicacion", dapage.processWindows());
			break;
		case "readyGov":
			Assert.assertEquals("https://www.ready.gov/", dapage.processWindows());
			break;
		case "readyGovEs":
			Assert.assertEquals("https://www.ready.gov/es", dapage.processWindows());
			break;
		case "dhsGov":
			Assert.assertEquals("https://www.dhs.gov/", dapage.processWindows());
			break;
		case "dhsGovEs":
			Assert.assertEquals("https://www.dhs.gov/en-esp", dapage.processWindows());
			break;
		case "usaGov":
			Assert.assertEquals("https://www.usa.gov/", dapage.processWindows());
			break;
		case "gobierno usa":
			Assert.assertEquals("https://gobierno.usa.gov/", dapage.processWindows());
			break;
		case "usaGovBus":
			Assert.assertEquals("https://www.usa.gov/business", dapage.processWindows());
			break;
		case "usa.gov negocios":
			Assert.assertEquals("https://gobierno.usa.gov/negocios-y-organizaciones-ONG", dapage.processWindows());
			break;
		case "cfdaGov":
			Assert.assertEquals("https://www.cfda.gov/", dapage.processWindows());
			break;
		case "whiteHouse":
			Assert.assertEquals("https://www.whitehouse.gov/", dapage.processWindows());
			break;
		case "inspectorGeneral":
			Assert.assertEquals("https://www.oig.dhs.gov/", dapage.processWindows());
			break;
		case "noFearAct":
			Assert.assertEquals("https://www.fema.gov/no-fear-act", dapage.processWindows());
			break;
		case "acta no fear":
			Assert.assertEquals("https://www.fema.gov/no-fear-act", dapage.processWindows());
			break;
		case "budgetPerformance":
			Assert.assertEquals("https://www.dhs.gov/budget-performance", dapage.processWindows());
			break;
		case "presupuesto y redimiento":
			Assert.assertEquals("https://www.dhs.gov/budget-performance", dapage.processWindows());
			break;
		case "siteMap":
			Assert.assertEquals("Sitemap", daHomepage.pullPageTitle());
			break;
		case "mapa del sitio":
			Assert.assertEquals("Mapa del Sitio", daHomepage.pullPageTitle());
			break;

		case "faqs":
			Assert.assertEquals("Frequently Asked Questions (FAQs)", daHomepage.pullPageSubTitle());
			break;
		case "preguntas Comunes":
			Assert.assertEquals("Preguntas Comunes", daHomepage.pullPageSubTitle());
			break;

		case "home":
		case "inicio":
		case "address look-up":
		case "buscador de direcciónes":
			Assert.assertEquals(true, daHomepage.addressLookupIsDisplayed());
			break;

		case "find assistance":
			Assert.assertEquals(true, daHomepage.questionnaireIsDisplayed());
			break;
		case "encontrar ayuda":
			Assert.assertEquals(true, daHomepage.questionnaireIsDisplayed());
			break;
		case "revisar estatus":
		case "solicitar asistencia":
		case "check your status":
		case "apply online":
			boolean dacPageVisible = (daHomepage.checkStatusPageIsDisplayed() || daHomepage.dacPageIsDisplayed());
			Assert.assertEquals(true, dacPageVisible);
			break;

		default:
			System.err.println("INVALID PAGE SENT");
			break;
		} // end switch
	}

	@Step
	public void checkDisasterMap() throws StateException {
		daHomepage.checkDisasterMap();
	}

	@Step
	public void checkStates() throws StateException {
		daHomepage.checkStates();
	}

	@Step
	public void checkDisasterState() {
		Assert.assertEquals(daHomepage.checkDisasterStatesEdit(), daHomepage.checkDisasterStates());
	}

	@Step
	public void checkSpanishDisasterState() {
		Assert.assertEquals(daHomepage.checkSpanishDisasterStatesEdit(), daHomepage.checkDisasterStates());
	}

	@Step
	public void lookUpLocation() {
		daHomepage.lookUpLocation();
	}

	@Step
	public void verifyLocalResources() throws LocalResourcesException {
		daHomepage.verifyLocalResourcesResults();
	}

	@Step
	public void shouldSeeTitle() {
		Assert.assertEquals("Severe Storms", daLanding.stormTitle());
		Assert.assertEquals("Earthquakes", daLanding.earthquakesTitle());
		Assert.assertEquals("Drought", daLanding.droughtTitle());
		Assert.assertEquals("Wildfires", daLanding.wildfireTitle());
	}

	@Step
	public void shouldSeeSpanishTitle() {
		Assert.assertEquals("Tormentas Severas (en inglés)", daLanding.stormTitle());
		Assert.assertEquals("Terremotos (en inglés)", daLanding.earthquakesTitle());
		Assert.assertEquals("Sequía (en inglés)", daLanding.droughtTitle());
		Assert.assertEquals("Incendios Forestales (en inglés)", daLanding.wildfireTitle());
	}

	@Step
	public void onCommunityLeadersPage() {
		// FIXME back to staging
		drupalPage.openAt("https://www.disasterassistance.gov/get-assistance/community-leaders/?mobile=unL9HuS");
	}

	@Step
	public void onSpanishCommunityLeadersPage() {
		// FIXME back to staging
		drupalPage.openAt(
				"https://www.disasterassistance.gov/es/obtener-asistencia/líderes-comunitarios/?mobile=unL9HuS");
	}

	@Step
	public void clickQuickSearch(String quickSearch) {
		if ((quickSearch.equals("Community Preparedness")) || (quickSearch.equals("Preparación para la comunidad"))) {
			daLanding.clickCommunityPreparedness();
		} else if ((quickSearch.equals("Disaster Recovery Resources"))
				|| (quickSearch.equals("Recursos para recuperación de desastre"))) {
			daLanding.clickDisasterRecoveryResources();
		} else if ((quickSearch.equals("Emergency Shelter and Housing"))
				|| (quickSearch.equals("Viviendas y refugios de emergencia"))) {
			daLanding.clickEmergencyShelterHousing();
		} else if ((quickSearch.equals("How Can You Help?")) || (quickSearch.equals("¿Como puede ayudar?"))) {
			daLanding.clickHowCanYouHelp();
		} else if ((quickSearch.equals("Infrastructure, Utilities, and Other Public Assistance"))
				|| (quickSearch.equals("Infraestructura, servicios públicos y otra asistencia pública"))) {
			daLanding.clickInfrastructure();
		}
	}

	@Step
	public void quickSearchResults() {
		Assert.assertTrue(daLanding.communityResults());
	}

	@Step
	public void openDisasterDACPage() {
		daHomepage.openAt("https://www.disasterassistance.gov/drupal_api/declaredStates");
	}

	@Step
	public void declaredDisasters() {
		daHomepage.typeAddressLookUp();
	}

	@Step
	public void declaredDisastersPage() {
		daHomepage.typeAddressLookUpPage();
	}

	@Step
	public void declaredSpanishDisasters() {
		daHomepage.typeSpanishAddressLookUp();
	}

	@Step
	public void declaredDisastersPageSpanish() {
		daHomepage.typeAddressLookUpPageSpanish();
	}

	@Step
	public void disasterResults() {
		Assert.assertTrue(daHomepage.disasterAppears());
	}

	@Step
	public void getEmploymentResults() {
		daQues.clickEmploymentCheckbox();
		daQues.getFOAResultsPage();
	}

	@Step
	public void verifyEmploymentResultsAndVisibility() {
		Assert.assertEquals(9, daQues.getNumQuesResults());
	}

	@Step
	public void completeQuestionnaire() {
		daQues.completeFullQuestionnaire();
		daHomepage.pause(1000);
	}

	@Step
	public void checkResults() {
		int i = daQues.getResultsVal();
		daQues.getFOAResultsPage();
		Assert.assertEquals(i, daQues.getNumQuesResults());
	}

	@Step
	public void checkSpanishResults() {
		int i = daQues.getResultsVal();
		daQues.getSpanishFOAResultsPage();
		Assert.assertEquals(i, daQues.getNumQuesResults());
	}

	@Step
	public void verifyFOAExpandedContentVisible() {
		int i = daQues.getResultsVal();
		daHomepage.pause(5000);
		daQues.getFOAResultsPage();
		Assert.assertEquals(i, daQues.getNumEmploymentResults());
	}

	@Step
	public void verifySpanishFOAExpandedContentVisible() {
		int i = daQues.getResultsVal();
		daHomepage.pause(5000);
		daQues.getSpanishFOAResultsPage();
		Assert.assertEquals(i, daQues.getNumEmploymentResults());
	}

	@Step
	public void clicksNextFOA() {
		daQues.clickNextFOA();
	}

	@Step
	public void testsApplyOnlineAccordions() {
		Assert.assertEquals(3, daQues.numApplyOnlineFOAs());
	}

	@Step
	public void clicksApplyOnline() {
		daQues.clickApplyOnline();
	}

	@Step
	public void clicksSpanishApplyOnline() {
		daQues.clickSpanishApplyOnline();
	}

	@Step
	public void shouldSeeDAC() {
		daHomepage.pause(2000);
		boolean dacPageVisible = (daQues.checkStatusPageIsDisplayed() || daQues.dacPageIsDisplayed());
		Assert.assertEquals(true, dacPageVisible);
	}

	@Step
	public void checkTwitterFeedBlock() throws FeedException {
		daLanding.checkTwitterFeedBlock();
	}

	@Step
	public void checkTwitterFeed() throws FeedException {
		daLanding.checkTwitterFeed();
	}

	@Step
	public void clickCategoryType() {
		daLanding.clickCategoryType();
		daLanding.clickFirstCategoryTypes();
	}

	@Step
	public void get42Results() {
		Assert.assertEquals("Showing 1 - 10 of 42 results View 10 50 All", daLanding.getResults());
	}

	@Step
	public void get42SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 42 resultados Ver 10 50 Todos", daLanding.getResults());
	}

	@Step
	public void clickNextCategoryType() {
		daLanding.clickCategoryType();
		daLanding.clickNextCategoryTypes();
	}

	@Step
	public void get53Results() {
		Assert.assertEquals("Showing 1 - 10 of 53 results View 10 50 All", daLanding.getResults());
	}

	@Step
	public void get53SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 53 resultados Ver 10 50 Todos", daLanding.getResults());
	}

	@Step
	public void clickFederalAgency() {
		daLanding.clickFederalAgency();
		daLanding.clickFirstSevenFederalAgencies();
	}

	@Step
	public void get40Results() {
		Assert.assertEquals("Showing 1 - 10 of 40 results View 10 50 All", daLanding.getResults());
	}

	@Step
	public void get40SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 40 resultados Ver 10 50 Todos", daLanding.getResults());
	}

	@Step
	public void clickNextFederalAgency() {
		daLanding.clickFederalAgency();
		daLanding.clickNextFederalAgencies();
	}

	@Step
	public void get37Results() {
		Assert.assertEquals("Showing 1 - 10 of 37 results View 10 50 All", daLanding.getResults());
	}

	@Step
	public void get37SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 37 resultados Ver 10 50 Todos", daLanding.getResults());
	}

	@Step
	public void clickApplyOnlineMainLink() {
		daHomepage.clickApplyOnlineMainLink();
	}

	@Step
	public void clickCheckStatusMainLink() {
		daHomepage.clickCheckStatusMainLink();
	}

	@Step
	public void getURL() {
		daHomepage.getUrl();
		Assert.assertTrue(daHomepage.URLMobileFlag());
	}

	@Step
	public void typeSearchBar() {
		daLanding.typeIntoSearchBar();
	}

	@Step
	public void clickSiteMap(String menuLinks) {
		if ((menuLinks.equals("home")) || (menuLinks.equals("inicio"))) {
			sitemap.clickOnHome();
		} else if ((menuLinks.equals("address look-up")) || (menuLinks.equals("buscador de direcciónes"))) {
			sitemap.clickAddresslookUp();
		} else if ((menuLinks.equals("find assistance")) || (menuLinks.equals("encontrar ayuda"))) {
			sitemap.clickFindAssistance();
		} else if ((menuLinks.equals("apply online")) || (menuLinks.equals("solicitar asistencia"))) {
			sitemap.clickApplyOnline();
		} else if ((menuLinks.equals("check your status")) || (menuLinks.equals("revisar estatus"))) {
			sitemap.clickCheckStatusSitemap();
		} else if ((menuLinks.equals("forms of assistance")) || (menuLinks.equals("formas de asistencia"))) {
			sitemap.clickFormsAssistance();
		} else if ((menuLinks.equals("community leaders")) || (menuLinks.equals("líderes comunitarios"))) {
			sitemap.clickCommunityLeaders();
		} else if ((menuLinks.equals("other recovery help")) || (menuLinks.equals("otra ayuda para recuperación"))) {
			sitemap.clickOtherHelp();
		} else if ((menuLinks.equals("application checklist"))
				|| (menuLinks.equals("lista de verificación para aplicarse"))) {
			sitemap.clickApplicationChecklist();
		} else if ((menuLinks.equals("forms")) || (menuLinks.equals("formularios"))) {
			sitemap.clickForms();
		} else if ((menuLinks.equals("news feeds")) || (menuLinks.equals("canales de noticias"))) {
			sitemap.clickNewsFeeds();
		} else if ((menuLinks.equals("immediate needs")) || (menuLinks.equals("necesidades inmediatas"))) {
			sitemap.clickImmediateNeeds();
		} else if ((menuLinks.equals("evacuate or stay put")) || (menuLinks.equals("desaloje o permanezca alerta"))) {
			sitemap.clickEvacuate();
		} else if ((menuLinks.equals("gathering up loved ones"))
				|| (menuLinks.equals("reuniendo a los seres queridos"))) {
			sitemap.clickLovedOnes();
		} else if ((menuLinks.equals("emergency food and water"))
				|| (menuLinks.equals("comida y agua en una emergencia"))) {
			sitemap.clickEmergencyFood();
		} else if ((menuLinks.equals("emergency shelter")) || (menuLinks.equals("refugios de emergencia"))) {
			sitemap.clickEmergencyShelter();
		} else if ((menuLinks.equals("emergency medical")) || (menuLinks.equals("emergencia médica"))) {
			sitemap.emergencyMedical();
		} else if ((menuLinks.equals("moving forward")) || (menuLinks.equals("próximo paso"))) {
			sitemap.movingForward();
		} else if ((menuLinks.equals("your home")) || (menuLinks.equals("su hogar"))) {
			sitemap.yourHome();
		} else if ((menuLinks.equals("your business or farm")) || (menuLinks.equals("su negocio o finca"))) {
			sitemap.clickBusiness();
		} else if ((menuLinks.equals("your finances, job, and insurance"))
				|| (menuLinks.equals("sus finanzas, trabajo y seguro"))) {
			sitemap.clickFinance();
		} else if ((menuLinks.equals("your health")) || (menuLinks.equals("su salud"))) {
			sitemap.clickHealth();
		} else if ((menuLinks.equals("your official documents")) || (menuLinks.equals("sus documentos oficiales"))) {
			sitemap.clickOfficialDocs();
		} else if ((menuLinks.equals("disabilities or access and functional needs"))
				|| (menuLinks.equals("discapacidades o necesidades funcionales y de acceso"))) {
			sitemap.clickDisabilities();
		} else if ((menuLinks.equals("older americans")) || (menuLinks.equals("adultos mayores estadounidenses"))) {
			sitemap.clickOlderAmericans();
		} else if ((menuLinks.equals("children and families")) || (menuLinks.equals("niños y familias"))) {
			sitemap.clickChildrenFamilies();
		} else if ((menuLinks.equals("disaster types")) || (menuLinks.equals("los recursos del desastre"))) {
			sitemap.clickDisasterTypes();
		} else if ((menuLinks.equals("biological threat")) || (menuLinks.equals("amenaza biológica"))) {
			sitemap.clickBiological();
		} else if ((menuLinks.equals("chemical threat")) || (menuLinks.equals("amenaza química"))) {
			sitemap.clickChemical();
		} else if ((menuLinks.equals("drought")) || (menuLinks.equals("sequía"))) {
			sitemap.clickDrought();
		} else if ((menuLinks.equals("earthquake")) || (menuLinks.equals("terremoto"))) {
			sitemap.clickEarthquake();
		} else if ((menuLinks.equals("fire")) || (menuLinks.equals("incendios"))) {
			sitemap.clickFire();
		} else if ((menuLinks.equals("flood")) || (menuLinks.equals("inundaciones"))) {
			sitemap.clickFlood();
		} else if ((menuLinks.equals("heat")) || (menuLinks.equals("calor extremo"))) {
			sitemap.clickHeat();
		} else if ((menuLinks.equals("hurricane")) || (menuLinks.equals("huracanes"))) {
			sitemap.clickHurricane();
		} else if ((menuLinks.equals("landslide")) || (menuLinks.equals("derrumbamiento de tierra"))) {
			sitemap.clickLandslide();
		} else if ((menuLinks.equals("radiation and nuclear")) || (menuLinks.equals("radiación y incidente nuclear"))) {
			sitemap.clickRadiation();
		} else if ((menuLinks.equals("tornado")) || (menuLinks.equals("tornados"))) {
			sitemap.clickTornado();
		} else if ((menuLinks.equals("tsunami")) || (menuLinks.equals("tsunamis"))) {
			sitemap.clickTsunami();
		} else if ((menuLinks.equals("volcano")) || (menuLinks.equals("volcanes"))) {
			sitemap.clickVolcano();
		} else if ((menuLinks.equals("wildfires")) || (menuLinks.equals("incendios forestales"))) {
			sitemap.clickWildfires();
		} else if ((menuLinks.equals("winter storm")) || (menuLinks.equals("tormentas invernales"))) {
			sitemap.clickWinterStorms();
		} else if ((menuLinks.equals("foreign disasters")) || (menuLinks.equals("desastres en el extranjero"))) {
			sitemap.clickForeignDisasters();
		} else if ((menuLinks.equals("fact sheets")) || (menuLinks.equals("hojas de datos"))) {
			sitemap.clickFactSheets();
		} else if ((menuLinks.equals("partners")) || (menuLinks.equals("socios"))) {
			sitemap.clickPartners();
		} else if ((menuLinks.equals("faqs")) || (menuLinks.equals("preguntas Comunes"))) {
			sitemap.clickFaqs();
		} else if ((menuLinks.equals("contact us")) || (menuLinks.equals("contáctenos"))) {
			sitemap.clickContactUs();
		} else if ((menuLinks.equals("privacy policy")) || (menuLinks.equals("política de privacidad"))) {
			sitemap.clickPrivacyPolicy();
		} else if ((menuLinks.equals("accessibility")) || (menuLinks.equals("accesibilidad"))) {
			sitemap.clickAccessibility();
		} else if ((menuLinks.equals("download plug-ins")) || (menuLinks.equals("descargar plug-ins"))) {
			sitemap.clickDownloadPlugIns();
		}
	}

	@Step
	public void clickGetAdditionalLinks(String footerLinks) {
		if ((footerLinks.equals("accountability")) || (footerLinks.equals("responsibilidad"))) {
			daHomepage.clickAccountability();
		} else if ((footerLinks.equals("femaGov")) || (footerLinks.equals("femaGovEs"))) {
			daHomepage.clickFemaGov();
		} else if ((footerLinks.equals("usaGov")) || (footerLinks.equals("gobierno usa"))) {
			daHomepage.clickUsaGov();
		} else if ((footerLinks.equals("inspectorGeneral"))) {
			daHomepage.clickInspectorGeneral();
		} else if ((footerLinks.equals("privacy")) || (footerLinks.equals("privacidad"))) {
			daHomepage.clickPrivacy();
		} else if ((footerLinks.equals("femaMobileApp")) || (footerLinks.equals("la aplicacion de fema"))) {
			daHomepage.clickFemaMobileApp();
		} else if ((footerLinks.equals("usaGovBus")) || (footerLinks.equals("usa.gov negocios"))) {
			daHomepage.clickUsaGovBus();
		} else if ((footerLinks.equals("noFearAct")) || (footerLinks.equals("acta no fear"))) {
			daHomepage.clickNoFearAct();
		} else if ((footerLinks.equals("foia"))) {
			daHomepage.clickFoia();
		} else if ((footerLinks.equals("readyGov")) || (footerLinks.equals("readyGovEs"))) {
			daHomepage.clickReadyGov();
		} else if ((footerLinks.equals("cfdaGov"))) {
			daHomepage.clickCfdaGov();
		} else if ((footerLinks.equals("budgetPerformance")) || (footerLinks.equals("presupuesto y rendimiento"))) {
			daHomepage.clickBudgetPerformance();
		} else if ((footerLinks.equals("accessibilityFooter")) || (footerLinks.equals("accesibilidadFooter"))) {
			daHomepage.clickAccessibilityFooter();
		} else if ((footerLinks.equals("dhsGov")) || (footerLinks.equals("dhsGovEs"))) {
			daHomepage.clickDhsGov();
		} else if ((footerLinks.equals("whiteHouse"))) {
			daHomepage.clickWhiteHouse();
		} else if ((footerLinks.equals("siteMap")) || (footerLinks.equals("mapa del sitio"))) {
			daHomepage.clickSiteMap();
		} else if ((footerLinks.equals("plainWriting")) || (footerLinks.equals("escritura simple"))) {
			daHomepage.clickPlanWriting();
		}
	}

	public void typeIntoUSASearch() {
		daHomepage.typeIntoUSASearch();
	}

	public void USASearchResultsAppear() {
		Assert.assertTrue(daHomepage.viewUSASearchResults());
	}

	public void redirectCorrectEnv() {
		daHomepage.clickCancel();
		if (daHomepage.getUrl().contains("staging")) {
			Assert.assertEquals("https://staging.disasterassistance.gov/", daHomepage.getUrl());
		} else {
			Assert.assertEquals("https://www.disasterassistance.gov/", daHomepage.getUrl());
		}
	}

	public void redirectCorrectSpanishEnv() {
		daHomepage.clickCancel();
		if (daHomepage.getUrl().contains("staging")) {
			Assert.assertEquals("https://staging.disasterassistance.gov/es", daHomepage.getUrl());
		} else {
			Assert.assertEquals("https://www.disasterassistance.gov/es", daHomepage.getUrl());
		}
	}
}