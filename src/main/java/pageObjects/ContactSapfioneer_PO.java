package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static utils.Global_Vars.HOMEPAGE_URL;

public class ContactSapfioneer_PO extends Base_PO {
    public ContactSapfioneer_PO() {
        super();
    }

    private @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    private @FindBy(css = "div[class^=\"hs_firstname \"] label[class^=\"hs-error-msg\"]")
    WebElement firstNameMessage;

    private @FindBy(xpath = "//h5[text()='Quicklinks']")
    WebElement carrers;


    public void verifyRedirectionToContactPage() {
        String CONTACT_URL = HOMEPAGE_URL + "contact/";

        Assert.assertEquals(getDriver().getCurrentUrl(), CONTACT_URL, "Button Get in touch - redirect to wrong page.");
    }

    public void clickOnSubmitButton() {
        scroolDownByPixels(800);
        getDriver().switchTo().frame("hs-form-iframe-0");
        waitForWebElementAndClick(submitButton);
    }

    public void verifyEmptyFieldMessages() {
        waitFor(firstNameMessage);
        Assert.assertEquals(firstNameMessage.getText(), "Please complete this required field.");
        //#TODO add other message verification !!
    }
}
