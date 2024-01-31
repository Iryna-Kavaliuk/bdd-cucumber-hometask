package com.epam.ta.page;

import org.openqa.selenium.By;

import static com.epam.ta.driver.DriverSingleton.getDriver;

public interface AlertService {

  By cookiesAlert = By.className("glue-cookie-notification-bar__accept");

  default void closeCookiesAlert() {
    getDriver().findElement(cookiesAlert).click();
  }
}
