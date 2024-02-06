package stepdefinitions;

import com.epam.ta.cloudProductFactory.ComputeEngineProduct;
import com.epam.ta.driver.DriverSingleton;
import com.epam.ta.page.GoogleCloudPricingCalculatorPage;
import com.epam.ta.service.ComputeEngineProductBuilder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static stepdefinitions.SearchCloudProductCalculatorPageSteps.RESULTING_TERM;
import static stepdefinitions.SearchCloudProductCalculatorPageSteps.SEARCH_TERM;

public class CloudProductManagementSteps {

  protected WebDriver driver;
  private GoogleCloudPricingCalculatorPage calculatorPage;
  ComputeEngineProduct testProduct;

  @Given("I open calculator legacy page")
  public void i_open_calculator_legacy_page() {
    driver = DriverSingleton.getDriver();
    calculatorPage = new GoogleCloudPricingCalculatorPage(driver);
    calculatorPage.openPage();
  }

  @Then("I validate that page navigates to {string}")
  public void i_validate_that_page_navigates_to(String string) {
    calculatorPage.closeCookiesAlert();
    Assert.assertTrue(calculatorPage.isPageOpened(), "Google Cloud Calculator is failed to open");
  }

  @Given("I select {string} program")
  public void i_select_program(String string) {
    testProduct = (ComputeEngineProduct) ComputeEngineProductBuilder.withAllDataFromProperty();
    calculatorPage.activateProductType(testProduct.getProductType());
  }
  @Given("I enter Operating System as Free: Debian, CentOS")
  public void i_enter_operating_system_as_free_debian_cent_os() {
    calculatorPage.enterOperatingSystems(testProduct.getOperatingSystem());
  }
  @Given("I enter Provisioning Model parameters as Regular")
  public void i_enter_provisioning_model_parameters_as_regular() {
    calculatorPage.enterProvisioningModel(testProduct.getProvisioningModel());
  }
  @Given("I enter Number Of Instances as {int}")
  public void i_enter_number_of_instances_as(Integer int1) {
    calculatorPage.enterNumberOfInstances(testProduct.getNumberOfInstances());
  }
  @Given("I enter Series as N1")
  public void i_enter_series_as_n1() {
    calculatorPage.enterSeries(testProduct.getSeries());
  }
  @Given("I enter Machine Type as n1-standard-{int}")
  public void i_enter_machine_type_as_n1_standard(Integer int1) {
    calculatorPage.enterMachineType(testProduct.getMachineType());
  }
  @Given("I enter Gpu Type as NVIDIA Tesla T4")
  public void i_enter_gpu_type_as_nvidia_tesla_t4() {
    calculatorPage.checkAddGPUsCheckbox();
    calculatorPage.enterGpuType(testProduct.getGpuType());
  }
  @Given("I enter Number Of Gpu as {int}")
  public void i_enter_number_of_gpu_as(Integer int1) {
    calculatorPage.enterGpuNumber(testProduct.getNumberOfGPU());
  }
  @Given("I enter Local Ssd as 2x375 GB")
  public void i_enter_local_ssd_as_2x375_gb() {
    calculatorPage.enterLocalSSD(testProduct.getLocalSSD());
  }
  @Given("I enter Datacenter Location as Frankfurt \\(europe-west3)")
  public void i_enter_datacenter_location_as_frankfurt_europe_west3() {
    calculatorPage.enterDataCenterLocation(testProduct.getDataCenterLocation());
  }
  @Given("I enter Committed Usage as {int} Year")
  public void i_enter_committed_usage_as_year(Integer int1) {
    calculatorPage.enterCommittedUsage(testProduct.getCommittedUsage());
  }
  @Given("I click {string} button")
  public void i_click_button(String string) {
    calculatorPage.clickAddToEstimateButton();
  }

  @Then("Estimated price is {double} \\/ mo")
  public void estimated_price_is_mo(Double double1) {
    Assert.assertEquals(calculatorPage.getEstimationResult(), testProduct.calculateProductPrice(),
        "Estimations got manually and automatically are different!");
  }
}
