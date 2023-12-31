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

    public boolean isOptionSpellingCorrect(int optionIndex, String correctSpelling){
        wait
                .withMessage("Correct spelling should be " + correctSpelling)
                .until(ExpectedConditions.textToBePresentInElement(getMenuOptions().get(optionIndex), correctSpelling));
        return true;
    }

    public WebElement getAllItemsOption(){
        return driver.findElement(By.id("inventory_sidebar_link"));
    }
    public void clickOnAllItemsOption(){
       getAllItemsOption().click();
    }

    public WebElement getAboutOptionButton(){
        return driver.findElement(By.id("about_sidebar_link"));
    }
    public void clickOnAboutOptionButton(){
        getAboutOptionButton().click();
    }

    public WebElement getLogoutOptionButton(){
        return driver.findElement(By.id("logout_sidebar_link"));
    }
    public void clickOnLogoutOptionButton(){
        getLogoutOptionButton().click();
    }

    public WebElement getResetAppStateOptionButton(){
        return driver.findElement(By.id("reset_sidebar_link"));
    }
    public void clickOnResetAppStateOptionButton(){
        getResetAppStateOptionButton().click();
    }

    public WebElement getEkisButtonOption(){
        return driver.findElement(By.id("react-burger-cross-btn"));
    }
    public void clickOnEkisButtonOption(){
        getEkisButtonOption().click();
    }

    public boolean isLeftMenuWindowInvisible(){
        wait
                .withMessage("Left menu window should be closed.")
                .until(ExpectedConditions.invisibilityOf(getLeftMenuWindow()));
        return true;
    }

}
