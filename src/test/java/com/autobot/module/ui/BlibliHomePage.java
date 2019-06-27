package com.autobot.module.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BlibliHomePage extends PageObject {

    @FindBy(xpath = "//input[@placeholder='Apa yang Anda cari hari ini?']")
    WebElementFacade searchBox;

    @FindBy(xpath = "//button[@id='gdn-search-button']")
    WebElementFacade searchButton;

    public void typeSearchBox(String keyword) {
        waitFor(searchBox);
        searchBox.type(keyword);
    }

    public void clickSearchButton() {
        waitFor(searchButton);
        searchButton.click();
    }
}
