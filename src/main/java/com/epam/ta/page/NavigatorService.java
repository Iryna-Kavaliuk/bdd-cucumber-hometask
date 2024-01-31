package com.epam.ta.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.epam.ta.driver.DriverSingleton.getDriver;

public interface NavigatorService extends LocatorService {

  default void scrollToElement(By by) {
    WebElement element = getDriver().findElement(by);
    ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", element);
  }

  default void clickToElement(By by) {
    WebElement element = getDriver().findElement(by);
    ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
  }

}
