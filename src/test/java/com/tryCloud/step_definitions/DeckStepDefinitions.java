package com.tryCloud.step_definitions;

import com.tryCloud.pages.DeckPage;
import com.tryCloud.utilities.ButtonGenerator;
import com.tryCloud.utilities.DeckButtonGenerator;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class DeckStepDefinitions {

    DeckPage deckPage = new DeckPage();

    @And("user clicks on {string} button")
    public void user_clicks_on_button(String string) {
        DeckButtonGenerator.click_the_button(string);
    }
    @And("write a {string} into the new board input box")
    public void writeAIntoTheNewBoardInputBox(String string) {
        deckPage.inputAddBoard.sendKeys(string);
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
    @And("write a {string} into the new list input box")
    public void writeAIntoTheNewListInputBox(String string) {
        deckPage.inputAddList.sendKeys(string);
    }
    @Then("{string} should be displayed on the selected {string}")
    public void should_be_displayed_on_the_selected(String string, String string2) {
        try {
            String xpath="//h3[contains(text(),\'"+string+"\')]";
            Driver.getDriver().findElement(By.xpath(xpath));

        }catch (NoSuchElementException e){
            Assert.assertTrue(false);
            return;
        }
        Assert.assertTrue(true);

    }

    @And("user clicks on add card button next to {string}")
    public void userClicksOnAddCardButtonNextTo(String arg0) {
Driver.getDriver().findElement(By.xpath("//*[text()='"+arg0+"']/..//*[text()='Add card']"));
    }
}
