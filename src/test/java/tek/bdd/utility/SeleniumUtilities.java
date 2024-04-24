package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtilities extends BaseSetup {
    private WebDriverWait getwait(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
       return wait;

    }
    public void clickElement(By locator) {


            getwait().until(ExpectedConditions.elementToBeClickable(locator)).click();

        }
        public String getElementText(By locator){
       String text= getwait().
               until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
       return text;
        }
        public boolean isElementEnabled(By locator){
        boolean isEnabled=getwait().until(ExpectedConditions.
                presenceOfElementLocated(locator)).isEnabled();
        return isEnabled;
        }
        public void SendTextToElement(By locator,String text){
        getwait().until(ExpectedConditions.visibilityOfElementLocated(locator)).
                sendKeys(text);

        }
        public boolean IsElementDisplayed(By locator){
         return getwait().until(ExpectedConditions.visibilityOfElementLocated(locator)).
                isDisplayed();


        }
    }
