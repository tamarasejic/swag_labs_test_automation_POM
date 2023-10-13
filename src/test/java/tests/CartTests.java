package tests;

import org.testng.Assert;
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

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyTheTitlePage() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        inventoryPage.scrollToProductName("Sauce Labs Backpack");
        inventoryPage.clickOnAddToCartButtonByProductName("Sauce Labs Backpack");

        topNavPage.clickOnCartButton();

        Assert.assertEquals(driver.getTitle(),
                "Swag Labs",
                "Page title should be Swag Labs");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyTheTitleInHeader() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();

        Assert.assertEquals(topNavPage.getHeaderTitleText(),
                "Swag Labs",
                "Header title should be Swag Labs");
    }

}
