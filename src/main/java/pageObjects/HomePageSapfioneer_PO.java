package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePageSapfioneer_PO extends Base_PO {
    public HomePageSapfioneer_PO() {
        super();
    }

    private @FindBy(id = "menu-item-29961")
    WebElement menuBankingButton;

    private @FindBy(id = "menu-item-29972")
    WebElement menuInsuranceButton;
    private @FindBy(id = "menu-item-29979")
    WebElement menuFinanceAndEsgButton;

    private @FindBy(id = "menu-item-29985")
    WebElement menuServicesButton;

    private @FindBy(id = "menu-item-26")
    WebElement menuPartnersButton;

    private @FindBy(id = "menu-item-26834")
    WebElement menuCompanyButton;

    private @FindBy(id = "menu-item-26831")
    WebElement menuResourcesButton;

    private @FindBy(xpath = "//div[@id='col-992648666']//a[@href='/finance-esg/financial-control']")
    WebElement financialControlLearnMoreButton;

    private @FindBy(xpath = "//*[@id='masthead']//a[@href='/contact/']")
    WebElement getInTouchMenuButton;


    public void verifyMainPageMenuButtons() {
        Assert.assertTrue(menuBankingButton.isDisplayed(), "The Banking button in the menu is not visible.");
        Assert.assertTrue(menuInsuranceButton.isDisplayed(), "The Insurance button in the menu is not visible.");
        Assert.assertTrue(menuFinanceAndEsgButton.isDisplayed(), "The Finance & ESG button in the menu is not visible.");
        Assert.assertTrue(menuServicesButton.isDisplayed(), "The Services button in the menu is not visible.");
        Assert.assertTrue(menuPartnersButton.isDisplayed(), "The Partners button in the menu is not visible.");
        Assert.assertTrue(menuCompanyButton.isDisplayed(), "The Company button in the menu is not visible.");
        Assert.assertTrue(menuResourcesButton.isDisplayed(), "The Resources button in the menu is not visible.");
    }

    public void clickOnFinancialControlButton() {
        financialControlLearnMoreButton.click();
    }

    public void clikOnGetInTouchButton(){
        getInTouchMenuButton.click();
    }

}
