package stepdefinitions;

import com.epam.ta.page.GoogleCloudHomePage;
import com.epam.ta.page.GoogleCloudPricingCalculatorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.epam.ta.driver.DriverSingleton.getDriver;
import static stepdefinitions.SearchCloudProductCalculatorPageSteps.RESULTING_TERM;
import static stepdefinitions.SearchCloudProductCalculatorPageSteps.SEARCH_TERM;

public class CloudProductManagementSteps {

  private GoogleCloudHomePage homePage;
  private GoogleCloudPricingCalculatorPage calculatorPage;

  @Given("I open cloud product calculator")
    public void i_open_cloud_product_calculator() {
      homePage = new GoogleCloudHomePage(getDriver());
      homePage.openPage();
      homePage.enterSearchTerm(SEARCH_TERM);
      String targetLink = homePage.findTargetingLinkInSearchResults(RESULTING_TERM);
      calculatorPage = homePage.navigateWithTargetingLinkFromSearchResults(targetLink);
      calculatorPage.openPage();
      calculatorPage.closeCookiesAlert();
      Assert.assertTrue(calculatorPage.isPageOpened(), "Google Cloud Calculator is failed to open");
  }
  @Given("I select {string} program")
  public void i_select_program(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @When("I specify pre-defined cloud program parameters")
  public void i_specify_pre_defined_cloud_program_parameters() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @Then("I get cloud product estimated price")
  public void i_get_cloud_product_estimated_price() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
}
