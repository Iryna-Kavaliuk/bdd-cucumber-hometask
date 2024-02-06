package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableSteps {

  @Given("I set parameters for {string} program")
  public void i_set_parameters_for_program(String string, DataTable dataTable) {
    List<Map<String, String>> CalculationData = dataTable.asMaps(String.class, String.class);
    for (Map<String, String> ProductParameters: CalculationData) {
      for (Map.Entry<String, String> ProductParameter: ProductParameters.entrySet()) {
        System.out.print("Parameter:" + ProductParameter.getKey());
        System.out.println(": " + ProductParameter.getValue());
      }
    }
  }

  @When("I click Estimate button")
  public void i_click_estimate_button() {
  }

  @Then("Estimated price is {string};")
  public void estimated_price_is(String string) {
  }
}
