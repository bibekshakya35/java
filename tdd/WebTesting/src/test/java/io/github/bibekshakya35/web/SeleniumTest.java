package io.github.bibekshakya35.web;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author bibek
 */
public class SeleniumTest {
    
    @Test
    public void wikipediaSearchFeature() throws InterruptedException {
        
        //declare web driver for web browser using
        WebDriver driver = new FirefoxDriver();
        //open wikimedia pages
        driver.get("http://en.wikipedia.org/wiki/Main_Page");
       
        WebElement query = driver.findElement(By.name("search"));
        //searching TDD
        query.sendKeys("Test-driven development");
        WebElement goButton = driver.findElement(By.name("go"));
        goButton.click();
        //check
        Assert.assertThat(driver.getTitle(), CoreMatchers.startsWith("Test-driven development"));
        driver.quit();
    }
}
