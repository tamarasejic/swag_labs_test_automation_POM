package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

}
