package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.HomePageSapfioneer_PO;

import static utils.Global_Vars.HOMEPAGE_URL;

public class HomePageSapfioneer_Steps extends Base_PO {
    private HomePageSapfioneer_PO homePageSapfioneer_PO;

    public HomePageSapfioneer_Steps(HomePageSapfioneer_PO homePageSapfioneer_PO) {
        this.homePageSapfioneer_PO = homePageSapfioneer_PO;
    }

    @Then("All of the Main Page Menu Buttons are visible")
    public void i_enter_a_specific_comment() {
        homePageSapfioneer_PO.verifyMainPageMenuButtons();
    }

    @Given("I access the sapfioneer page")
    public void iAccessTheSapfioneerPage() {
        navigateTo_URL(HOMEPAGE_URL);
    }

    @When("The user click on Financial Control")
    public void theUserClickOnFinancialControl() {
        homePageSapfioneer_PO.clickOnFinancialControlButton();
    }

    @When("The user click on Get in touch button")
    public void theUserClickOnGetInTouchButton() {
        homePageSapfioneer_PO.clikOnGetInTouchButton();
    }
}