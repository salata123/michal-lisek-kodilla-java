package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class FacebookTestingApp {
    public static final String CSS_SELECTOR_COOKIES = "button[data-cookiebanner='accept_only_essential_button']";
    public static final String CSS_SELECTOR_REGISTRATION = "a[data-testid='open-registration-form-button']";
    public static final String CSS_SELECTOR_FIRSTNAME_INPUT = "input[name='firstname']";
    public static final String CSS_SELECTOR_LASTNAME_INPUT = "input[name='lastname']";
    public static final String CSS_SELECTOR_PASSWORD_INPUT = "input[id='password_step_input']";
    public static final String CSS_SELECTOR_BIRTHDAY_DAY = "select[id='day']";
    public static final String CSS_SELECTOR_BIRTHDAY_MONTH = "select[id='month']";
    public static final String CSS_SELECTOR_BIRTHDAY_YEAR = "select[id='year']";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(1, ChronoUnit.SECONDS));

        driver.findElement(By.cssSelector(CSS_SELECTOR_COOKIES)).click();

        driver.findElement(By.cssSelector(CSS_SELECTOR_REGISTRATION)).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(CSS_SELECTOR_FIRSTNAME_INPUT)));
        WebElement firstnameInput = driver.findElement(By.cssSelector(CSS_SELECTOR_FIRSTNAME_INPUT));
        firstnameInput.sendKeys("TestFirstname");

        WebElement lastnameInput = driver.findElement(By.cssSelector(CSS_SELECTOR_LASTNAME_INPUT));
        lastnameInput.sendKeys("TestLastname");

        WebElement passwordInput = driver.findElement(By.cssSelector(CSS_SELECTOR_PASSWORD_INPUT));
        passwordInput.sendKeys("Password123!@#");

        WebElement selectDay = driver.findElement(By.cssSelector(CSS_SELECTOR_BIRTHDAY_DAY));
        Select selectBoardDay = new Select(selectDay);
        selectBoardDay.selectByIndex(4);

        WebElement selectMonth = driver.findElement(By.cssSelector(CSS_SELECTOR_BIRTHDAY_MONTH));
        Select selectBoardMonth = new Select(selectMonth);
        selectBoardMonth.selectByIndex(6);

        WebElement selectYear = driver.findElement(By.cssSelector(CSS_SELECTOR_BIRTHDAY_YEAR));
        Select selectBoardYear = new Select(selectYear);
        selectBoardYear.selectByIndex(31);
    }
}