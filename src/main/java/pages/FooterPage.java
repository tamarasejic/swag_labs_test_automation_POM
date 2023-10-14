package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterPage extends BasicPage{
    public FooterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getTwitterButton(){
        return driver.findElement(By.className("social_twitter"));
    }

    public boolean isTwitterButtonVisible(){
        wait
                .withMessage("Twitter button is not visible.")
                .until(ExpectedConditions.visibilityOf(getTwitterButton()));
        return true;
    }

    public WebElement getFacebookButton(){
        return driver.findElement(By.className("social_facebook"));
    }

    public boolean isFacebookButtonVisible(){
        wait
                .withMessage("Facebook button is not visible.")
                .until(ExpectedConditions.visibilityOf(getFacebookButton()));
        return true;
    }

}
