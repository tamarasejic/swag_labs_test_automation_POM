package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartBodyPage extends BasicPage{
    public CartBodyPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public List<WebElement> cartItemsAdded(){
        return driver.findElements(By.className("cart_item"));
    }

    public int numberOfItemsAdded(){
        return cartItemsAdded().size();
    }

    public WebElement getProductInCartByProductNameText(String productName) {
        String selector = "//*[text()='" + productName + "']/../../..";
        return driver.findElement(By.xpath(selector));
    }

    public boolean doesProductInCartExistByProductNameText(String productName){
        wait
                .withMessage(productName + " is not visible.")
                .until(ExpectedConditions.visibilityOf
                        (getProductInCartByProductNameText(productName)));
        return true;
    }

    public boolean doesItemsTitleExist(){
        return elementExists(By.className("inventory_item_name"), 1);
    }
    public boolean doesItemsDescriptionExist(){
        return elementExists(By.className("inventory_item_desc"), 1);
    }
    public boolean doesItemsPriceExist(){
        return elementExists(By.className("inventory_item_price"), 1);
    }
    public boolean doesItemsQuantityExist(){
        return elementExists(By.className("cart_quantity"), 1);
    }

    public WebElement getProductTitleInCartByProductNameText(String productName) {
        String selector = "//*[text()='" + productName + "']";
        return driver.findElement(By.xpath(selector));
    }
    public boolean isProductTitleInCartByProductNameTextClickable(String productName){
        wait
                .withMessage(productName + " title is not clickable.")
                .until(ExpectedConditions.elementToBeClickable
                        (getProductTitleInCartByProductNameText(productName)));
        return true;
    }
    public void clickOnProductTitleInCartByProductNameText(String productName) {
        getProductTitleInCartByProductNameText(productName).click();
    }

    public WebElement getRemoveButtonInCartByProductNameText(String productName) {
        String idContains = productName.toLowerCase().replace(" ", "-");
        String selector = "//button[contains(@id, 'remove-" + idContains + "')]";
        return driver.findElement(By.xpath(selector));
    }

    public boolean isRemoveButtonInCartByProductNameTextVisible(String productName){
        wait
                .withMessage(productName + " remove button is not visible.")
                .until(ExpectedConditions.visibilityOf
                        (getRemoveButtonInCartByProductNameText(productName)));
        return true;
    }

    public void clickOnRemoveButtonInCartByProductNameText(String productName) {
        getRemoveButtonInCartByProductNameText(productName).click();
    }

    public boolean doesProductInCartByProductNameTextExist(String productName){
        String selector = "//*[text()='" + productName + "']/../../..";
        return elementExists(By.xpath(selector),1);
    }

    public WebElement getContinueButton(){
        return driver.findElement(By.id("continue-shopping"));
    }

    public boolean isContinueButtonVisible(){
        wait
                .withMessage("Continue shopping button is not visible.")
                .until(ExpectedConditions.visibilityOf(getContinueButton()));
        return true;
    }


}
