package azure.net.hfp.recoveries.stepDefinitions;

import azure.net.hfp.recoveries.pages.BasePage;
import azure.net.hfp.recoveries.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SubmitLBASteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    @Given("I navigate to Recoveries portal")
    public void i_navigate_to_recoveries_portal() {
        homePage.launchURL();
    }

    @And("I enter my username")
    public void iEnterMyUsername() {
        homePage.enterUserName("Ola.ajibola@h-f.co.uk");
    }


    @Given("I enter my password")
    public void i_enter_my_password() throws InterruptedException {
        homePage.enterPassword("@Fisherman01");
Thread.sleep(50);
    }

    @When("I enter a {string}")
    public void i_enter_a(String string) {

    }

    @When("I select the correct {string} from the dropdown list")
    public void i_select_the_correct_from_the_dropdown_list(String string) {

    }

    @When("I click on next step")
    public void i_click_on_next_step() {

    }

    @When("I enter the {string}")
    public void i_enter_the(String string) {

    }

    @When("I select policyholder {string}")
    public void i_select_policyholder(String string) {

    }

    @When("I enter the policyholder {string}")
    public void i_enter_the_policyholder(String string) {

    }

    @When("I click on the next step")
    public void i_click_on_the_next_step() {

    }

    @When("I select {string}")
    public void i_select(String string) {

    }

    @When("I select Yes to question {string}")
    public void i_select_yes_to_question(String string) {

    }

    @When("I select No to do you know TP address")
    public void i_select_no_to_do_you_know_tp_address() {

    }

    @When("I select Yes to knowing TP vehicle reg")
    public void i_select_yes_to_knowing_tp_vehicle_reg() {

    }

    @When("I enter {string}")
    public void i_enter(String string) {

    }

    @When("I click on the next step again")
    public void i_click_on_the_next_step_again() {

    }

    @When("I select Yes to Ripe insurer")
    public void i_select_yes_to_ripe_insurer() {

    }

    @Then("the summary page is displayed")
    public void the_summary_page_is_displayed() {

    }

    @Then("I click on the submit button")
    public void i_click_on_the_submit_button() {

    }

    @Then("my submission reference is displayed")
    public void my_submission_reference_is_displayed() {


    }


}
