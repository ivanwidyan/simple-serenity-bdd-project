package com.autobot.steps.ui;

import com.autobot.module.ui.BlibliHomePage;
import com.autobot.module.utils.Utility;
import cucumber.api.java.en.Given;

public class BlibliHomePageSteps {

    BlibliHomePage blibliHomePage;

    @Given("open the Blibli home page")
    public void open_the_Blibli_home_page() {
        System.out.println("config: " + Utility.getConfig("webdriver.base.url"));
        System.out.println("property: " + Utility.getProperty("serenity.project.name"));
        blibliHomePage.openUrl(Utility.getConfig("web.homepage.url"));
    }

    @Given("at blibli home page fill '(.*)' in search box")
    public void at_blibli_home_page_fill_keyword_in_search_box(String keyword) {
        blibliHomePage.typeSearchBox(keyword);
    }

    @Given("at blibli home page click search button")
    public void at_blibli_home_page_click_search_button() {
        blibliHomePage.clickSearchButton();
    }

    /*@Given("^(?:.*) is on the DuckDuckGo home page")
    public void i_am_on_the_DuckDuckGo_home_page() {
        navigateTo.theDuckDuckGoHomePage();
    }

    @When("^s?he (?:searches|has searched) for \"(.*)\"")
    public void i_search_for(String term) {
        searchFor.term(term);
    }*/
}
