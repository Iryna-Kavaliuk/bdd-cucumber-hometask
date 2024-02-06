package testrunners;

import com.epam.ta.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners({com.epam.ta.utils.TestListener.class})
public class CommonConditions {
  protected WebDriver driver;

  @BeforeClass
  public void setupBrowser() {
    driver = DriverSingleton.getDriver();
  }

  @AfterClass(alwaysRun = true)
  public void stopBrowser() {
    DriverSingleton.closeDriver();
  }
}
