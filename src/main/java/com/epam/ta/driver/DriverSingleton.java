package com.epam.ta.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.System.*;

public class DriverSingleton {

  private static WebDriver driver;

  public static WebDriver getDriver() {
    if(driver == null) {
      init();
    }
    return driver;
  }

  private static void init() {
    switch (getProperty("browser")){
      case "firefox": {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        break;
      }
      default: {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      }
    }
    driver.manage().window().maximize();
  }

  public static void closeDriver() {
    driver.quit();
    driver = null;
  }
}
