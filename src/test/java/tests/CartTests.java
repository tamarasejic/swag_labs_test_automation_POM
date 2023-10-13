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

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheHamburgerMenuButtonIsPresented() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        Assert.assertTrue(topNavPage.getHamburgerMenuButton().isDisplayed(),
                "Hamburger menu button should be presented.");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheCartIconIsPresented() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        Assert.assertTrue(topNavPage.getCartButton().isDisplayed(),
                "Cart icon should be presented.");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheHamburgerMenuButtonIsEnabled() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        topNavPage.clickOnHamburgerMenuButton();
        Assert.assertTrue(topNavPage.getHamburgerMenuButton().isEnabled(),
                "Hamburger menu button should be enabled after click.");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheCartIconIsEnabled() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        topNavPage.clickOnCartButton();
        Assert.assertTrue(topNavPage.getCartButton().isEnabled(),
                "Cart icon should be enabled after click.");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheHamburgerButtonIsWorking() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        topNavPage.clickOnHamburgerMenuButton();

        Assert.assertTrue(leftNavPage.getLeftMenuWindow()
                        .isDisplayed(),
                "User should see the left navigation menu.");
    }

}
