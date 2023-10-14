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

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheCartIconIsWorking() {
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
    public void verifyIfTheCartIconHasCorrectNumberOfAddedItems() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        inventoryPage.scrollToProductName("Sauce Labs Backpack");
        inventoryPage.clickOnAddToCartButtonByProductName("Sauce Labs Backpack");

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();
        int itemsNumAfterAddToCart = cartBodyPage.numberOfItemsAdded();

        Assert.assertEquals(topNavPage
                .getShoppingCartBadgeText(),
                String.valueOf(itemsNumAfterAddToCart),
                "Number in the cart icon should be equivalent to the total numbers of added items.");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyTheSubHeaderTitle() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();

        Assert.assertEquals(topNavPage.getSubHeaderTitleText(),
                "Your Cart",
                "Sub-header title should be 'Your Cart'");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyTheTotalNumberOfMenuOptions() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        topNavPage.clickOnHamburgerMenuButton();

        Assert.assertEquals(leftNavPage.getNumberOfMenuOptions(),
                        4,
                "There should be 4 total options in menu");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyTheSpellingOfAllOptionsInMenu() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        topNavPage.clickOnHamburgerMenuButton();

        leftNavPage.isOptionSpellingCorrect(0,"All Items");
        leftNavPage.isOptionSpellingCorrect(1,"About");
        leftNavPage.isOptionSpellingCorrect(2,"Logout");
        leftNavPage.isOptionSpellingCorrect(3,"Reset App");

    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfAllItemsOptionIsWorking() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        topNavPage.clickOnHamburgerMenuButton();
        leftNavPage.clickOnAllItemsOption();

        Assert.assertEquals(topNavPage.getSubHeaderTitleText(),
                "Products",
                "User should be redirected to the products page");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfAboutOptionIsWorking() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        topNavPage.clickOnHamburgerMenuButton();
        leftNavPage.clickOnAboutOptionButton();

        Assert.assertEquals(driver.getCurrentUrl(),
                "https://saucelabs.com/",
                "User should be redirected to the the sauce labs website");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfLogoutOptionIsWorking() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        topNavPage.clickOnHamburgerMenuButton();
        leftNavPage.clickOnLogoutOptionButton();

        Assert.assertTrue(loginPage.getLoginForm().isDisplayed(),
                "User should be logged out and redirected to the login page");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfResetAppStateIsWorking() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        topNavPage.clickOnHamburgerMenuButton();
        leftNavPage.clickOnResetAppStateOptionButton();

        Assert.assertFalse(topNavPage.doesShoppingCartBadgeExist(),
                "The state of web app should reset - cart badge reset.");
    }

}
