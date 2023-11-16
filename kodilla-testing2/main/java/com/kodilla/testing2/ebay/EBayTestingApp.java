package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EBayTestingApp {
    public static final String SEARCHFIELD = "_nkw";

    public static void main(String[] args) {

        WebDriver driverFirefox = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverFirefox.get("https://www.ebay.com");

        WebElement searchField = driverFirefox.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Laptop");
        searchField.submit();

        WebDriver driverChrome = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverChrome.get("https://www.ebay.com");

        WebElement searchField2 = driverChrome.findElement(By.name(SEARCHFIELD));
        searchField2.sendKeys("Laptop");
        searchField2.submit();
    }
}