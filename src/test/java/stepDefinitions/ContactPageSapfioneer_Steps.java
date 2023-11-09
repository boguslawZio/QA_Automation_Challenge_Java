package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.ContactSapfioneer_PO;

public class ContactPageSapfioneer_Steps {

    private ContactSapfioneer_PO contactSapfioneer_PO;

    public ContactPageSapfioneer_Steps(ContactSapfioneer_PO contactSapfioneer_PO) {
        this.contactSapfioneer_PO = contactSapfioneer_PO;
    }

    @And("The user is redirected to Get in touch page")
    public void theUserIsRedirectedToGetInTouchPage() {
        contactSapfioneer_PO.verifyRedirectionToContactPage();
    }


    @And("The user click on Submit button")
    public void theUserClickOnSubmitButton() {

        contactSapfioneer_PO.clickOnSubmitButton();
    }

    @Then("The required messages will appear")
    public void theRequiredMessagesWillAppear() {
        contactSapfioneer_PO.verifyEmptyFieldMessages();
    }
}
