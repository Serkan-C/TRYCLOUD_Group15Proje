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
        DeckButtonGenerator.click_the_button(string);

    }

    @And("write a {string} into the new board input box")
    public void writeAIntoTheNewBoardInputBox(String string) {
        deckPage.inputAddBoard.sendKeys(string);

    }

    @Then("{string} should be displayed under All boards")
    public void should_be_displayed_under_all_boards(String string) {
        WebElement board = Driver.getDriver().findElement(By.xpath("//*[@title=\'" + string + "\']"));
        System.out.println("current WebElement = " + board.getAttribute("title"));
        Assert.assertTrue(board.isDisplayed());


    }

    @When("{string} is selected")
    public void is_selected(String string) {
        WebElement board = Driver.getDriver().findElement(By.xpath("//*[@title=\'" + string + "\']"));
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
            String xpath = "//h3[contains(text(),\'" + string + "\')]";
            Driver.getDriver().findElement(By.xpath(xpath));

        } catch (NoSuchElementException e) {
            Assert.assertTrue(false);
            return;
        }
        Assert.assertTrue(true);


    }

    @And("user clicks on add card button next to {string} and write a {string}")
    public void userClicksOnAddCardButtonNextToAndWriteA(String arg0, String arg1) {
        String xpath1="//*[contains(text(),'" + arg0 + "')]/..//*[text()='Add card']/../../../..";
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath1));
        webElement.click();

        String xpath2="//*[contains(text(),'" + arg0 + "')]/../..//input[@type='text']";
        webElement = Driver.getDriver().findElement(By.xpath(xpath2));
        webElement.sendKeys(arg1);

    }

    @And("user clicks on confirm add card button next to the {string} input box")
    public void userClicksOnConfirmAddCardButtonNextToTheInputBox(String arg0) {
        String xpath="//*[contains(text(),'" + arg0 + "')]/../..//input[@type='submit']";
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath));
        webElement.click();
    }

    @Then("{string} should be displayed under the selected {string}")
    public void shouldBeDisplayedUnderTheSelected(String arg0, String arg1) {

        String xpath0 = "//*[contains(text(),'" + arg1 + "')]/../..//*[contains(text(),'" + arg0 + "')]";
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        Assert.assertTrue(webElement.isDisplayed());

    }


    @And("user clicks on three dots button inside {string} under {string}")
    public void userClicksOnThreeDotsButtonInsideUnder(String arg0, String arg1) {
        String xpath0 = "//*[contains(text(),'" + arg1 + "')]/../..//*[contains(text(),'" + arg0 + "')]/../../..//button";
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        webElement.click();

    }

    @Then("users icon should display inside the {string}")
    public void usersIconShouldDisplayInsideThe(String arg0) {
        String xpath0 = "//*[text()='" + arg0 + "']/../../..//img";
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));

        Assert.assertTrue(webElement.isDisplayed());

    }

    @And("user chooses {string}")
    public void userChooses(String arg0) {
        String xpath0 = "//*[@*='" + arg0 + "' and @class='name-parts']";
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        webElement.click();

    }


    @And("user clicks on {string} under {string}")
    public void userClicksOnUnder(String arg0, String arg1) {
        String xpath0 = "//*[contains(text(),'" + arg1 + "')]/../..//*[contains(text(),'" + arg0 + "')]/../../..";
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        webElement.click();

    }

    public static String etwas;
    @And("user chooses a {string} from the tag-list")
    public void userChoosesAFromTheTagList(String arg0) {
        System.out.println("arg0 = " + arg0);
        if (arg0.equals("tagGenerator")) {
            int randomNumber = Faker.instance().number().numberBetween(1,4);
            System.out.println("randomNumber = " + randomNumber);
            switch (randomNumber) {
                case (1):
                    etwas = "Action needed";
                    break;
                case(2):
                    etwas="Finished";
                    break;
                case(3):
                    etwas="Later";
                    break;
                case(4):
                    etwas="To review";
                    break;
            }
            System.out.println("etwas = " + etwas);
        }
        String xpath0 = "//span[contains(text(),'" + etwas + "')]";
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        webElement.click();

    }


    @Then("{string} should display inside the {string} under {string}")
    public void shouldDisplayInsideTheUnder(String arg0, String arg1, String arg2) {
        arg0=etwas;
        System.out.println("arg0 = " + arg0);
        String xpath0 = "//*[contains(text(),'" + arg2 + "')]/../..//*[contains(text(),'" + arg1 + "')]/../../..//*[contains(text(),'" + arg0 + "')]";
        WebElement webElement = Driver.getDriver().findElement(By.xpath(xpath0));
        Assert.assertTrue(webElement.isDisplayed());

    }
}
