package com.example.stepdefinitions;

import com.example.matchers.TextMatcher;
import com.example.navigation.NavigateTo;
import com.example.search.SearchFor;
import com.example.search.SearchResult;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchOnDuckDuckGoStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Given("^(?:.*) is on the DuckDuckGo home page")
    public void i_am_on_the_DuckDuckGo_home_page() {
        navigateTo.theDuckDuckGoHomePage();
    }

    @When("^s?he (?:searches|has searched) for \"(.*)\"")
    public void i_search_for(String term) {
        searchFor.term(term);
    }

    @Then("all the result titles should contain the word {string}")
    public void all_the_result_titles_should_contain_the_word(String expectedTerm) {
        assertThat(searchResult.titles())
                .allMatch(title -> TextMatcher.textOf(title).containsIgnoringCase(expectedTerm));
    }
}
