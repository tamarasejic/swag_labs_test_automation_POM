package tests;

import org.testng.annotations.Test;
import retry.SwagLabsRetry;

public class CartTests extends BasicTest{

    @Test (priority = 1, retryAnalyzer = SwagLabsRetry.class)
        public void verifyTheUrl() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();

        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();

        urlPage.waitForCurrentPageToBeCartPage();
}

}
