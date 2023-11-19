package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://salata123.github.io";
    private WebDriver driver;

    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
    }

    public String createCrudAppTestTask() throws InterruptedException {
        Random random = new Random();
        final String XPATH_TASK_NAME = "//form[contains(@action,\"https://tasks--michaluwu.repl.co/v1/tasks\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"https://tasks--michaluwu.repl.co/v1/tasks\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"https://tasks--michaluwu.repl.co/v1/tasks\")]/fieldset[3]/button";
        String taskName = "Task number " + random.nextInt(100000);            // [1]
        String taskContent = taskName + " content";                              // [2]

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);                                                 // [3]

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);                                           // [4]

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));   // [5]
        addButton.click();                                                       // [6]
        Thread.sleep(2000);                                                      // [7]

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();                                         // [1]

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());   // [2]

        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()           // [3]
                .filter(anyForm ->                                             // [4]
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")) // [5]
                                .getText().equals(taskName))                        // [6]
                .forEach(theForm -> {                                          // [7]
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));    // [8]
                    Select select = new Select(selectElement);                 // [9]
                    select.selectByIndex(1);                                   // [10]

                    WebElement buttonCreateCard =                              // [11]
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]")); // [12]
                    buttonCreateCard.click();                                  // [13]
                });                                                            // [14]
        Thread.sleep(5000);                                                  // [15]
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);	// [1]
        driverTrello.get(TRELLO_URL);                                                // [2]

        driverTrello.findElement(By.id("user")).sendKeys("salatman13@gmail.com");		        // [3]
        driverTrello.findElement(By.cssSelector("input[id='login']")).click();

        Thread.sleep(4000);								                            // [8]

        driverTrello.findElement(By.id("password")).sendKeys("passwrod");		    // [7]
        driverTrello.findElement(By.cssSelector("span[class='css-178ag6o']")).click();
        Thread.sleep(4000);								                            // [8]

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()   // [9]
                .filter(aHref -> !aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).isEmpty())  // [10]
                .forEach(WebElement::click);						                        // [11]

        Thread.sleep(4000);								                            // [12]

        result = driverTrello.findElements(By.cssSelector("a[data-testid='card-name']")).stream()		        // [13]
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));    		        // [14]

        driverTrello.close();							                            // [15]

        return result;
    }

    private void deleteTestCase(String taskName) throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm ->
                            theForm.findElement(By.cssSelector("button[data-task-delete-button='']")).click());
        Thread.sleep(2000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));   // [1]
        deleteTestCase(taskName);
    }
}