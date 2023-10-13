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
    public WebElement getHeaderTitle(){
        return driver.findElement(By.className("app_logo"));
    }
    public String getHeaderTitleText(){
        return getHeaderTitle().getText();
    }

    public WebElement getHamburgerMenuButton(){
        return driver.findElement(By.id("react-burger-menu-btn"));
    }

    public void clickOnHamburgerMenuButton(){
        getHamburgerMenuButton().click();
    }

    public WebElement getShoppingCartBadge(){
        return driver.findElement(By.className("shopping_cart_badge"));
    }

    public String getShoppingCartBadgeText(){
        return getShoppingCartBadge().getText();
    }

    public WebElement getSubHeaderTitle(){
        return driver.findElement(By.className("title"));
    }
    public String getSubHeaderTitleText(){
        return getSubHeaderTitle().getText();
    }

}
