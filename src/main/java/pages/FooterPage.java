package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public WebElement getLinkedinButton(){
        return driver.findElement(By.className("social_linkedin"));
    }

    public boolean isLinkedinButtonVisible(){
        wait
                .withMessage("Linkedin button is not visible.")
                .until(ExpectedConditions.visibilityOf(getLinkedinButton()));
        return true;
    }

    public void clickOnTwitterButton(){
        getTwitterButton().click();
    }

    public WebElement getFooter(){
        return driver.findElement(By.className("footer"));
    }

    public void scrollToFooter()  {
        new Actions(driver)
                .scrollToElement(getFooter())
                .perform();
    }

    public void clickOnFacebookButton(){
        getFacebookButton().click();
    }


}
