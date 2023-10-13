package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LeftNavPage extends BasicPage{
    public LeftNavPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getLeftMenuWindow(){
        return driver.findElement(By.className("bm-menu"));
    }

    public List<WebElement> getMenuOptions(){
        return driver.findElements(By.className("menu-item"));
    }

    public int getNumberOfMenuOptions(){
        return getMenuOptions().size();
    }

}
