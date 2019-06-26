package com.autobot.steps.ui;

import com.autobot.module.ui.HomePage;
import cucumber.api.java.en.Given;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class TestUiSteps {

    EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    String baseUrl = variables.getProperty(ThucydidesSystemProperty.WEBDRIVER_BASE_URL);
    String testUrl = EnvironmentSpecificConfiguration.from(variables)
            .getProperty("webdriver.base.url");

    String myCustomProperty = variables.getProperty("serenity.project.name");

    HomePage homePage;

    @Given("Open the DuckDuckGo home page")
    public void theDuckDuckGoHomePage() {

        System.out.println("base: " + baseUrl);
        System.out.println("test: " + testUrl);
        System.out.println("custom: " + myCustomProperty);
        homePage.openUrl("https://www.blibli.com");
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
