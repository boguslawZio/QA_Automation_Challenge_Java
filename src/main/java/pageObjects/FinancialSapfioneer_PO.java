package pageObjects;

import org.testng.Assert;

import static utils.Global_Vars.HOMEPAGE_URL;

public class FinancialSapfioneer_PO extends Base_PO {
    public FinancialSapfioneer_PO() {
        super();
    }

    String FINANCIAL_CONTROL_URL = HOMEPAGE_URL + "finance-esg/financial-control/";

    public void verifyFinancialControlRedirection() {
        Assert.assertEquals(getDriver().getCurrentUrl(), FINANCIAL_CONTROL_URL, "Button Finance redirect to wrong page.");
    }
}
