package com.autobot.steps.api;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

public class TestApiSteps {
    private String ISO_CODE_SEARCH = "http://services.groupkt.com/country/get/iso2code/";
    private Response response;

    @Given("given test '(.*)'")
    public void searchCountryByCode(String code){
        response = SerenityRest.when().get(ISO_CODE_SEARCH + code);
    }

    @When("then status")
    public void searchIsExecutedSuccesfully(){
        response.then().statusCode(200);
    }

    @Then("then country '(.*)'")
    public void iShouldFindCountry(String country){
        response.then().body("RestResponse.result.name", Matchers.is(country));
    }
}