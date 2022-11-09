package com.tryCloud.step_definitions;

import com.tryCloud.pages.DeckPage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    @When("{string} is selected")
    public void is_selected(String string) {
        WebElement board = Driver.getDriver().findElement(By.xpath("//*[@title=\'"+string+"\']"));
        System.out.println("current WebElement = " + board.getAttribute("title"));
        board.click();
        System.out.println("current boardTitle = " + deckPage.boardTitle.getText());

    }
    @When("user clicks on add list button and write a {string}")
    public void user_clicks_on_add_list_button_and_write_a(String string) {
        deckPage.addListButton.click();
        deckPage.inputAddList.sendKeys(string);
    }
    @When("user clicks on confirm add list button")
    public void user_clicks_on_confirm_add_list_button() {
        deckPage.confirmAddListButton.click();
    }
    @Then("{string} should be displayed on the selected {string}")
    public void should_be_displayed_on_the_selected(String string, String string2) {
        try {
            String xpath1="//h3[contains(text(),\'"+string+"\')]";
            Driver.getDriver().findElement(By.xpath(xpath1));
//            Driver.getDriver().findElement(By.xpath("//h3[contains(text(),'list1')]"));

        }catch (NoSuchElementException e){
            Assert.assertTrue(false);
            return;
        }
        Assert.assertTrue(true);

    }

}
