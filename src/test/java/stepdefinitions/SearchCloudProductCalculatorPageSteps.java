package stepdefinitions;

import com.epam.ta.driver.DriverSingleton;
import com.epam.ta.page.GoogleCloudHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SearchCloudProductCalculatorPageSteps {
  protected WebDriver driver;
  protected GoogleCloudHomePage homePage;

  protected static final String SEARCH_TERM = "Google Cloud Platform Pricing Calculator";
  protected static final String RESULTING_TERM = "Google Cloud Pricing Calculator";

  @Given("I open cloud product home page")
  public void i_open_cloud_product_home_page() {
    driver = DriverSingleton.getDriver();
    homePage = new GoogleCloudHomePage(driver);
    homePage.openPage();
  }

  @When("I enter {string}")
  public void i_enter(String string) {
    homePage.enterSearchTerm(SEARCH_TERM);
  }

  @Then("I find {string} in Search results")
  public void i_find_in_search_results(String string) {
    String targetLink = homePage.findTargetingLinkInSearchResults(RESULTING_TERM);
    System.out.println(targetLink);
  }
}
