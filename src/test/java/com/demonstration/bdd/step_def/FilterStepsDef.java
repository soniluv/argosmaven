package com.demonstration.bdd.step_def;

import com.demonstration.bdd.page_objects.HeaderPage;
import com.demonstration.bdd.page_objects.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;

public class FilterStepsDef {

    HeaderPage headerPage = new HeaderPage();
    ResultsPage resultsPage = new ResultsPage();


    @When("^I select a product$")
    public void i_select_a_product() throws Throwable {

    }

    @When("^I add product to basket$")
    public void i_add_product_to_basket() throws Throwable {

    }

    @Then("^I should see product in basket$")
    public void i_should_see_product_in_basket() throws Throwable {

    }
    @Given("^when I am on the home page$")
    public void when_I_am_on_the_home_page() throws Throwable {

    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String product) throws Throwable {
        headerPage.doSearch(product);
    }

    @When("^I select a filter \"([^\"]*)\"$")
    public void i_select_a_filter(String filterValue) throws Throwable {
        resultsPage.selectFilter(filterValue);

    }

    @Then("^I should see results filtered by \"([^\"]*)\"$")
    public void i_should_see_results_filtered_by(Double expectedValue) throws Throwable {
        List<Double> actualList= resultsPage.getAllReviewRatings();
        assertThat(actualList, everyItem(greaterThan(expectedValue)));
    }


    @Given("^I have registered for argos$")
    public void i_have_registered_for_argos() throws Throwable {

    }

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {

    }

    @When("^I input my username and password$")
    public void i_input_my_username_and_password() throws Throwable {

    }

    @When("^I click on submit button$")
    public void i_click_on_submit_button() throws Throwable {

    }

    @Then("^I should see welcome message with my name$")
    public void i_should_see_welcome_message_with_my_name() throws Throwable {

    }

}
