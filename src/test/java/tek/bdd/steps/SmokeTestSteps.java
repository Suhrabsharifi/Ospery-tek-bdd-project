package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtilities;

import java.time.Duration;

public class SmokeTestSteps extends SeleniumUtilities {
    @Then("validate top left corner is {string}")
    public void validateTopLfetCorner(String expectedtitle){

        String actualtext= getElementText(HomePage.Top_NAV_LOg);

        Assert.assertEquals(expectedtitle,actualtext);

    }
    @Then("validate sign in button is enabled")
    public void validateSinButtonIsEnabled() {
        boolean isButtonEnalbed=isElementEnabled(HomePage.Sign_In_Button);
        Assert.assertTrue(isButtonEnalbed);

    }


}
