package hooks;

import com.epam.ta.driver.DriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class CloudProductHooks {
  protected WebDriver driver;

  @Before
  public void setupBrowser() {
    driver = DriverSingleton.getDriver();
  }

  @After
  public void stopBrowser() {
    DriverSingleton.closeDriver();
  }

}
