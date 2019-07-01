package com.autobot.steps.api;

import com.autobot.module.utils.Utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestApiSteps extends ScenarioSteps {

    // TODO: Implement get TestApiData using @Autowired
    // TODO: Add PUT, DELETE, POST test cases

    @Given("test api set id to '(.*)'")
    public void test_api_set_id_to (int value) {
        TestApiData.id = value;
    }

    @When("send get single user request")
    public void send_get_single_user_request(){
        TestApiData.getSingleUserResponse = SerenityRest.get(
                Utility.getConfig("api.test.url") +
                        "/api/users/" + TestApiData.id);
    }

    @Then("get single user response status code should be '(.*)'")
    public void get_single_user_response_status_code_should_be (int statusCode){
        TestApiData.getSingleUserResponse.then().statusCode(statusCode);
    }

    @Then("get single user response id should be equals with request")
    public void get_single_user_response_status_code_should_be_equals_with_request(){
        TestApiData.getSingleUserResponse.body().prettyPrint();
        TestApiData.getSingleUserResponse.then().body("data.id", equalTo(TestApiData.id));
    }
}