package gov.daip.d8.test;

import net.thucydides.core.annotations.Step;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.Dimension;

import gov.daip.d8.test.pageObject.DAPage;
import gov.daip.d8.test.pageObject.DAHomepage;
import gov.daip.d8.test.pageObject.DALandingPage;
import gov.daip.d8.test.pageObject.DAQuestionnaire;
import gov.daip.d8.test.pageObject.DASitemapAndroid;
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

public class UserAndroid {

	DAPage dapage;
	DAHomepage daHomepage;
	DALandingPage daLanding;
	DAQuestionnaire daQues;
	DrupalPage drupalPage;
	DASitemapAndroid sitemap;

	/*********************************************/

	@Step
	public void home() {
		daHomepage.getDriver().get("https://www.disasterassistance.gov");
		//daHomepage.pause(10000);
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

	@Step
	public void seeMobileHome() {
		Assert.assertEquals("Home|",
				dapage.shouldSeeHome().replace("disasterassistance.gov", "").replaceAll("\n", "").replaceAll(" ", ""));
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
		daHomepage.pause(2000);
	}

	@Step
	public void seeSpanishMobileHome() {
		Assert.assertEquals("Home|",
				dapage.shouldSeeHome().replace("disasterassistance.gov", "").replaceAll("\n", "").replaceAll(" ", ""));
	}

	// Opens the Mobile page
	@Step
	public void open_mobile_page(String directoryPath) {
		dapage.clearCookies();
		String url = dapage.defaultUrl + directoryPath;
		if (dapage.defaultUrl.contains("staging")) {
			url += "?mobile=unL9HuS";
		}

		daHomepage.getDriver().manage().window().setSize(new Dimension(400, 784));
		daHomepage.openAt(url);
	}

	// clicks on the mobile nav menu
	@Step
	public void clickGetNavMenu() {
		daHomepage.clickNavMenu();
	}

	// (Mobile) verifies that all of the menus in nav meunu are visible
	@Step
	public void checkNavMenu(String navLink) {
		if ((navLink.equals("home")) || (navLink.equals("inicio"))) {
			Assert.assertEquals(true, daHomepage.getHomeTabVisible());
		} else if ((navLink.equals("get assistance")) || (navLink.equals("obtener asistencia"))) {
			Assert.assertEquals(true, daHomepage.getAssistanceTabVisible());
		} else if ((navLink.equals("information")) || (navLink.equals("información"))) {
			Assert.assertEquals(true, daHomepage.getInformationTabVisible());
		} else if ((navLink.equals("about us")) || (navLink.equals("acerca de"))) {
			Assert.assertEquals(true, daHomepage.getAboutUsTabVisible());
		} else if ((navLink.equals("help")) || (navLink.equals("ayuda"))) {
			Assert.assertEquals(true, daHomepage.getHelpTabVisible());
		}  else if ((navLink.equals("espanol")) || (navLink.equals("english"))) {
			Assert.assertEquals(true, daHomepage.getSpanishVisible());
		}
	}


	// (Mobile) clicks the links in the nav bar
	@Step
	public void clickGetNavMenuLinks(String navLink) {
		if ((navLink.equals("home")) || (navLink.equals("inicio"))) {
			daHomepage.clickMobileHome();
		} else if ((navLink.equals("get assistance")) || (navLink.equals("obtener asistencia"))) {
			daHomepage.clickMobileAssistance();
		} else if ((navLink.equals("information")) || (navLink.equals("información"))) {
			daHomepage.clickMobileInformation();
		} else if ((navLink.equals("about us")) || (navLink.equals("acerca de"))) {
			daHomepage.clickMobileAboutUs();
		} else if ((navLink.equals("help")) || (navLink.equals("ayuda"))) {
			daHomepage.clickMobileHelp();
		} else if ((navLink.equals("espanol")) || (navLink.equals("english"))) {
			daHomepage.clickMobileSpanish();
		}
	}

	// (Mobile) checks if all the links in the "Get Assistance" menu are visible
	@Step
	public void checkAssistanceMenuLink(String menuLink) {
		if ((menuLink.equals("address look-up")) || (menuLink.equals("buscador de direcciónes"))) {
			Assert.assertEquals(true, daHomepage.getAddressLookUpVisible());
		} else if ((menuLink.equals("find assistance")) || (menuLink.equals("encontrar ayuda"))) {
			Assert.assertEquals(true, daHomepage.getFindAssistanceVisible());
		} else if ((menuLink.equals("apply online")) || (menuLink.equals("solicitar asistencia"))) {
			Assert.assertEquals(true, daHomepage.getApplyOnlineVisible());
		} else if ((menuLink.equals("check your status")) || (menuLink.equals("revisar estatus"))) {
			Assert.assertEquals(true, daHomepage.getCheckYourStatusVisible());
		} else if ((menuLink.equals("forms of assistance")) || (menuLink.equals("formas de asistencia"))) {
			Assert.assertEquals(true, daHomepage.getFormsOfAssistanceVisible());
		} else if ((menuLink.equals("community leaders")) || (menuLink.equals("líderes comunitarios"))) {
			Assert.assertEquals(true, daHomepage.getCommunityLeadersVisible());
		} else if ((menuLink.equals("other recovery help")) || (menuLink.equals("otra ayuda para recuperación"))) {
			Assert.assertEquals(true, daHomepage.getOtherRecoveryHelpVisible());
		} else if ((menuLink.equals("application checklist")) || (menuLink.equals("lista de verificación para aplicarse"))) {
			Assert.assertEquals(true, daHomepage.getApplicationChecklistVisible());
		} else if ((menuLink.equals("forms")) || (menuLink.equals("formularios"))) {
			Assert.assertEquals(true, daHomepage.getFormsVisible());
		}
	}

	// (Mobile) clicks the links in the "Get Assistance" menu
	@Step
	public void clickGetMobileAssistanceMenuLinks(String menuLinks) {
		if ((menuLinks.equals("address look-up")) || (menuLinks.equals("buscador de direcciónes"))) {
			daHomepage.clickMobileAddressLookUp();
		} else if ((menuLinks.equals("find assistance")) || (menuLinks.equals("encontrar ayuda"))) {
			daHomepage.clickMobileFindAssistance();
		} else if ((menuLinks.equals("apply online")) || (menuLinks.equals("solicitar asistencia"))) {
			daHomepage.clickMobileApplyOnline();
		} else if ((menuLinks.equals("check your status")) || (menuLinks.equals("revisar estatus"))) {
			daHomepage.clickMobileCheckYourStatus();
		} else if ((menuLinks.equals("forms of assistance")) || (menuLinks.equals("formas de asistencia"))) {
			daHomepage.clickMobileFormsOfAssistance();
		} else if ((menuLinks.equals("community leaders")) || (menuLinks.equals("líderes comunitarios"))) {
			daHomepage.clickMobileCommunityLeaders();
		} else if ((menuLinks.equals("other recovery help")) || (menuLinks.equals("otra ayuda para recuperación"))) {
			daHomepage.clickMobileOtherRecoveryHelp();
		} else if ((menuLinks.equals("application checklist"))
				|| (menuLinks.equals("lista de verificación para aplicarse"))) {
			daHomepage.clickMobileApplicationChecklist();
		} else if ((menuLinks.equals("forms")) || (menuLinks.equals("formularios"))) {
			daHomepage.clickMobileForms();
		}
	}

	// (Mobile) checks if all the links in the "Information" menu are visible
	@Step
	public void checkInformationMenuLink(String menuLink) {
		if ((menuLink.equals("news feeds")) || (menuLink.equals("canales de noticias"))) {
			Assert.assertEquals(true, daHomepage.getNewsFeedsVisible());
		} else if ((menuLink.equals("immediate needs")) || (menuLink.equals("necesidades inmediatas"))) {
			Assert.assertEquals(true, daHomepage.getImmediateNeedsVisible());
		} else if ((menuLink.equals("moving forward")) || (menuLink.equals("próximo paso"))) {
			Assert.assertEquals(true, daHomepage.getMovingForwardVisible());
		} else if ((menuLink.equals("disabilities or access and functional needs")) || (menuLink.equals("discapacidades o necesidades funcionales y de acceso"))) {
			Assert.assertEquals(true, daHomepage.getDisabilitiesOrAccessVisible());
		} else if ((menuLink.equals("older americans")) || (menuLink.equals("adultos mayores estadounidenses"))) {
			Assert.assertEquals(true, daHomepage.getOlderAmericansVisible());
		} else if ((menuLink.equals("children and families")) || (menuLink.equals("niños y familias"))) {
			Assert.assertEquals(true, daHomepage.getChildrenAndFamiliesVisible());
		} else if ((menuLink.equals("disaster types")) || (menuLink.equals("los recursos del desastre"))) {
			Assert.assertEquals(true, daHomepage.getDisasterTypesVisible());
		} else if ((menuLink.equals("foreign disasters")) || (menuLink.equals("desastres en el extranjero"))) {
			Assert.assertEquals(true, daHomepage.getForeignDisastersVisible());
		} else if ((menuLink.equals("fact sheets")) || (menuLink.equals("hojas de datos"))) {
			Assert.assertEquals(true, daHomepage.getFactSheetsVisible());
		}
	}

	// (Mobile) clicks on the links in the "Information" tab
	@Step
	public void clickGetMobileInformationMenuLinks(String menuLink) {
		if ((menuLink.equals("news feeds")) || (menuLink.equals("canales de noticias"))) {
			daHomepage.clickMobileNewsFeeds();
		} else if ((menuLink.equals("immediate needs")) || (menuLink.equals("necesidades inmediatas"))) {
			daHomepage.clickMobileImmediateNeeds();
		} else if ((menuLink.equals("moving forward")) || (menuLink.equals("próximo paso"))) {
			daHomepage.clickMobileMovingFoward();
		} else if ((menuLink.equals("disabilities or access and functional needs")) || (menuLink.equals("discapacidades o necesidades funcionales y de acceso"))) {
			daHomepage.clickMobileDiabilitiesorAccess();
		} else if ((menuLink.equals("older americans")) || (menuLink.equals("adultos mayores estadounidenses"))) {
			daHomepage.clickMobileOlderAmericans();
		} else if ((menuLink.equals("children and families")) || (menuLink.equals("niños y familias"))) {
			daHomepage.clickMobileChildrenAndFamilies();
		} else if ((menuLink.equals("disaster types")) || (menuLink.equals("los recursos del desastre"))) {
			daHomepage.clickMobileDisasterTypes();
		} else if ((menuLink.equals("foreign disasters")) || (menuLink.equals("desastres en el extranjero"))) {
			daHomepage.clickMobileForeignDisasters();
		} else if ((menuLink.equals("fact sheets")) || (menuLink.equals("hojas de datos"))) {
			daHomepage.clickMobileFactSheets();
		}
	}


	// (Mobile) checks if all the links in the "About us" menu are visible
	@Step
	public void checkAboutUsMenuLink(String menuLink) {
		if ((menuLink.equals("overview")) || (menuLink.equals("descripción general"))) {
			Assert.assertEquals(true, daHomepage.getOverviewVisible());
		} else if ((menuLink.equals("partners")) || (menuLink.equals("socios"))) {
			Assert.assertEquals(true, daHomepage.getPartnersVisible());
		}
	}

	// (Mobile) checks if all the links in the "About us" menu are visible
	@Step
	public void clickGetMobileAboutUsMenuLink(String menuLink) {
		if ((menuLink.equals("overview")) || (menuLink.equals("descripción general"))) {
			daHomepage.clickMobileOverview();
		} else if ((menuLink.equals("partners")) || (menuLink.equals("socios"))) {
			daHomepage.clickMobilePartners();
		}
	}

	// (Mobile) checks if all the links in the "Help" menu are visible
	@Step
	public void checkHelpMenuLink(String menuLink) {
		if ((menuLink.equals("faqs")) || (menuLink.equals("preguntas comunes"))) {
			Assert.assertEquals(true, daHomepage.getFaqsVisible());
		} else if ((menuLink.equals("contact us")) || (menuLink.equals("contáctenos"))) {
			Assert.assertEquals(true, daHomepage.getContactUsVisible());
		} else if ((menuLink.equals("privacy policy")) || (menuLink.equals("política de privacidad"))) {
			Assert.assertEquals(true, daHomepage.getPrivacyPolicyVisible());
		} else if ((menuLink.equals("accessibility")) || (menuLink.equals("accesibilidad nav"))) {
			Assert.assertEquals(true, daHomepage.getAccessibilityVisible());
		} else if ((menuLink.equals("download plug-ins")) || (menuLink.equals("descargar plug-ins"))) {
			Assert.assertEquals(true, daHomepage.getDownloadPluginsVisible());
		}
	}

	// (Mobile) clicks the links in the "Help" menu
	@Step
	public void clickGetMobileHelpMenuLink(String menuLink) {
		if ((menuLink.equals("faqs")) || (menuLink.equals("preguntas comunes"))) {
			daHomepage.clickMobileFaqs();
		} else if ((menuLink.equals("contact us")) || (menuLink.equals("contáctenos"))) {
			daHomepage.clickMobileContactUs();
		} else if ((menuLink.equals("privacy policy")) || (menuLink.equals("política de privacidad"))) {
			daHomepage.clickMobilePrivacyPolicy();
		} else if ((menuLink.equals("accessibility")) || (menuLink.equals("accesibilidad nav"))) {
			daHomepage.clickMobileAccessibility();
		} else if ((menuLink.equals("download plug-ins")) || (menuLink.equals("descargar plug-ins"))) {
			daHomepage.clickMobileDownloadPlugins();
		}
	}


	@Step
	public void clickGetAssistanceMenuLinks(String menuLinks) {
		if ((menuLinks.equals("address look-up")) || (menuLinks.equals("buscador de direcciónes"))) {
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
		daHomepage.pause(3000);
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
		case "necesidades inmediatas":
		case "moving forward":
		case "immediate needs":
		case "community resources":
		case "próximo paso":
		case "disaster types":
		case "los Recursos del desastre":
		case "disabilities or access and functional needs":
		case "discapacidades o necesidades funcionales y de acceso":
		case "older americans":
		case "adultos mayores estadounidenses":
		case "children and families":
		case "niños y familias":
			// TODO: Should this assertion be done on all pages?
			// If so, delete all cases above this and move this assertion to
			// after switch
			Assert.assertEquals(expectedPageName.toLowerCase().replaceAll(" ",""), daHomepage.pullPageTitle().toLowerCase().replace("created with sketch.", "").replaceAll("\n", "").replaceAll(" ",""));
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
		case "download plug-ins":
		case "descargar plug-ins":
			Assert.assertEquals(expectedPageName.toLowerCase().replaceAll(" ",""), daHomepage.pullPageSubTitle().toLowerCase().replace("created with sketch.", "").replaceAll("\n", "").replaceAll(" ",""));
			break;
		case "accesibilidad nav":
			Assert.assertEquals(expectedPageName.toLowerCase().replaceAll(" nav", ""), daHomepage.pullPageSubTitle().toLowerCase().replace("created with sketch.", "").replaceAll("\n", ""));
			break;
		case "canales de noticias":
			Assert.assertEquals(expectedPageName.toLowerCase().replaceAll(" ", ""), daHomepage.pullPageSubTitle().toLowerCase().replaceAll("\"feeds\"", "").replaceAll(" ", "").replace("created with sketch.", "").replaceAll("\n", ""));
			break;
		case "accountability":
			Assert.assertEquals("https://www.dhs.gov/previous-performance-and-accountability-reports", dapage.processWindows());
			break;
		case "responsibilidad":
			Assert.assertEquals("https://www.dhs.gov/previous-performance-and-accountability-reports", dapage.processWindows());
			break;
		case "privacy":
			Assert.assertEquals("Privacy Policy".replaceAll("\n", "").replaceAll(" ",""), daHomepage.pullPageSubTitle().replaceAll("\n", "").replaceAll(" ",""));
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
		case "accesibilidad":
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
			Assert.assertEquals("Frequently Asked Questions (FAQs)".replaceAll(" ",""), daHomepage.pullPageSubTitle().replaceAll(" ",""));
			break;
		case "preguntas Comunes":
			Assert.assertEquals("Preguntas Comunes", daHomepage.pullPageSubTitle());
			break;
		case "preguntas comunes":
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
		case "check your status":
		case "check status":
			boolean pageVisible = (daHomepage.checkStatusPageIsDisplayed() || daHomepage.dacPageIsDisplayed());
			Assert.assertEquals(true, pageVisible);
			break;
		case "apply online":
		case "solicitar asistencia":
			boolean dacPageVisible = (daHomepage.disasterAssistanceIsDisplayed() || daHomepage.checkStatusPageIsDisplayed() || daHomepage.dacPageIsDisplayed());
			Assert.assertEquals(true, dacPageVisible);
			break;
		case "evacuate or stay put":
		case "gathering up loved ones":
		case "emergency food and water":
		case "emergency shelter":
		case "emergency medical":
		case "your home":
		case "your business or farm":
		case "your finances, job, and insurance":
		case "your health":
		case "your official documents":
		case "online resources":
		case "downloadable guides and resources":
		case "videos":
		case "biological threat":
		case "chemical threat":
		case "drought":
		case "earthquake":
		case "fire":
		case "flood":
		case "heat":
		case "hurricane":
		case "landslide":
		case "radiation and nuclear":
		case "tornado":
		case "tsunami":
		case "volcano":
		case "wildfires":
		case "winter storm":
			Assert.assertEquals(expectedPageName.toLowerCase().replaceAll(" ",""), daHomepage.pullPageSubTitle().toLowerCase().replace("created with sketch.", "").replaceAll("\n", "").replaceAll(" ",""));
			break;
		case "disabilities or access and functional needs online resources":
		case "disabilities or access and functional needs downloadable guides and resources":
		case "disabilities or access and functional needs videos":
		case "discapacidades o necesidades funcionales y de acceso y":
		case "older americans online resources":
		case "older americans downloadable guides and resources":
		case "older americans videos":
		case "adultos mayores estadounidenses ":
		case "children and families online resources":
		case "children and families downloadable guides and resources":
		case "children and families videos":
		case "niños y familias ":
			Assert.assertEquals(expectedPageName.toLowerCase().replaceAll(" ", ""), (daHomepage.pullPageTitle() + " " + (daHomepage.pullPageSubTitle())).toLowerCase().replace("created with sketch.", "").replaceAll("\n", "").replaceAll(" ",""));
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
	public void clickMobileQuickSearch(String quickSearch) {
		if ((quickSearch.equals("Community Preparedness")) || (quickSearch.equals("Preparación para la comunidad"))) {
			daLanding.clickCommunityPreparedness();
		} else if ((quickSearch.equals("Disaster Recovery Resources"))
				|| (quickSearch.equals("Recursos para recuperación de desastre"))) {
			daLanding.clickDisasterRecoveryResources();
		} else if ((quickSearch.equals("Emergency Shelter and Housing"))
				|| (quickSearch.equals("Viviendas y refugios de emergencia"))) {
			daLanding.clickEmergencyShelterHousing();
		} else if ((quickSearch.equals("How Can You Help?")) || (quickSearch.equals("¿Como puede ayudar?"))) {
			daLanding.clickMobileHowCanYouHelp();
		} else if ((quickSearch.equals("Infrastructure, Utilities, and Other Public Assistance"))
				|| (quickSearch.equals("Infraestructura, servicios públicos y otra asistencia pública"))) {
			daLanding.clickMobileInfrastructure();
		}
	}



	@Step
	public void quickSearchResults() {
		daHomepage.pause(3000);
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
	public void declaredMobileDisasterPage() {
		daHomepage.typeMobileAddressLookUpPage();
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
	public void declaredMobileDisastersPageSpanish() {
		daHomepage.typeMobileAddressLookUpPageSpanish();
	}

	@Step
	public void disasterResults() {
		Assert.assertTrue(daHomepage.disasterAppears());
	}

	@Step
	public void disasterMobileResults( ) {
		Assert.assertTrue(daHomepage.disasterMobileAppears());
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
	public void checkMobileResults() {
		daHomepage.pause(1000);
		int i = daQues.getMobileResultsVal();
		daHomepage.pause(5000);
		daQues.getMobileFOAResultsPage();
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
	public void verifyMobileFOAExpandedContentVisible() {
		int i = daQues.getMobileResultsVal();
		daHomepage.pause(5000);
		daQues.getMobileFOAResultsPage();
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
	public void clickMobileNextFOA() {
		daQues.clickMobileNextFOA();
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
	public void clickMobileApplyOnline() {
		daQues.clickMobileApplyOnline();
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
	public void shouldSeeMobileDAC() {
		daHomepage.pause(2000);
		boolean dacPageVisible = (daQues.contactUsIsDisplayed());
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
	public void checkMobileTwitterFeed() throws FeedException {
		daLanding.checkMobileTwitterFeed();
	}

	@Step
	public void clickCategoryType() {
		daLanding.clickCategoryType();
		daLanding.clickFirstCategoryTypes();
	}

	@Step
	public void clickMobileCategoryType() {
		daLanding.clickRefineSearch();
		daHomepage.pause(3000);
		daLanding.clickMobileCategoryType();
		daHomepage.pause(1000);
		daLanding.clickMobileFirstCategoryTypes();
		daHomepage.pause(7000);
	}

	@Step
	public void get42Results() {
		Assert.assertEquals("Showing 1 - 10 of 42 results View 10 50 All", daLanding.getResults());
	}

	@Step
	public void get42MobileResults() {
		Assert.assertEquals("42", daLanding.getMobileResults().replace(" Refine Search", "").replaceAll("\n", ""));
	}

	@Step
	public void get42SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 42 resultados Ver 10 50 Todos", daLanding.getResults());
	}

	@Step
	public void get42SpanishMobileResults() {
		Assert.assertEquals("42", daLanding.getMobileResults().replace(" Redefinir la Busqueda", "").replaceAll("\n", ""));
	}

	@Step
	public void clickNextCategoryType() {
		daLanding.clickCategoryType();
		daLanding.clickNextCategoryTypes();
	}

	@Step
	public void clickMobileNextCategoryType() {
		daLanding.clickRefineSearch();
		daHomepage.pause(3000);
		daLanding.clickMobileCategoryType();
		daLanding.clickMobileNextCategoryTypes();
		daHomepage.pause(7000);
	}

	@Step
	public void get53Results() {
		Assert.assertEquals("Showing 1 - 10 of 53 results View 10 50 All", daLanding.getResults());
	}

	@Step
	public void get53MobileResults() {
		Assert.assertEquals("53", daLanding.getMobileResults().replace(" Refine Search", "").replaceAll("\n", ""));
	}

	@Step
	public void get53SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 53 resultados Ver 10 50 Todos", daLanding.getResults());
	}

	@Step
	public void get53SpanishMobileResults() {
		Assert.assertEquals("53", daLanding.getMobileResults().replace(" Redefinir la Busqueda", "").replaceAll("\n", ""));
	}

	@Step
	public void clickFederalAgency() {
		daLanding.clickFederalAgency();
		daLanding.clickFirstSevenFederalAgencies();
	}

	@Step
	public void clickMobileFederalAgency() {
		daLanding.clickRefineSearch();
		daHomepage.pause(3000);
		daLanding.clickMobileFederalAgency();
		daLanding.clickMobileFirstSevenFederalAgencies();
		daHomepage.pause(7000);
	}

	@Step
	public void get40Results() {
		Assert.assertEquals("Showing 1 - 10 of 40 results View 10 50 All", daLanding.getResults());
	}

	@Step
	public void get40MobileResults() {
		Assert.assertEquals("40", daLanding.getMobileResults().replace(" Refine Search", "").replaceAll("\n", ""));
	}

	@Step
	public void get40SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 40 resultados Ver 10 50 Todos", daLanding.getResults());
	}

	@Step
	public void get40SpanishMobileResults() {
		Assert.assertEquals("40", daLanding.getMobileResults().replace(" Redefinir la Busqueda", "").replaceAll("\n", ""));
	}

	@Step
	public void clickNextFederalAgency() {
		daLanding.clickFederalAgency();
		daLanding.clickNextFederalAgencies();
	}

	@Step
	public void clickMobileNextFederalAgency() {
		daLanding.clickRefineSearch();
		daHomepage.pause(3000);
		daLanding.clickMobileFederalAgency();
		daLanding.clickMobileNextFederalAgencies();
		daHomepage.pause(7000);
	}

	@Step
	public void get37Results() {
		Assert.assertEquals("Showing 1 - 10 of 37 results View 10 50 All", daLanding.getResults());
	}

	@Step
	public void get37MobileResults() {
		daHomepage.pause(4000);
		Assert.assertEquals("37", daLanding.getMobileResults().replace(" Refine Search", "").replaceAll("\n", ""));
	}

	@Step
	public void get37SpanishResults() {
		Assert.assertEquals("Mostrando 1 - 10 de 37 resultados Ver 10 50 Todos", daLanding.getResults());
	}

	@Step
	public void get37SpanishMobileResults() {
		Assert.assertEquals("37", daLanding.getMobileResults().replace(" Redefinir la Busqueda", "").replaceAll("\n", ""));
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
	public void typeMobileSearchBar() throws AWTException {
		daLanding.typeIntoMobileSearchBar();
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
		} else if ((menuLinks.contains("disabilities or access and functional needs"))
				|| (menuLinks.contains("discapacidades o necesidades funcionales y de acceso"))) {
			if (menuLinks.contains("online resources")) {
				sitemap.clickDisabilitiesOnlineResources();
			}
			else if (menuLinks.contains("downloadable guides and resources")) {
				sitemap.clickDisabilitiesDownload();
			}
			else {
				sitemap.clickDisabilitiesVideos();
			}
		} else if ((menuLinks.contains("older americans")) || (menuLinks.equals("adultos mayores estadounidenses"))) {
			if (menuLinks.contains("online resources")) {
				sitemap.clickOlderOnlineResources();
			}
			else if (menuLinks.contains("downloadable guides and resources")) {
				sitemap.clickOlderDownload();
			}
			else {
				sitemap.clickOlderVideos();
			}
		} else if ((menuLinks.contains("children and families")) || (menuLinks.equals("niños y familias"))) {
			if (menuLinks.contains("online resources")) {
				sitemap.clickChildrenOnlineResources();
			}
			else if (menuLinks.contains("downloadable guides and resources")) {
				sitemap.clickChildrenDownload();
			}
			else {
				sitemap.clickChildrenVideos();
			}
		} else if ((menuLinks.equals("disaster types")) || (menuLinks.equals("los recursos del desastre"))) {
			sitemap.clickOverview();
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
		} else if ((footerLinks.equals("accessibilityFooter")) || (footerLinks.equals("accesibilidad"))) {
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
}
