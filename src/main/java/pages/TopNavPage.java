package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopNavPage extends BasicPage{
    public TopNavPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getCartButton(){
        return driver.findElement(By.className("shopping_cart_link"));
    }
    public void clickOnCartButton(){
        getCartButton().click();
    }

}
