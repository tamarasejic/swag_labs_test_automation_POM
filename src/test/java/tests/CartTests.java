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

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheEkisButtonIsPresented() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        topNavPage.clickOnHamburgerMenuButton();

        Assert.assertTrue(leftNavPage.getEkisButtonOption().isEnabled(),
                "Ekis button should be presented.");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheEkisButtonIsWorking() {
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.clearAndTypeUsername(username);
        loginPage.clearAndTypePassword(password);
        loginPage.clickOnLoginButton();
        urlPage.waitForCurrentPageToBeInventoryPage();

        topNavPage.clickOnCartButton();
        urlPage.waitForCurrentPageToBeCartPage();

        topNavPage.clickOnHamburgerMenuButton();
        leftNavPage.clickOnEkisButtonOption();

        Assert.assertTrue(leftNavPage.isLeftMenuWindowInvisible(),
                "It should close the left menu navigation.");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheItemsAddedIsPresented() {
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

        Assert.assertTrue(cartBodyPage
                        .doesProductInCartExistByProductNameText("Sauce Labs Backpack"),
                "Added item should be visible in the cart page");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheItemsTitleIsPresented() {
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

        Assert.assertTrue(cartBodyPage
                        .doesItemsTitleExist(),
                "Item's title should be visible");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheItemsDescriptionIsPresented() {
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

        Assert.assertTrue(cartBodyPage
                        .doesItemsDescriptionExist(),
                "Item's description should be visible");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheItemsPriceIsPresented() {
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

        Assert.assertTrue(cartBodyPage
                        .doesItemsPriceExist(),
                "Item's price should be visible");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheQuantityOfItemIsPresented() {
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

        Assert.assertTrue(cartBodyPage
                        .doesItemsQuantityExist(),
                "Quantity of an item should be visible");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheItemsTitleIsClickable() {
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

        Assert.assertTrue(cartBodyPage
                        .isProductTitleInCartByProductNameTextClickable("Sauce Labs Backpack"),
                "Item's title should be clickable");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheItemsTitleIsWorking() {
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

        cartBodyPage.clickOnProductTitleInCartByProductNameText("Sauce Labs Backpack");

        Assert.assertTrue(driver.getCurrentUrl()
                        .contains("inventory-item.html"),
                "User should be redirected to the the item's page.");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheRemoveButtonIsPresented() {
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

        Assert.assertTrue(cartBodyPage
                        .isRemoveButtonInCartByProductNameTextVisible("Sauce Labs Backpack"),
                "Remove button should be visible");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheRemoveButtonIsWorking() {
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

        cartBodyPage.clickOnRemoveButtonInCartByProductNameText("Sauce Labs Backpack");

        Assert.assertFalse(cartBodyPage
                        .doesProductInCartByProductNameTextExist("Sauce Labs Backpack"),
                "Item should be removed from the cart page");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheContinueShoppingButtonIsPresented() {
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

        Assert.assertTrue(cartBodyPage
                        .isContinueButtonVisible(),
                "Continue shopping button should be visible");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheContinueShoppingButtonIsWorking() {
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

        cartBodyPage.clickOnContinueButton();

        urlPage.waitForCurrentPageToBeInventoryPage();

        Assert.assertEquals(topNavPage.getSubHeaderTitleText(),
                "Products",
                "User should be redirected to the products page");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheCheckoutButtonIsPresented() {
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

        Assert.assertTrue(cartBodyPage
                        .isCheckoutButtonVisible(),
                "Checkout button should be visible");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheCheckoutButtonIsWorking() {
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

        cartBodyPage.clickOnCheckoutButton();

        Assert.assertTrue(driver.getCurrentUrl()
                        .contains("checkout-step-one.html"),
                "User should be redirected to the the checkout page.");
    }

    @Test (retryAnalyzer = SwagLabsRetry.class)
    public void verifyIfTheTwitterButtonIsPresented() {
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

        Assert.assertTrue(footerPage
                        .isTwitterButtonVisible(),
                "Twitter button should be visible");
    }

}
