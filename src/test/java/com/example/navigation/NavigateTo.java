package com.example.navigation;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class NavigateTo {

    EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    String baseUrl = variables.getProperty(ThucydidesSystemProperty.WEBDRIVER_BASE_URL);
    String testUrl = EnvironmentSpecificConfiguration.from(variables)
            .getProperty("homepage.url");

    String myCustomProperty = variables.getProperty("serenity.project.name");

    DuckDuckGoHomePage duckDuckGoHomePage;

    @Step("Open the DuckDuckGo home page")
    public void theDuckDuckGoHomePage() {
        System.out.println("base: " + baseUrl);
        System.out.println("test: " + testUrl);
        System.out.println("custom: " + myCustomProperty);
        duckDuckGoHomePage.openUrl("https://www.blibli.com");
    }
}