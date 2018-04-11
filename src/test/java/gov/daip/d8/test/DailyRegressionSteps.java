package gov.daip.d8.test;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import gov.daip.d8.test.exceptions.FeedException;
import gov.daip.d8.test.exceptions.LocalResourcesException;
import gov.daip.d8.test.exceptions.StateException;
import net.thucydides.core.annotations.Steps;

/*************************************************************************
 * Starting point of the program; more or less. Scenarios from the .story files
 * are matched with the annotation in this file.
 *
 * @author Chris Viqueira
 * @author Divya Sharma
 ************************************************************************/

public class DailyRegressionSteps {

	@Steps
	User user;

	/*********************************************/

	@Given("I am on the homepage")
	public void given_homepage() {
		user.home();
	}

	@When("I click the icon")
	public void click_icon() {
		user.clickIcon();
	}

	@Then("I should still be on the homepage")
	public void see_home() {
		user.seeHome();
	}

	/*********************************************/

	// Scenario: Verify all the menu links on the "Get Assistance" tab

	@Given("I am on the Disaster Assistance homepage")
	public void given_I_am_on_the_disaster_assistance_homepage() {
		// Homepage
		user.open_page("");
	}

	@Given("I am on the Spanish Disaster Assistance homepage")
	public void given_I_am_on_the_Spanish_disaster_assistance_homepage() {
		user.open_page("/es");
	}

	@When("I click on the <menuLinks> in the Get Assistance tab")
	public void click_on_menu_links_in_get_assistance_tab(@Named("menuLinks") String menuLinks) {
		user.clickGetAssistanceMenuLinks(menuLinks);
	}

	/*
	 * @When("I click on the <menuLinks> in the Spanish Get Assistance tab")
	 * public void
	 * click_on_menu_links_spanish_in_get_assistance_tab(@Named("menuLinks")
	 * String menuLinks) { user.clickSpanishGetAssistanceTab(menuLinks); }
	 */

	@Then("the <menuLinks> page should open correctly")
	public void then_the_menu_links_page_should_open_correctly(@Named("menuLinks") String menuLinks) {
		user.shouldSeePage(menuLinks);
	}

	// Scenario: Verify all the menu links on the "Information" tab
	// given see above

	@When("I click on the <menuLinks> in the Information tab")
	public void when_i_click_on_the_menu_links_in_information_tab(@Named("menuLinks") String menuLinks) {
		user.clickInfoMenuLinks(menuLinks);
	}

	// Scenario: Verify all the menu links on the "About Us" tab
	// given see above

	@When("I click on the <menuLinks> in the About Us tab")
	public void click_on_menu_links_in_about_us_tab(@Named("menuLinks") String menuLinks) {
		user.clickAboutMenuLinks(menuLinks);
	}

	// Scenario: Verify all the menu links on the "Help" tab
	// given see above

	@When("I click on the <menuLinks> in the Help tab")
	public void click_on_menu_clicks_in_help_tab(@Named("menuLinks") String menuLinks) {
		user.clickHelpMenuLinks(menuLinks);
	}

	// Scenario: Verify the main links on homepage to assert that the pages open
	// correctly
	// given see above

	@When("I click on <mainLinksItem> within the main links bar")
	public void when_I_click_on_the_main_links_within_the_main_links_bar(@Named("mainLinksItem") String mainLinksItem) {
		user.clickMainLink(mainLinksItem);
	}

	@Then("the <mainLinksItem> page should open correctly")
	public void then_the_mainlink_page_should_open_correctly(@Named("mainLinksItem") String mainLinksItem) {
		user.shouldSeePage(mainLinksItem);
	}

	// Scenario: Verify states in the declared disaster map are clickable
	// given see above

	@When("I am viewing the declared disaster map")
	public void when_I_an_viewing_the_declared_disaster_map() throws StateException {
		user.checkDisasterMap();
	}

	@Then("states with disasters should be clickable")
	public void then_states_with_disasters_should_be_clickable() throws StateException {
		user.checkStates();
	}

	// Scenario: Verify the declared states on the declared disaster map
	// given see above
	// when see above

	@Then("I should be able to view the list of the declared states")
	public void thenShouldBeAbleToViewListOfDeclaredStates() {
		user.checkDisasterState();
	}

	@Then("I should be able to view the list of the declared states in Spanish")
	public void thenShouldBeAbleToViewListOfDeclaredStatesSpanish() {
		user.checkSpanishDisasterState();
	}

	// Scenario: Verify Local Resources flows correctly
	// given see above

	@When("I am attempting to find local resources")
	public void when_I_am_attempting_to_find_local_resources() {
		user.lookUpLocation();
	}

	@Then("information on resources should be visible")
	public void then_information_on_resources_should_be_visible() throws LocalResourcesException {
		user.verifyLocalResources();
	}

	// Scenario: Verify all of the titles on the "News Feeds" landing page node
	// given see above
	// when see above

	@When("I am on the News Feeds landing page node")
	public void on_news_feeds_page() {
		user.open_page("/information/news-feeds");
	}

	@When("I am on the Spanish News Feeds landing page node")
	public void on_spanish_news_feeds_page() {
		user.open_page("/es/información/canales-de-noticias");
	}

	@Then("all of the sub-titles should show on the page")
	public void all_sub_titles_should_show_on_the_page() {
		user.shouldSeeTitle();
	}

	@Then("all of the spanish sub-titles should show on the page")
	public void all_spanish_sub_titles_should_show_on_the_page() {
		user.shouldSeeSpanishTitle();
	}

	// Scenario: Verify the results of the quick search items
	@Given("I am on the Community Leaders page on Disaster Assistance")
	public void givenOnTheCommunityLeadersPage() {
		user.onCommunityLeadersPage();
	}

	@Given("I am on the spanish Community Leaders page on Disaster Assistance")
	public void givenOnSpanishTheCommunityLeadersPage() {
		user.onSpanishCommunityLeadersPage();
	}

	@When("I click on a <quickSearch> item on the Community Leaders page")
	public void whenTypeSearchWordsForQuickSearchItems(@Named("quickSearch") String quickSearch) {
		user.clickQuickSearch(quickSearch);
	}

	@Then("the results should include the search words for that item")
	public void thenShouldIncludeSearchWords() {
		user.quickSearchResults();
	}

	// Scenario: Verify the declared disasters with Address Look-up
	@Given("I am on the declared disasters DAC page")
	public void givenOnDeclaredDisastersDACPage() {
		user.openDisasterDACPage();
	}

	@When("I type the declared disaster into the address look-up bar")
	public void whenTypeDeclaredDisasterIntoAddressLookUpBar() {
		user.declaredDisasters();
	}

	@When("I type the declared disaster into the address look-up bar in Spanish")
	public void whenTypeDeclaredDisasterIntoSpanishAddressLookUpBar() {
		user.declaredSpanishDisasters();
	}

	@Then("I should get the results for the given disaster")
	public void thenShouldGetResultsForGivenDisaster() {
		user.disasterResults();
	}

	// Scenario: Address Look-Up - Declared disasters

	@When("I type the declared disaster into the address look-up bar from the Address Look-Up page")
	public void whenTypeDeclaredDisasterIntoAddressLookUpBarFromAddressPage() {
		user.declaredDisastersPage();
	}

	@When("I type the declared disaster into the address look-up bar from the Address Look-Up page in Spanish")
	public void whenTypeDeclaredDisasterIntoAddressLookUpBarFromAddressPageSpanish() {
		user.declaredDisastersPageSpanish();
	}

	// Scenario: Verify benefits results display according to use cases
	@Given("I am on the Find Assistance page")
	public void given_I_am_on_the_Find_Assistance_page() {
		user.open_page("/get-assistance/find-assistance");
	}

	@Given("I am on the Find Assistance Spanish page")
	public void given_I_am_on_the_Find_Assistance_Spanish_page() {
		user.open_page("/es/obtener-asistencia/encontrar-ayuda");
	}

	@When("I choose only Employment")
	public void when_I_choose_only_Employment_and_expand_all_the_accordions() {
		user.getEmploymentResults();
	}

	@Then("I should obtain 9 results and see all the content under the accordions")
	public void then_I_should_obtain_9_results_and_see_all_the_content_under_the_accordions() {
		user.verifyEmploymentResultsAndVisibility();
	}

	// Scenario: Dynamically verify results of the questionnaire on the "Find
	// Assistance" page
	// given see above

	@When("I fully complete the questionnaire")
	public void when_i_fully_complete_the_questionnaire() {
		user.completeQuestionnaire();
	}

	@Then("I should accumulate the same number of results as the text on the Get Results button")
	public void then_i_should_accumulate_same_number_of_results_as_get_results_button() {
		user.checkResults();
	}

	@Then("I should accumulate the same number of results as the text on the Get Results button in Spanish")
	public void then_i_should_accumulate_same_number_of_results_as_get_results_button_spanish() {
		user.checkSpanishResults();
	}

	// Scenario: Verify all the functionality of the FOA questionnaire
	// given see above

	@Then("I should be able to see all of the content")
	public void then_i_should_be_able_to_see_all_the_content() {
		user.verifyFOAExpandedContentVisible();
	}

	@Then("I should be able to see all of the content in Spanish")
	public void then_i_should_be_able_to_see_all_the_content_spanish() {
		user.verifySpanishFOAExpandedContentVisible();
	}

	@When("I click next")
	public void when_user_clicks_next() {
		user.clicksNextFOA();
	}

	@Then("the 3 accordions should have content visible")
	public void then_the_3_accordions_expand_collapse_and_content_is_visible() {
		user.testsApplyOnlineAccordions();
	}

	@When("I click apply now")
	public void when_user_clicks_apply_online() {
		user.clicksApplyOnline();
	}

	@When("I click apply now in Spanish")
	public void when_user_clicks_apply_online_spanish() {
		user.clicksSpanishApplyOnline();
	}

	@Then("the DAC page should load")
	public void then_DAC_page_should_load() {
		user.shouldSeeDAC();
	}

	// Scenario: Verify that the FEMA Twitter feed is present on the homepage
	@Given("I am on the News Feed page")
	public void given_i_am_on_the_news_feeds_page() {
		user.open_page("/information/news-feeds");
	}

	@When("I am viewing the FEMA Twitter feed")
	public void when_i_am_viewing_the_fema_twitter_feed() throws FeedException {
		user.checkTwitterFeedBlock();
	}

	@Then("the most recent tweets should be displayed")
	public void then_the_most_recent_tweets_should_be_displayed() throws FeedException {
		user.checkTwitterFeed();
	}

	// Scenario: Verify the Category Type filter on the Forms of Assistance page
	@Given("I am on the Forms of Assistance page")
	public void given_I_am_on_the_forms_of_assistance_page() {
		user.open_page("/get-assistance/by-category-or-agency");
	}

	@Given("I am on the Spanish Forms of Assistance page")
	public void given_I_am_on_spanish_FOA_page() {
		user.open_page("/es/obtener-asistencia/por-categoría-o-agencia");
	}

	@When("I click on Category Type to check the first seven category types")
	public void when_I_click_category_types_and_check_first_seven() {
		user.clickCategoryType();
	}

	@Then("42 results should appear")
	public void then_these_results_should_appear() {
		user.get42Results();
	}

	@Then("42 spanish results should appear")
	public void then_these_spanish_results_should_appear() {
		user.get42SpanishResults();
	}

	@When("I click on Category Type to check the next eight category types")
	public void when_I_check_next_eight_category_types() {
		user.clickNextCategoryType();
	}

	@Then("53 results should appear")
	public void then_other_results_should_appear() {
		user.get53Results();
	}

	@Then("53 spanish results should appear")
	public void then_other_spanish_results_should_appear() {
		user.get53SpanishResults();
	}

	// Scenario: Verify the Federal Agency filter on the Forms of Assistance
	// page
	// given see above

	@When("I click on Federal Agency to check the first seven federal agencies")
	public void when_I_click_on_federal_agency_and_check_first_seven() {
		user.clickFederalAgency();
	}

	@Then("40 results should appear")
	public void then_results_for_types_should_appear() {
		user.get40Results();
	}

	@Then("40 spanish results should appear")
	public void then_43_spanish_results_should_appear() {
		user.get40SpanishResults();
	}

	@When("I click on Federal Agency to check the next seven federal agencies")
	public void when_i_check_the_next_seven() {
		user.clickNextFederalAgency();
	}

	@Then("37 results should appear")
	public void then_next_results_should_appear() {
		user.get37Results();
	}

	@Then("37 spanish results should appear")
	public void then_38_spanish_results_should_appear() {
		user.get37SpanishResults();
	}

	// Scenario: Homepage - "Apply Online" DAC page includes mobile string

	@When("I click on Apply Online")
	public void click_Apply_Online() {
		user.clickApplyOnlineMainLink();
	}

	@Then("the DAC page with the mobile string should appear")
	public void dac_page_with_mobile_string() {
		user.getURL();
	}

	// Scenario: Homepage - "Check Status" DAC page includes mobile string

	@When("I click on Check Status")
	public void click_Check_Status() {
		user.clickCheckStatusMainLink();
	}

	// Scenario: Community Leaders - Type keyword into search bar

	@When("I type a keyword into the search bar")
	public void type_search_bar() {
		user.typeSearchBar();
	}

	// Scenario: Sitemap - All links in Sitemap point to the right page

	@Given("I am on the sitemap")
	public void on_sitemap() {
		user.open_page("/sitemap");
	}

	@Given("I am on the spanish sitemap")
	public void on_spanish_sitemap() {
		user.open_page("/es/sitemap");
	}

	@When("I click on a <menuLinks> within the sitemap")
	public void clickOnSitemapLink(@Named("menuLinks") String menuLinks) {
		user.clickSiteMap(menuLinks);
	}

	// Scenario: Homepage - Footer - All the links in "Additional Links"

	@When("I click on the <footerLinks> link under Additional Links")
	public void click_on_link_in_additional_links(@Named("footerLinks") String footerLinks) {
		user.clickGetAdditionalLinks(footerLinks);
	}

	@Then("the <footerLinks> page should open correctly")
	public void then_the_additional_link_page_should_open_correctly(@Named("footerLinks") String footerLinks) {
		user.shouldSeePage(footerLinks);
	}

	// Scenario: Verify USA search feeds within DisasterAssistance.gov

	@When("I type into the USA search box")
	public void when_type_into_USA_search() {
		user.typeIntoUSASearch();
	}

	@Then("I should be able to see results for that search")
	public void then_be_able_see_results_for_search() {
		user.USASearchResultsAppear();
	}

	// Scenario: Homepage - Apply Online - Verify the redirection from DAC when
	// RI is cancelled

	@Then("I click on cancel and I should be redirected to the correct environment")
	public void then_click_on_cancel_redirect_to_right_env() {
		user.redirectCorrectEnv();
	}

	@Then("I click on cancel and I should be redirected to the correct spanish environment")
	public void then_click_on_cancel_redirect_to_right_spanish_env() {
		user.redirectCorrectSpanishEnv();
	}
}