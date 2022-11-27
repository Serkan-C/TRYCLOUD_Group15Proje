package com.tryCloud.step_definitions;

import com.github.javafaker.Faker;
import com.tryCloud.pages.DeckPage;
import com.tryCloud.utilities.*;
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
        ButtonGenerator.click_the_button(string);
        BrowserUtils.sleep(1.0);

    }

    @And("write a {string} into the new board input box")
    public void writeAIntoTheNewBoardInputBox(String string) {
        deckPage.inputAddBoard.sendKeys(string);
        BrowserUtils.sleep(1.0);
    }

    @Then("{string} should be displayed under All boards")
    public void should_be_displayed_under_all_boards(String string) {
        WebElement board = Driver.getDriver().findElement(By.xpath("//*[@title=\'" + string + "\']"));
        BrowserUtils.sleep(1.0);
        Assert.assertTrue(board.isDisplayed());
        BrowserUtils.sleep(1.0);

    }

    @When("{string} is selected")
    public void is_selected(String string) {
        WebElement board = Driver.getDriver().findElement(By.xpath("//*[@title=\'" + string + "\']"));
        BrowserUtils.sleep(1.0);
        board.click();
        BrowserUtils.sleep(1.0);


    }

    @And("write a {string} into the new list input box")
    public void writeAIntoTheNewListInputBox(String string) {
        deckPage.inputAddList.sendKeys(string);
        BrowserUtils.sleep(1.0);
    }

    @Then("{string} should be displayed on the selected {string}")
    public void should_be_displayed_on_the_selected(String string, String string2) {
        try {
            String xpath = "//h3[contains(text(),\'" + string + "\')]";
            BrowserUtils.sleep(1.0);
            Driver.getDriver().findElement(By.xpath(xpath));
            BrowserUtils.sleep(1.0);

        } catch (NoSuchElementException e) {
            Assert.assertTrue(false);
            BrowserUtils.sleep(1.0);
            return;
        }
        Assert.assertTrue(true);
        BrowserUtils.sleep(1.0);


    }

    @And("user clicks on add card button next to {string} and write a {string}")
    public void userClicksOnAddCardButtonNextToAndWriteA(String arg0, String arg1) {
        String xpath1 = "//*[contains(text(),'" + arg0 + "')]/..//*[text()='Add card']/../../../..";
        BrowserUtils.sleep(1.0);
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath1));
        BrowserUtils.sleep(1.0);
        webElement.click();
        BrowserUtils.sleep(1.0);

        String xpath2 = "//*[contains(text(),'" + arg0 + "')]/../..//input[@type='text']";
        BrowserUtils.sleep(1.0);
        webElement = Driver.getDriver().findElement(By.xpath(xpath2));
        BrowserUtils.sleep(1.0);
        webElement.sendKeys(arg1);
        BrowserUtils.sleep(1.0);

    }

    @And("user clicks on confirm add card button next to the {string} input box")
    public void userClicksOnConfirmAddCardButtonNextToTheInputBox(String arg0) {
        String xpath = "//*[contains(text(),'" + arg0 + "')]/../..//input[@type='submit']";
        BrowserUtils.sleep(1.0);
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath));
        BrowserUtils.sleep(1.0);
        webElement.click();
        BrowserUtils.sleep(1.0);
    }

    @Then("{string} should be displayed under the selected {string}")
    public void shouldBeDisplayedUnderTheSelected(String arg0, String arg1) {
        String xpath0 = "//*[contains(text(),'" + arg1 + "')]/../..//*[contains(text(),'" + arg0 + "')]";
        BrowserUtils.sleep(1.0);
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        BrowserUtils.sleep(1.0);
        Assert.assertTrue(webElement.isDisplayed());
        BrowserUtils.sleep(1.0);
    }


    @And("user clicks on three dots button inside {string} under {string}")
    public void userClicksOnThreeDotsButtonInsideUnder(String arg0, String arg1) {
        String xpath0 = "//h3[contains(text(),'" + arg1 + "')]/../..//span[contains(text(),'" + arg0 + "')]/../../..//button";
        BrowserUtils.sleep(1.0);
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        BrowserUtils.sleep(1.0);
        webElement.click();
        BrowserUtils.sleep(1.0);

    }

    @Then("users icon should display inside the {string}")
    public void usersIconShouldDisplayInsideThe(String arg0) {
        String xpath0 = "//*[text()='" + arg0 + "']/../../..//img";
        BrowserUtils.sleep(1.0);
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        BrowserUtils.sleep(1.0);

        Assert.assertTrue(webElement.isDisplayed());
        BrowserUtils.sleep(1.0);

    }

    @And("user chooses {string}")
    public void userChooses(String arg0) {
        String xpath0 = "//*[@*='" + arg0 + "' and @class='name-parts']";
        BrowserUtils.sleep(1.0);
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        BrowserUtils.sleep(1.0);
        webElement.click();
        BrowserUtils.sleep(1.0);

    }


    @And("user clicks on {string} under {string}")
    public void userClicksOnUnder(String arg0, String arg1) {
        String xpath0 = "//h3[contains(text(),'" + arg1 + "')]/../..//span[contains(text(),'" + arg0 + "')]/../../..";
        BrowserUtils.sleep(1.0);
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        BrowserUtils.sleep(1.0);
        webElement.click();
        BrowserUtils.sleep(1.0);

    }

    public static String etwas;

    @And("user chooses a {string} from the tag-list")
    public void userChoosesAFromTheTagList(String arg0) {
        if (arg0.equals("tagGenerator")) {
            int randomNumber = Faker.instance().number().numberBetween(10, 49);
            BrowserUtils.sleep(1.0);
            switch (randomNumber / 10) {
                case (1):
                    etwas = "Action needed";
                    break;
                case (2):
                    etwas = "Finished";
                    break;
                case (3):
                    etwas = "Later";
                    break;
                case (4):
                    etwas = "To review";
                    break;
            }
        }
        String xpath0 = "//*[contains(@class,'multiselect__element')]//*[contains(text(),'" + etwas + "')]";
        BrowserUtils.sleep(1.0);
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        BrowserUtils.sleep(1.0);
        webElement.click();
        BrowserUtils.sleep(1.0);

    }


    @Then("{string} should display inside the {string} under {string}")
    public void shouldDisplayInsideTheUnder(String arg0, String arg1, String arg2) {
        arg0 = etwas;
        BrowserUtils.sleep(1.0);
        String xpath0 = "//*[contains(text(),'" + arg2 + "')]/../..//*[contains(text(),'" + arg1 + "')]/../../..//*[contains(text(),'" + arg0 + "')]";
        BrowserUtils.sleep(1.0);
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        BrowserUtils.sleep(1.0);
        Assert.assertTrue(webElement.isDisplayed());
        BrowserUtils.sleep(1.0);

    }

    public int numberOfExistingDecks;

    @When("Decks are existing")
    public void decksAreExisting() {
        numberOfExistingDecks = deckPage.Decks.size();
        BrowserUtils.sleep(1.0);

    }

    @Then("delete all existing decks")
    public void delete_all_existing_decks() {
        if (numberOfExistingDecks > 0) {
            for (WebElement deck : deckPage.Decks) {
                deck.click();
                BrowserUtils.sleep(1.0);
                deckPage.deleteButton.click();
                BrowserUtils.sleep(1.0);
                deckPage.deleteButtonConfirm.click();
                BrowserUtils.sleep(1.0);
            }
        }
    }

}
