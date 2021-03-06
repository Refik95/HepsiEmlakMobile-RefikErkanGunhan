package com.hepsiemlak.Base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
    WebDriver driver = null;
    WebDriverWait wait = null;
    static Actions actions =null;

    public BasePage(WebDriver driver){
        this.driver=driver;
        this.actions=new Actions(driver);
        this.wait= new WebDriverWait(driver,60);
    }

    public BasePage() {

    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void sendKeys(By by,String text){
        findElement(by).sendKeys(text);
    }

    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public String getText(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getText();
    }

    public boolean isVisible(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        WebElement webElement = driver.findElement(by);
        return webElement.isDisplayed();
    }
    public void scrollDownToElement(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDownToElementAndClick(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    public void waitForOneSecond() throws InterruptedException {
        Thread.sleep(1000);
    }
    public void waitForTwoSeconds() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void waitForThreeSeconds() throws InterruptedException {
        Thread.sleep(3000);
    }

    public void waitForFiveSeconds() throws InterruptedException {
        Thread.sleep(5000);
    }
}
