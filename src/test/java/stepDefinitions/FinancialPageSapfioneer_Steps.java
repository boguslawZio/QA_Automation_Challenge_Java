package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.FinancialSapfioneer_PO;

public class FinancialPageSapfioneer_Steps {
    private FinancialSapfioneer_PO financialSapfioneer_PO;

    public FinancialPageSapfioneer_Steps(FinancialSapfioneer_PO financialSapfioneer_PO) {
        this.financialSapfioneer_PO = financialSapfioneer_PO;
    }

    @Then("The user will be redirect to the correct Financial Control page")
    public void theUserWillBeRedirectToTheCorrectFinancialControlPage() {
        financialSapfioneer_PO.verifyFinancialControlRedirection();
    }


}