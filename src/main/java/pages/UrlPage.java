package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class UrlPage extends BasicPage {

    public UrlPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void waitForCurrentPageToBeInventoryPage(){
        wait
                .withMessage("Successful login did not redirect to page https://www.saucedemo.com/inventory.html")
                .until(ExpectedConditions.urlContains("/inventory.html"));
    }
    public void waitForCurrentPageToBeCartPage(){
        wait
                .withMessage("Click on cart button did not redirect to page 'https://www.saucedemo.com/cart.html'")
                .until(ExpectedConditions.urlContains("/cart.html"));
    }

    public void switchTabs(int expectedWindowsCount, int switchToWindow) throws Exception {
        (new WebDriverWait(driver, Duration.ofSeconds(30)))
                .until(ExpectedConditions.numberOfWindowsToBe(expectedWindowsCount));
        ArrayList<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(switchToWindow));
    }



}
