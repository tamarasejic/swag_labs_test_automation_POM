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

}
