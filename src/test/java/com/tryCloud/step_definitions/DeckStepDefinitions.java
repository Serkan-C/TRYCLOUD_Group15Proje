package com.tryCloud.step_definitions;

import com.tryCloud.pages.DeckPage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DeckStepDefinitions {

    DeckPage deckPage = new DeckPage();

    @When("user clicks on the Decks icon")
    public void user_clicks_on_the_decks_icon() {
        deckPage.decksIcon.click();
    }

    @When("user clicks on the app-deck navigation button")
    public void user_clicks_on_the_app_deck_navigation_button() {
        deckPage.app_deck_navigation_button.click();
    }

    @When("user clicks on add board and write a {string}")
    public void user_clicks_on_add_board_and_write_a(String string) {
        deckPage.addBoardButton.click();
        deckPage.inputAddBoard.sendKeys(string);
    }

    @When("user clicks on confirm button")
    public void user_clicks_on_confirm_button() {
        deckPage.confirmButton.click();
    }

    @Then("{string} should be displayed under All boards")
    public void should_be_displayed_under_all_boards(String string) {
        WebElement board = Driver.getDriver().findElement(By.xpath("//*[@title=\'"+string+"\']"));
        System.out.println("current WebElement = " + board.getAttribute("title"));
        Assert.assertTrue(board.isDisplayed());

    }
}
